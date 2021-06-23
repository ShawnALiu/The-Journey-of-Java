-- -----------------------
-- 订单详情表
-- -----------------------
CREATE TABLE IF NOT EXISTS `orderitems` (   -- 创建前检查是否已经存在
  `order_num` int(11) NOT NULL,  
  `order_item` char(50) NOT NULL,
  `prod_id` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  `item_price` int(11) NOT NULL,
  PRIMARY KEY (`order_num`, `order_item`),    -- 主键
  FOREIGN KEY (prod_id) REFERENCES products (prod_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;  -- 引擎，默认字符集

