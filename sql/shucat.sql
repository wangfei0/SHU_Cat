/*
Navicat MySQL Data Transfer

Source Server         : mysql01
Source Server Version : 50562
Source Host           : localhost:3306
Source Database       : shucat

Target Server Type    : MYSQL
Target Server Version : 50562
File Encoding         : 65001

Date: 2020-04-23 20:38:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for cat
-- ----------------------------
DROP TABLE IF EXISTS `cat`;
CREATE TABLE `cat` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `sex` varchar(32) NOT NULL,
  `age` int(32) NOT NULL,
  `temper` varchar(255) NOT NULL,
  `home` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for cat_pic
-- ----------------------------
DROP TABLE IF EXISTS `cat_pic`;
CREATE TABLE `cat_pic` (
  `pid` int(32) NOT NULL AUTO_INCREMENT,
  `cid` int(32) NOT NULL,
  `pic` varchar(255) NOT NULL,
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
