CREATE DATABASE  IF NOT EXISTS `wuliu` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `wuliu`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: 127.0.0.1    Database: wuliu
-- ------------------------------------------------------
-- Server version	5.7.3-m13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `wl_administer`
--

DROP TABLE IF EXISTS `wl_administer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wl_administer` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Username` varchar(20) DEFAULT NULL,
  `Password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `AK_Key_2` (`Username`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wl_administer`
--

LOCK TABLES `wl_administer` WRITE;
/*!40000 ALTER TABLE `wl_administer` DISABLE KEYS */;
INSERT INTO `wl_administer` VALUES (1,'admin','admin'),(4,'fxc','123'),(5,'test','test');
/*!40000 ALTER TABLE `wl_administer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wl_config`
--

DROP TABLE IF EXISTS `wl_config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wl_config` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(45) DEFAULT NULL,
  `content` text,
  `date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wl_config`
--

LOCK TABLES `wl_config` WRITE;
/*!40000 ALTER TABLE `wl_config` DISABLE KEYS */;
INSERT INTO `wl_config` VALUES (1,'公司简介','test',NULL),(2,'联系我们','test',NULL);
/*!40000 ALTER TABLE `wl_config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wl_controller`
--

DROP TABLE IF EXISTS `wl_controller`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wl_controller` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `UseID` int(11) DEFAULT NULL,
  `ManID` int(11) DEFAULT NULL,
  `Number` varchar(255) DEFAULT NULL,
  `Name` varchar(255) DEFAULT NULL,
  `Sex` varchar(10) DEFAULT NULL,
  `Age` int(11) DEFAULT NULL,
  `Phone` varchar(20) DEFAULT NULL,
  `Email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `AK_Key_2` (`Number`),
  KEY `FK_Reference_7` (`UseID`),
  KEY `FK_Reference_8` (`ManID`),
  CONSTRAINT `FK_Reference_7` FOREIGN KEY (`UseID`) REFERENCES `wl_user` (`id`),
  CONSTRAINT `FK_Reference_8` FOREIGN KEY (`ManID`) REFERENCES `wl_manager` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wl_controller`
--

LOCK TABLES `wl_controller` WRITE;
/*!40000 ALTER TABLE `wl_controller` DISABLE KEYS */;
INSERT INTO `wl_controller` VALUES (1,9,3,'1396073381123',NULL,'boy',36,'15669015861',NULL),(2,11,4,'1396073475585',NULL,'boy',36,'15669015861',NULL);
/*!40000 ALTER TABLE `wl_controller` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wl_customer`
--

DROP TABLE IF EXISTS `wl_customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wl_customer` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `UseID` int(11) DEFAULT NULL,
  `Name` varchar(255) DEFAULT NULL,
  `Sex` varchar(10) DEFAULT NULL,
  `Age` int(11) DEFAULT NULL,
  `Phone` varchar(20) DEFAULT NULL,
  `Email` varchar(255) DEFAULT NULL,
  `contrID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_Reference_3` (`UseID`),
  CONSTRAINT `FK_Reference_3` FOREIGN KEY (`UseID`) REFERENCES `wl_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wl_customer`
--

LOCK TABLES `wl_customer` WRITE;
/*!40000 ALTER TABLE `wl_customer` DISABLE KEYS */;
INSERT INTO `wl_customer` VALUES (1,13,NULL,'boy',36,'15669015861',NULL,NULL);
/*!40000 ALTER TABLE `wl_customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wl_goods`
--

DROP TABLE IF EXISTS `wl_goods`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wl_goods` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Number` varchar(255) DEFAULT NULL,
  `Type` varchar(255) DEFAULT NULL,
  `Weight` float DEFAULT NULL,
  `Volume` float DEFAULT NULL,
  `Source` varchar(255) DEFAULT NULL,
  `Transportmode` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `AK_Key_2` (`Number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wl_goods`
--

LOCK TABLES `wl_goods` WRITE;
/*!40000 ALTER TABLE `wl_goods` DISABLE KEYS */;
/*!40000 ALTER TABLE `wl_goods` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wl_goodsprice`
--

DROP TABLE IF EXISTS `wl_goodsprice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wl_goodsprice` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `LocID` int(11) DEFAULT NULL,
  `GooID` int(11) DEFAULT NULL,
  `Price` float(8,2) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_Reference_15` (`LocID`),
  KEY `FK_Reference_16` (`GooID`),
  CONSTRAINT `FK_Reference_15` FOREIGN KEY (`LocID`) REFERENCES `wl_location` (`ID`),
  CONSTRAINT `FK_Reference_16` FOREIGN KEY (`GooID`) REFERENCES `wl_goods` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wl_goodsprice`
--

LOCK TABLES `wl_goodsprice` WRITE;
/*!40000 ALTER TABLE `wl_goodsprice` DISABLE KEYS */;
/*!40000 ALTER TABLE `wl_goodsprice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wl_location`
--

DROP TABLE IF EXISTS `wl_location`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wl_location` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `City` varchar(255) DEFAULT NULL,
  `Distance` float DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `AK_Key_2` (`City`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wl_location`
--

LOCK TABLES `wl_location` WRITE;
/*!40000 ALTER TABLE `wl_location` DISABLE KEYS */;
/*!40000 ALTER TABLE `wl_location` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wl_manager`
--

DROP TABLE IF EXISTS `wl_manager`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wl_manager` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `UseID` int(11) DEFAULT NULL,
  `Number` varchar(255) DEFAULT NULL,
  `Name` varchar(255) DEFAULT NULL,
  `Sex` varchar(10) DEFAULT NULL,
  `Age` int(11) DEFAULT NULL,
  `Phone` varchar(20) DEFAULT NULL,
  `Email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `Number_UNIQUE` (`Number`),
  KEY `AK_Key_2` (`Number`),
  KEY `FK_Reference_4` (`UseID`),
  CONSTRAINT `FK_Reference_4` FOREIGN KEY (`UseID`) REFERENCES `wl_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wl_manager`
--

LOCK TABLES `wl_manager` WRITE;
/*!40000 ALTER TABLE `wl_manager` DISABLE KEYS */;
INSERT INTO `wl_manager` VALUES (3,2,'1','test','boy',36,'15669015861',NULL),(4,1,'2','admin','boy',NULL,NULL,NULL),(6,10,'1396073443219',NULL,'boy',36,'15669015861',NULL);
/*!40000 ALTER TABLE `wl_manager` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wl_message`
--

DROP TABLE IF EXISTS `wl_message`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wl_message` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `content` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wl_message`
--

LOCK TABLES `wl_message` WRITE;
/*!40000 ALTER TABLE `wl_message` DISABLE KEYS */;
/*!40000 ALTER TABLE `wl_message` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wl_news`
--

DROP TABLE IF EXISTS `wl_news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wl_news` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(45) DEFAULT NULL,
  `content` text,
  `date` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wl_news`
--

LOCK TABLES `wl_news` WRITE;
/*!40000 ALTER TABLE `wl_news` DISABLE KEYS */;
/*!40000 ALTER TABLE `wl_news` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wl_owner`
--

DROP TABLE IF EXISTS `wl_owner`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wl_owner` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `UseID` int(11) DEFAULT NULL,
  `ConID` int(11) DEFAULT NULL,
  `number` varchar(255) DEFAULT NULL,
  `Name` varchar(255) DEFAULT NULL,
  `Sex` varchar(10) DEFAULT NULL,
  `Age` int(11) DEFAULT NULL,
  `Phone` varchar(20) DEFAULT NULL,
  `Email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `AK_Key_2` (`number`),
  KEY `FK_Reference_5` (`UseID`),
  KEY `FK_Reference_9` (`ConID`),
  CONSTRAINT `FK_Reference_5` FOREIGN KEY (`UseID`) REFERENCES `wl_user` (`id`),
  CONSTRAINT `FK_Reference_9` FOREIGN KEY (`ConID`) REFERENCES `wl_controller` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wl_owner`
--

LOCK TABLES `wl_owner` WRITE;
/*!40000 ALTER TABLE `wl_owner` DISABLE KEYS */;
INSERT INTO `wl_owner` VALUES (1,14,2,'1396073821225',NULL,'boy',36,'15669015861',NULL);
/*!40000 ALTER TABLE `wl_owner` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wl_role`
--

DROP TABLE IF EXISTS `wl_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wl_role` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `Name` varchar(255) NOT NULL,
  `Permissions` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `Name` (`Name`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wl_role`
--

LOCK TABLES `wl_role` WRITE;
/*!40000 ALTER TABLE `wl_role` DISABLE KEYS */;
INSERT INTO `wl_role` VALUES (1,'controller','主管'),(2,'customer','客户'),(3,'manager','经理'),(4,'owner','车（船）主');
/*!40000 ALTER TABLE `wl_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wl_user`
--

DROP TABLE IF EXISTS `wl_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wl_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `login_name` varchar(64) NOT NULL,
  `name` varchar(64) NOT NULL,
  `password` varchar(255) NOT NULL,
  `salt` varchar(64) NOT NULL,
  `email` varchar(128) DEFAULT NULL,
  `status` varchar(32) DEFAULT NULL,
  `role_id` bigint(20) DEFAULT NULL,
  `register_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`id`),
  UNIQUE KEY `login_name` (`login_name`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wl_user`
--

LOCK TABLES `wl_user` WRITE;
/*!40000 ALTER TABLE `wl_user` DISABLE KEYS */;
INSERT INTO `wl_user` VALUES (1,'admin','admin','cb47846583fe40bca380034c0346d17b4f17cd01','e42db548d864a9cb','857062470@qq.com',NULL,3,'2012-06-03 17:00:00'),(2,'user','Calvin','2488aa0c31c624687bd9928e0a5d29e7d1ed520b','6d65d24122c30500','857062470@qq.com',NULL,3,'2012-06-03 18:00:00'),(9,'a','a','93844ce81c6afcef8c1574a425b7aeaedaabcca4','e34711ae4274b5fc','857062470@qq.com',NULL,1,'2014-03-29 06:09:41'),(10,'mag','mag','73779a6702e64abcb51fd62efdba05bb803c6ac8','1eacf41e4444989e','857062470@qq.com',NULL,3,'2014-03-29 06:10:43'),(11,'controlller','controlller','d4c453a3cc66c6d59729396809c3ee828e3d227a','38c35a58b9a1799b','857062470@qq.com',NULL,1,'2014-03-29 06:11:15'),(13,'customer','customer','ac5d75e6c7f277e5ab457dbd6952a0fd01056f71','9f2c629c6b8a77be','857062470@qq.com',NULL,2,'2014-03-29 06:12:51'),(14,'owner','owner','711dda463b62813e2b4d41cf768ea4042f4f90ea','879b61278ebe0c14','857062470@qq.com',NULL,4,'2014-03-29 06:17:01');
/*!40000 ALTER TABLE `wl_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wl_vehicle`
--

DROP TABLE IF EXISTS `wl_vehicle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wl_vehicle` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `OwnID` int(11) DEFAULT NULL,
  `Number` varchar(255) DEFAULT NULL,
  `Type` varchar(255) DEFAULT NULL,
  `Volume` float DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `AK_Key_2` (`Number`),
  KEY `FK_Reference_10` (`OwnID`),
  CONSTRAINT `FK_Reference_10` FOREIGN KEY (`OwnID`) REFERENCES `wl_owner` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wl_vehicle`
--

LOCK TABLES `wl_vehicle` WRITE;
/*!40000 ALTER TABLE `wl_vehicle` DISABLE KEYS */;
/*!40000 ALTER TABLE `wl_vehicle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wl_warehouse`
--

DROP TABLE IF EXISTS `wl_warehouse`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wl_warehouse` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Number` varchar(255) DEFAULT NULL,
  `Area` float DEFAULT NULL,
  `City` varchar(255) DEFAULT NULL,
  `Company` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wl_warehouse`
--

LOCK TABLES `wl_warehouse` WRITE;
/*!40000 ALTER TABLE `wl_warehouse` DISABLE KEYS */;
/*!40000 ALTER TABLE `wl_warehouse` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wl_waybill`
--

DROP TABLE IF EXISTS `wl_waybill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wl_waybill` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `CusID` int(11) DEFAULT NULL,
  `GooID` int(11) DEFAULT NULL,
  `Number` varchar(255) DEFAULT NULL,
  `Sender` varchar(255) DEFAULT NULL,
  `Senderphone` int(11) DEFAULT NULL,
  `Sendaddress` varchar(255) DEFAULT NULL,
  `Receiver` varchar(255) DEFAULT NULL,
  `Receiverphone` int(11) DEFAULT NULL,
  `Receiveaddress` varchar(255) DEFAULT NULL,
  `Weight` float DEFAULT NULL,
  `Volume` float DEFAULT NULL,
  `Storemode` varchar(255) DEFAULT NULL,
  `Price` float(8,2) DEFAULT NULL,
  `Sendtime` datetime DEFAULT NULL,
  `Receivetime` datetime DEFAULT NULL,
  `Remark` varchar(255) DEFAULT NULL,
  `Payment` varchar(255) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `AK_Key_2` (`Number`),
  KEY `FK_Reference_11` (`CusID`),
  KEY `FK_Reference_17` (`GooID`),
  CONSTRAINT `FK_Reference_11` FOREIGN KEY (`CusID`) REFERENCES `wl_customer` (`ID`),
  CONSTRAINT `FK_Reference_17` FOREIGN KEY (`GooID`) REFERENCES `wl_goods` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wl_waybill`
--

LOCK TABLES `wl_waybill` WRITE;
/*!40000 ALTER TABLE `wl_waybill` DISABLE KEYS */;
/*!40000 ALTER TABLE `wl_waybill` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wl_waybillstatus`
--

DROP TABLE IF EXISTS `wl_waybillstatus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wl_waybillstatus` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `WaybillID` int(11) DEFAULT NULL,
  `LocID` int(11) DEFAULT NULL,
  `VehID` int(11) DEFAULT NULL,
  `Time` datetime DEFAULT NULL,
  `Status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_Reference_12` (`WaybillID`),
  KEY `FK_Reference_13` (`LocID`),
  KEY `FK_Reference_14` (`VehID`),
  CONSTRAINT `FK_Reference_12` FOREIGN KEY (`WaybillID`) REFERENCES `wl_waybill` (`ID`),
  CONSTRAINT `FK_Reference_13` FOREIGN KEY (`LocID`) REFERENCES `wl_location` (`ID`),
  CONSTRAINT `FK_Reference_14` FOREIGN KEY (`VehID`) REFERENCES `wl_vehicle` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wl_waybillstatus`
--

LOCK TABLES `wl_waybillstatus` WRITE;
/*!40000 ALTER TABLE `wl_waybillstatus` DISABLE KEYS */;
/*!40000 ALTER TABLE `wl_waybillstatus` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-04-12 12:41:24
