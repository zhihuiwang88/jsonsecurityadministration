/*
Navicat MySQL Data Transfer

Source Server         : gongan
Source Server Version : 50627
Source Host           : localhost:3306
Source Database       : jsondata

Target Server Type    : MYSQL
Target Server Version : 50627
File Encoding         : 65001

Date: 2020-03-07 16:59:39
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for car_city
-- ----------------------------
DROP TABLE IF EXISTS `car_city`;
CREATE TABLE `car_city` (
  `city_id` int(32) NOT NULL AUTO_INCREMENT,
  `city_name` varchar(16) DEFAULT NULL,
  `city_code` varchar(16) DEFAULT NULL,
  `abbr` varchar(16) DEFAULT NULL,
  `engine_num` varchar(8) DEFAULT NULL,
  `engineno_num` varchar(8) DEFAULT NULL,
  `class_num` varchar(8) DEFAULT NULL,
  `classno_num` varchar(8) DEFAULT NULL,
  `regist_num` varchar(8) DEFAULT NULL,
  `registno_num` int(8) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`city_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
