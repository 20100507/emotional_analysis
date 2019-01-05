DROP TABLE IF EXISTS `provinces`;  
CREATE TABLE `provinces` (  
  `id` int(11) NOT NULL auto_increment,  
  `provinceid` varchar(20) NOT NULL,  
  `province` varchar(50) NOT NULL,  
  PRIMARY KEY  (`id`)  
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 COMMENT='省份信息表';


insert into provinces(id,provinceid,province) values(1,'110000','北京市');  
insert into provinces(id,provinceid,province) values(2,'120000','天津市');  
insert into provinces(id,provinceid,province) values(3,'130000','河北省');  
insert into provinces(id,provinceid,province) values(4,'140000','山西省');  
insert into provinces(id,provinceid,province) values(5,'150000','内蒙古自治区');  
insert into provinces(id,provinceid,province) values(6,'210000','辽宁省');  
insert into provinces(id,provinceid,province) values(7,'220000','吉林省');  
insert into provinces(id,provinceid,province) values(8,'230000','黑龙江省');  
insert into provinces(id,provinceid,province) values(9,'310000','上海市');  
insert into provinces(id,provinceid,province) values(10,'320000','江苏省');  
insert into provinces(id,provinceid,province) values(11,'330000','浙江省');  
insert into provinces(id,provinceid,province) values(12,'340000','安徽省');  
insert into provinces(id,provinceid,province) values(13,'350000','福建省');  
insert into provinces(id,provinceid,province) values(14,'360000','江西省');  
insert into provinces(id,provinceid,province) values(15,'370000','山东省');  
insert into provinces(id,provinceid,province) values(16,'410000','河南省');  
insert into provinces(id,provinceid,province) values(17,'420000','湖北省');  
insert into provinces(id,provinceid,province) values(18,'430000','湖南省');  
insert into provinces(id,provinceid,province) values(19,'440000','广东省');  
insert into provinces(id,provinceid,province) values(20,'450000','广西壮族自治区');  
insert into provinces(id,provinceid,province) values(21,'460000','海南省');  
insert into provinces(id,provinceid,province) values(22,'500000','重庆市');  
insert into provinces(id,provinceid,province) values(23,'510000','四川省');  
insert into provinces(id,provinceid,province) values(24,'520000','贵州省');  
insert into provinces(id,provinceid,province) values(25,'530000','云南省');  
insert into provinces(id,provinceid,province) values(26,'540000','西藏自治区');  
insert into provinces(id,provinceid,province) values(27,'610000','陕西省');  
insert into provinces(id,provinceid,province) values(28,'620000','甘肃省');  
insert into provinces(id,provinceid,province) values(29,'630000','青海省');  
insert into provinces(id,provinceid,province) values(30,'640000','宁夏回族自治区');  
insert into provinces(id,provinceid,province) values(31,'650000','新疆维吾尔自治区');  
insert into provinces(id,provinceid,province) values(32,'710000','台湾省');  
