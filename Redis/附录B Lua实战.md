
# 1 特点

（1）Lua脚本跟单个Redis命令、MULTI/EXEC事务一样，都是原子操作。

（2）已经对结构进行修改的Lua脚本无法被中断。

- 未进行写命令的，可以使用lua-time-limit配置+SCRIPT KILL命令停止正在运行的脚本。
- 已经进行写命令的，使用SHUTDOWN NOSAVE关闭服务器。

（3）