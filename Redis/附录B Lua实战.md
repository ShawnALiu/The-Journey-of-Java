
# 1 Lua语法

# 2 Lua实现Redis分布式锁

为了对Redis存储的数据进行排他性访问，客户端需要先访问一个锁。这个锁定义在Redis服务器中，恰好能让各个客户端看见。

## 2.1 加锁

如果键存在，则返回0；如果不存在，则设置键和值，并设置过期时间，返回1。该操作是原子操作，可以由等效命令 set key value nx ex seconds代替。

Lua脚本如下：

```lua
if redis.call('get',KEYS[1]) then 
    return 0;
else 
    redis.call('set', KEYS[1], ARGV[1]);
    redis.call('expire', KEYS[1], ARGV[2]);
    return  1;
end;
```

Redis中使用该Lua脚本：对lock进行加锁，并设置过期时间为600。

```redis
eval "if redis.call('get',KEYS[1]) then return 0;else redis.call('set',KEYS[1],ARGV[1]);redis.call('expire',KEYS[1],ARGV[2]);return  1;end;" 1 lock 1 600
```

## 2.1 释放锁

如果不存在键，则无需释放；如果存在键并且值和传入的值一致，那么删除键。成功返回1。

其他情况返回释放失败。失败返回0。

Lua脚本如下：

```lua
local v = redis.call('get', KEYS[1]);
if v then 
    -- 如果和传入的值不同，返回0表示失败
    if v~=ARGV[1] then 
        return 0;
    end;
    -- 如果和传入的值相同，删除key
    redis.call('del',KEYS[1]);
end;
return 1;
```

Redis中使用该Lua脚本：对lock进行释放。

```redis
eval "local v = redis.call('get',KEYS[1]);if v then if v~=ARGV[1] then return 0;end;redis.call('del',KEYS[1]);end;return 1;" 1 lock 1
```

## 2.3 示例

![](../assets/images/Redis/B/1.png)
