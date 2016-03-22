/*
SQLyog Ultimate - MySQL GUI v8.21 
MySQL - 5.0.67-community-nt : Database - db_ssm
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_ssm` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `db_ssm`;

/*Table structure for table `role_jrisdiction_mapping` */

DROP TABLE IF EXISTS `role_jrisdiction_mapping`;

CREATE TABLE `role_jrisdiction_mapping` (
  `id` int(30) NOT NULL COMMENT 'id',
  `role_id` int(30) default NULL COMMENT '角色id',
  `jrisdiction_id` int(50) default NULL COMMENT '权限id',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `role_jrisdiction_mapping` */

/*Table structure for table `tb_jrisdiction` */

DROP TABLE IF EXISTS `tb_jrisdiction`;

CREATE TABLE `tb_jrisdiction` (
  `jrisdiction_id` int(30) NOT NULL COMMENT 'id',
  `jrisdiction _name` varchar(30) NOT NULL COMMENT '权限名',
  `jrisdiction _info` varchar(50) default NULL COMMENT '权限说明',
  PRIMARY KEY  (`jrisdiction_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_jrisdiction` */

/*Table structure for table `tb_role` */

DROP TABLE IF EXISTS `tb_role`;

CREATE TABLE `tb_role` (
  `role_id` int(30) NOT NULL,
  `role_name` varchar(30) NOT NULL,
  `role_info` varchar(50) default NULL,
  PRIMARY KEY  (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_role` */

/*Table structure for table `tb_user` */

DROP TABLE IF EXISTS `tb_user`;

CREATE TABLE `tb_user` (
  `user_id` int(30) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(50) NOT NULL,
  `sex` varchar(5) default NULL,
  `birthday` varchar(50) default NULL,
  `phone` int(15) default NULL,
  PRIMARY KEY  (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_user` */

/*Table structure for table `user_role_mapping` */

DROP TABLE IF EXISTS `user_role_mapping`;

CREATE TABLE `user_role_mapping` (
  `id` int(30) NOT NULL COMMENT 'id',
  `user_id` int(30) default NULL COMMENT '人员id',
  `role_id` int(50) default NULL COMMENT '角色id',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user_role_mapping` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
