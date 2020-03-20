/*
Navicat MySQL Data Transfer

Source Server         : gongan
Source Server Version : 50627
Source Host           : localhost:3306
Source Database       : jsondata

Target Server Type    : MYSQL
Target Server Version : 50627
File Encoding         : 65001

Date: 2020-03-07 15:34:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for telephone_number
-- ----------------------------
DROP TABLE IF EXISTS `telephone_number`;
CREATE TABLE `telephone_number` (
  `telephone_id` int(32) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) DEFAULT NULL COMMENT '姓名',
  `teldesc` varchar(32) DEFAULT NULL,
  `telnum` varchar(32) DEFAULT NULL,
  `order_id` varchar(16) DEFAULT NULL,
  `financial_information` varchar(32) DEFAULT NULL,
  `third_party` varchar(32) DEFAULT NULL,
  `network_credit` varchar(32) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`telephone_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4;
