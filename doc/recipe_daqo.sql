/*
Navicat MySQL Data Transfer

Source Server         : gongan
Source Server Version : 50627
Source Host           : localhost:3306
Source Database       : jsondata

Target Server Type    : MYSQL
Target Server Version : 50627
File Encoding         : 65001

Date: 2020-03-07 16:59:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for recipe_daqo
-- ----------------------------
DROP TABLE IF EXISTS `recipe_daqo`;
CREATE TABLE `recipe_daqo` (
  `greens_id` int(16) NOT NULL AUTO_INCREMENT,
  `title` varchar(128) DEFAULT NULL,
  `tags` varchar(128) DEFAULT NULL,
  `imtro` varchar(128) DEFAULT NULL,
  `ingredients` varchar(128) DEFAULT NULL,
  `burden` varchar(128) DEFAULT NULL,
  `albums` varchar(128) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`greens_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
