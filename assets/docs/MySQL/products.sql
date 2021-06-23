-- -----------------------
-- 产品表
-- -----------------------
CREATE TABLE IF NOT EXISTS `products` (   -- 创建前检查是否已经存在
  `prod_id` int(11) NOT NULL AUTO_INCREMENT,  -- 自增
  `vend_id` int(11) NOT NULL,    
  `prod_name` char(50) NOT NULL,
  `prod_price` int(11) NOT NULL,
  `prod_desc` varchar(100) NOT NULL,
  PRIMARY KEY (`prod_id`)    -- 主键
) ENGINE=InnoDB DEFAULT CHARSET=utf8;  -- 引擎，默认字符集