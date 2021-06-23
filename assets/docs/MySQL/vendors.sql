-- -----------------------
-- 供应商表
-- -----------------------
CREATE TABLE IF NOT EXISTS `vendors` (   -- 创建前检查是否已经存在
  `vend_id` int(11) NOT NULL AUTO_INCREMENT,  -- 自增  
  `vend_name` char(50) NOT NULL,
  `vend_address` char(50) NOT NULL,
  `vend_city` char(15) NOT NULL,
  `vend_state` char(15) NOT NULL,
  `vend_zip` char(10) NOT NULL,
  `vend_country` char(15) NOT NULL,
  PRIMARY KEY (`vend_id`)    -- 主键
) ENGINE=InnoDB DEFAULT CHARSET=utf8;  -- 引擎，默认字符集