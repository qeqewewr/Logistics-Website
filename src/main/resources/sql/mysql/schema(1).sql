CREATE DATABASE  IF NOT EXISTS `wuliu` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `wuliu`;
-- MySQL dump 10.13  Distrib 5.6.11, for Win32 (x86)
--
-- Host: 127.0.0.1    Database: wuliu
-- ------------------------------------------------------
-- Server version	5.6.13

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
INSERT INTO `wl_config` VALUES (1,'公司简介','<p><span style=\"font-family: 微软雅黑; font-size: 12px;\"><embed type=\"application/x-shockwave-flash\" class=\"edui-faked-video\" pluginspage=\"http://www.macromedia.com/go/getflashplayer\" src=\"http://player.video.qiyi.com/73da8d878509d8ee1985e5ae48796064/0/0/w_19rr1ek51x.swf-albumId=1164271609-tvId=1164271609-isPurchase=0-cnId=27\" width=\"420\" height=\"280\" wmode=\"transparent\" play=\"true\" loop=\"false\" menu=\"false\" allowscriptaccess=\"never\" allowfullscreen=\"true\"/>XX是国家“AAAAA”级物流企业，主营国内公路运输业务。截止2014年2月，</span><span style=\"font-size: small;\"><span style=\"font-family: 微软雅黑;\">公司已开设直营网点 4,300多家，服务网络遍及全国，自有营运车辆8,700余台，全国转运中心总面积超过92万平方米。&nbsp;&nbsp;</span></span></p><p><span style=\"font-family: 微软雅黑; font-size: 12px;\">&nbsp;&nbsp;&nbsp; 公司始终以客户为中心随时候命、持续创新，始终坚持自建营业网点、自购进口车辆、搭建最优线路，优化运力成本，为客户提供快速高效、便捷及时、安全可靠的服务体验，助力客户创造最大的价值。</span></p><p><span style=\"font-family: 微软雅黑; font-size: 12px;\">&nbsp;&nbsp;&nbsp; \r\n公司秉承“承载信任、助力成功”的服务理念，保持锐意进取、注重品质的态度，强化人才战略，通过不断的技术创新和信息化系统的搭建，提升运输网络和标准化\r\n体系，创造最优化的运载模式，为广大客户提供安全、快速、专业、满意的物流服务。一直以来，公司都致力于与员工共同发展和成长，打造人企双赢。在推动经济\r\n发展，提升行业水平的同时，努力创造更多的社会效益，为国民经济的持续发展，和谐社会的创建做出积极贡献，努力将德邦打造成为中国人首选的国内物流运营\r\n商，实现“为中国提速”的使命。</span></p><p><span style=\"font-family: 微软雅黑; font-size: 12px;\"><span style=\"color: rgb(192, 192, 192);\">——————————————————————————————————————————————————<br/></span><span style=\"color: rgb(63, 59, 103); font-size: 16px;\">网点覆盖<br/></span>&nbsp;&nbsp;&nbsp;&nbsp; 截至2014年2月，德邦物流已开设直营网点4,300多家。</span></p><p><span style=\"font-family: 微软雅黑; font-size: 12px;\">&nbsp;<br/><span style=\"color: rgb(63, 59, 103); font-size: 16px;\">运输线路</span>&nbsp;<br/>&nbsp;&nbsp;&nbsp;&nbsp; 四通八达的德邦物流运行线路，使您的货物通达至每一处有需要的地方。 </span></p><p><span style=\"font-family: 微软雅黑; font-size: 12px;\"><br/><span style=\"color: rgb(63, 59, 103); font-size: 16px;\">枢纽中心</span> <br/>&nbsp;&nbsp;&nbsp;&nbsp; 在全国20多个经济中心城市设有大型的货物中转基地，为您的货物及时中转提供了可靠保障。 </span></p><p><span style=\"font-family: 微软雅黑; font-size: 12px;\"><br/><span style=\"color: rgb(63, 59, 103); font-size: 16px;\">业务覆盖</span> <br/>&nbsp;&nbsp;&nbsp;&nbsp; 公司业务范围覆盖国内所有省级行政区，在全国各地都能看到“德邦”统一字样的店面遍布在繁华街道、工业园、批发市场和专业市场中。 </span></p><p><span style=\"font-family: 微软雅黑; font-size: 12px;\"><br/><span style=\"color: rgb(63, 59, 103); font-size: 16px;\">转运中心</span> <br/>&nbsp;&nbsp;&nbsp;&nbsp; 全国超过92万平方米宽敞、整洁的货台，拥有现代化机械设施的外场操作柜台，为您的货物中转、装卸提供可靠保障！ </span></p><p><span style=\"font-family: 微软雅黑; font-size: 12px;\"><br/><span style=\"color: rgb(63, 59, 103); font-size: 16px;\">日吞吐量 <br/></span>&nbsp;&nbsp;&nbsp;&nbsp; 日吞吐货量近3万吨。</span></p><p>&nbsp;</p>',NULL),(2,'联系我们','<p>\r\n					</p><p>&nbsp;<img width=\"704\" height=\"333\" src=\"/wuliu/static/ueditor/jsp/upload/1399961880771.jpg\"/></p><p>\r\n					</p><p>感谢您对德邦物流的关注，如果您有什么疑问，可以直接登录个人自助管理平台留言，通过站内消息方式与我们的管理人员取得联系，也可以通过电话、传真、E-mail等方式与我们直接联系。</p><p>\r\n					</p><p>\r\n					\r\n					</p><h2>客户服务热线 : 400-830-5555</h2><ul class=\" list-paddingleft-2\"><li><p><label class=\"labelwidth\">传 真 :</label>021-31350889</p></li><li><p><label class=\"labelwidth\">总 部 地 址 :</label>上海市青浦区徐泾镇明珠路徐祥路</p></li><li><p><label class=\"labelwidth\">邮 编 :</label>201702</p></li><li><p><label class=\"labelwidth\">业 务 投 诉 :</label><a href=\"mailto:deppon315@deppon.com\">deppon315@deppon.com</a></p></li><li><p><label class=\"labelwidth\">商 务 合 作 :</label><a href=\"mailto:dpdzswb@deppon.com\">dpdzswb@deppon.com</a></p></li><li><p><label class=\"labelwidth\">运 营 推 广 :</label><a href=\"mailto:dpdzswb@deppon.com\">dpdzswb@deppon.com</a></p></li></ul><p></p>',NULL);
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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wl_controller`
--

LOCK TABLES `wl_controller` WRITE;
/*!40000 ALTER TABLE `wl_controller` DISABLE KEYS */;
INSERT INTO `wl_controller` VALUES (1,9,3,'1396073381123',NULL,'男',17,'15669015861',NULL),(2,11,4,'1396073475585',NULL,'boy',36,'15669015861',NULL),(3,24,3,'1402281820351',NULL,'男',17,'15669015861',NULL);
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
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wl_customer`
--

LOCK TABLES `wl_customer` WRITE;
/*!40000 ALTER TABLE `wl_customer` DISABLE KEYS */;
INSERT INTO `wl_customer` VALUES (1,13,NULL,'男',17,'15669015861',NULL,2),(2,15,NULL,'男',17,'15669015861',NULL,1),(3,18,NULL,'男',17,'15669015861',NULL,1),(4,19,NULL,'男',17,'15669015861',NULL,1),(5,20,NULL,'女',17,'15669015861',NULL,1),(6,21,NULL,'男',17,'15669015861',NULL,1),(7,22,NULL,'男',17,'15669015861',NULL,1),(8,23,NULL,'男',17,'15669015861',NULL,1);
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
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wl_goods`
--

LOCK TABLES `wl_goods` WRITE;
/*!40000 ALTER TABLE `wl_goods` DISABLE KEYS */;
INSERT INTO `wl_goods` VALUES (2,'20140528164504','沙',100,67,'舟山','车'),(3,'20140528165014','钛精矿',100,100,'广西','车'),(4,'20140528165057','锰矿石',100,100,'广西','车'),(5,'20140528170153','水泥',100,100,'杭州','车'),(6,'20140611121351','煤矿',100,100,'运城','车'),(7,'20140611144406','矿石',100,100,'上海','车');
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
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wl_goodsprice`
--

LOCK TABLES `wl_goodsprice` WRITE;
/*!40000 ALTER TABLE `wl_goodsprice` DISABLE KEYS */;
INSERT INTO `wl_goodsprice` VALUES (2,5,2,20000.00),(3,3,2,5025.00),(4,4,3,125000.00),(5,3,3,130000.00),(6,2,5,78000.00),(7,3,5,29000.00),(8,2,2,5500.00),(9,9,6,10000.00),(10,10,7,10000.00);
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
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wl_location`
--

LOCK TABLES `wl_location` WRITE;
/*!40000 ALTER TABLE `wl_location` DISABLE KEYS */;
INSERT INTO `wl_location` VALUES (2,'杭州',1100),(3,'桂林',1400),(4,'海南',2200),(5,'石家庄',1000),(7,'乌鲁木齐',4900),(8,'上海',400),(9,'北京',1400),(10,'重庆',2200);
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
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wl_news`
--

LOCK TABLES `wl_news` WRITE;
/*!40000 ALTER TABLE `wl_news` DISABLE KEYS */;
INSERT INTO `wl_news` VALUES (1,'spring MVC','<h2 class=\"headline-1\"><span class=\"headline-content\">框架</span></h2><p>Spring\r\n MVC属于SpringFrameWork的后续产品，已经融合在Spring Web Flow里面。Spring 框架提供了构建 Web \r\n应用程序的全功能 MVC 模块。使用 Spring 可插入的 MVC 架构，可以选择是使用内置的 Spring Web 框架还可以是 \r\nStruts 这样的 Web 框架。通过策略接口，Spring 框架是高度可配置的，而且包含多种视图技术，例如 JavaServer \r\nPages（<a href=\"http://baike.baidu.com/view/3387.htm\" target=\"_blank\">JSP</a>）技术、Velocity、Tiles、iText 和<a href=\"http://baike.baidu.com/view/517279.htm\" target=\"_blank\">POI</a>。Spring MVC 框架并不知道使用的视图，所以不会强迫您只使用 JSP 技术。Spring MVC 分离了<a href=\"http://baike.baidu.com/view/122229.htm\" target=\"_blank\">控制器</a>、模型<a href=\"http://baike.baidu.com/view/2387.htm\" target=\"_blank\">对象</a>、分派器以及处理程序对象的角色，这种分离让它们更容易进行定制。</p><p><a name=\"2\"></a><a name=\"sub1834982_2\"></a><a name=\"优点\"></a></p><h2 class=\"headline-1\"><span class=\"headline-1-index\">2</span><span class=\"headline-content\">优点</span></h2><p>Lifecycle for overriding binding, validation, etc；易于同其它View框架（Tiles等）无缝集成，采用IOC便于测试。</p><p>它是一个典型的教科书式的mvc构架，而不像struts等都是变种或者不是完全基于mvc系统的框架，对于初学者或者想了解mvc的人来说我觉得 spring是最好的，它的实现就是教科书！第二它和<a href=\"http://baike.baidu.com/view/66879.htm\" target=\"_blank\">tapestry</a>一样是一个纯正的servlet系统，这也是它和tapestry相比 struts所没有的优势。而且框架本身有代码，而且看起来容易理解。</p><p><a name=\"3\"></a><a name=\"sub1834982_3\"></a><a name=\"单元测试\"></a></p><h2 class=\"headline-1\"><span class=\"headline-1-index\">3</span><span class=\"headline-content\">单元测试</span></h2><p>关于Spring MVC Controller 层的单元测试</p><p>测试准备工作：</p><p>1、搭建测试Web环境</p><table cellspacing=\"0\" cellpadding=\"0\"><tbody><tr class=\"firstRow\"><td class=\"gutter\"><div class=\"line number1 index0 alt2\">1</div><div class=\"line number2 index1 alt1\">2</div></td><td class=\"code\"><div class=\"line number1 index0 alt2\"><code class=\"java color1\">@RunWith</code><code class=\"java plain\">(UnitilsJUnit4TestClassRunner.</code><code class=\"java keyword\">class</code><code class=\"java plain\">)</code></div><div class=\"line number2 index1 alt1\"><code class=\"java color1\">@SpringApplicationContext</code><code class=\"java plain\">({</code><code class=\"java string\">&quot;classpath:*.xml&quot;</code><code class=\"java plain\">,</code><code class=\"java string\">&quot;file:src/main/webapp/WEB-INF/spring-configuration/*.xml&quot;</code><code class=\"java plain\">,</code><code class=\"java string\">&quot;file:src/main/webapp/WEB-INF/*.xml&quot;</code> <code class=\"java plain\">})</code></div></td></tr></tbody></table><p>2、注入Controller 类</p><table cellspacing=\"0\" cellpadding=\"0\"><tbody><tr class=\"firstRow\"><td class=\"gutter\"><div class=\"line number1 index0 alt2\">1</div><div class=\"line number2 index1 alt1\">2</div></td><td class=\"code\"><div class=\"line number1 index0 alt2\"><code class=\"java color1\">@SpringBeanByType</code></div><div class=\"line number2 index1 alt1\"><code class=\"java plain\">BeanController controller;</code></div></td></tr></tbody></table><p>3、编写测试数据</p><p>测试数据的文件名一定要与测试类的文件名相同，比如测试数据BeanControllerTest.xml ，测试类 BeanControllerTest。</p><p>4、注入测试数据</p><table cellspacing=\"0\" cellpadding=\"0\"><tbody><tr class=\"firstRow\"><td class=\"gutter\"><div class=\"line number1 index0 alt2\">1</div><div class=\"line number2 index1 alt1\">2</div><div class=\"line number3 index2 alt2\">3</div></td><td class=\"code\"><div class=\"line number1 index0 alt2\"><code class=\"java color1\">@Test</code></div><div class=\"line number2 index1 alt1\"><code class=\"java color1\">@DataSet</code></div><div class=\"line number3 index2 alt2\"><code class=\"java keyword\">public</code> <code class=\"java keyword\">void</code> <code class=\"java plain\">testBean(){}</code></div></td></tr></tbody></table><p><a name=\"4\"></a><a name=\"sub1834982_4\"></a><a name=\"常用注解\"></a></p><h2 class=\"headline-1\"><span class=\"headline-1-index\">4</span><span class=\"headline-content\">常用注解</span></h2><p>MVC已经是现代Web开发中的一个很重要的部分，下面介绍一下Spring MVC的一些使用心得。</p><p>之前的项目比较简单，多是用JSP 、Servlet + JDBC 直接搞定，在项目中尝试用 \r\nStruts(Struts MVC)+Spring+Hibernate, \r\n严格按照分层概念驱动项目开发，因项目需求一直不断变化，功能不断扩充、增强，技术构建也几经改变到目前有个稳定的应用，体会了很多感受，这次先对 \r\nSpring MVC 层进行一些个人总结。</p><p>MVC作为WEB项目开发的核心环节，正如三个单词的分解那样，C（控制器）将V（视图、用户客户端）与M（模块，\r\n业务）分开构成了MVC ，这边不去讨论项目中是否应用MVC ，也不针对MVC的实现原理进行讲解，而是探讨实践中如何从应用SSH, \r\n到Struts(Struts MVC)+Spring+Hibernate的演化过程。</p><p>先看 Struts 如何与 Spring 结合处理一次简单的请求响应代码，前台可以设为用 AJAX 调用：</p><p><strong>1. 在 struts-config.xml 文件中加入</strong></p><p>&lt;!--用于声明GetPersonList。do请求委托Spring处理\r\n--&gt;&lt;actionpath=&quot;/GetPersonList&quot; \r\nscope=&quot;request&quot;type=&quot;org.springframework.web.struts.DelegatingActionProxy&quot;&gt;&lt;/action&gt;</p><p><strong>2.在 applicationContext.xml 文件中加入</strong></p><p>&lt;!-- 指定GetPersonList处理的代码，和注入实现业务的代码 \r\n--&gt;&lt;beanname=&quot;/GetPersonList&quot; \r\nclass=&quot;cn.base.GetPersonListAction&quot;&gt;&lt;propertyname=&quot;getPersonList&quot; \r\nref=&quot; getPersonListServices&quot;&gt;&lt;/property&gt;&lt;/bean&gt;</p><p><strong>3.cn.base.GetPersonListAction 实现请求响应代码</strong></p><p>可以看出一次请求需求如此多的步骤，在加上一个项目下来有很多这样的请求响应，将给配置文件管理带来很大的麻烦。</p><p>经过对 Spring 的深入应用， Spring 本身提供的 URL 请求控制，对其天然支持可以让我们不需要\r\n applicationContext.xml 再次声明一次 URL 请求 Bean ，即减少了 Struts 的声明 URL \r\n，达到减少些繁琐的配置。但只是少了一些而已，同样也会面临着配置文件的管理问题。</p><p>Spring 注解将给我们的工作带来些轻松，利用反射机制原理出现的注解就是为了解决配置大量的配置问题。请看下处理一次简单的请求响应代码</p><p>@Controller --声明控制器@RequestMapping(&quot;/person&quot;) –声明URL</p><p>public class PersonControl extends BaseController {</p><p>@Autowired –业务接口注入</p><p>private personServices personServices;/*** 获得人员列表*</p><p>@param request* @param response* @throws Exception*/@RequestMapping(params = &quot;method=geList&quot;) --即处理/person.do? method=geList方法</p><p>public void getnodeList(HttpServletRequest request,HttpServletResponse response) throws Exception { //处理请求//处理响应}}</p><p>可以看出，在代码上加入注解可以省去我们上面说的多个配置文件的工作，达到简便的 MVC 处理请求响应。</p><p>在配上简单的配置文件声明，即可轻松处理项目的全部请求控制工作。</p><p>Spring MVC乱码问题</p><p>在使用Spring MVC 做java Web \r\n项目时，乱码问题时常都会出现，解决方法也不尽相同，有简单也有复杂的；如果加入了Spring框架之后就不一样了，可以采用Spring框架自带的过滤\r\n器CharacterEncodingFilter，这样可以大大减轻了我们的工作量，即简单方便又容易理解，配置方式如下：在web.xml文件中\r\nfilter的位置加上如下内容：</p><p>&lt;filter&gt;</p><p>&lt;filter-name&gt;encodingFilter&lt;/filter-name&gt;</p><p>&lt;filter-class&gt;org.springframework.web.filter.CharacterEncodingFilter&lt;/filter-class&gt;</p><p>&lt;init-param&gt;</p><p>&lt;param-name&gt;encoding&lt;/param-name&gt;</p><p>&lt;param-value&gt;UTF-8&lt;/param-value&gt;</p><p>&lt;/init-param&gt;</p><p>&lt;init-param&gt;</p><p>&lt;param-name&gt;forceEncoding&lt;/param-name&gt;</p><p>&lt;param-value&gt;true&lt;/param-value&gt;</p><p>&lt;/init-param&gt;</p><p>&lt;/filter&gt;</p><p>&lt;filter-mapping&gt;</p><p>&lt;filter-name&gt;encodingFilter&lt;/filter-name&gt;</p><p>&lt;url-pattern&gt;*.htm&lt;/url-pattern&gt;</p><p>&lt;/filter-mapping&gt;</p><p>springmvc实现上传文件代码片段</p><p>&lt;?xml version=&quot;1.0&quot; encoding=&quot;UTF-8&quot;?&gt;</p><p>&lt;bean id=&quot;multipartResolver&quot; &nbsp; &nbsp;class=&quot;org.springframework.web.multipart.commons.CommonsMultipartResolver&quot; /&gt;&lt;/bean&gt;</p><p>@Controller@RequestMapping(&quot;/common&quot;)</p><p>public class CommonController {</p><p>@RequestMapping(value = &quot;/upload&quot;)</p><p>public @ResponseBody &nbsp;String upload(@RequestParam(&quot;file&quot;) MultipartFile file, HttpSession session) &nbsp; &nbsp; &nbsp;throws Exception {</p><p>File localFile = new File(&quot;c:/test/a.rar&quot;);</p><p>file.transferTo(localFile);</p><p>return &quot;success&quot;;</p><p>}</p><p>}</p><p>&nbsp;</p>','2014-05-13 06:19:40'),(2,'使用 Spring Data JPA 简化 JPA 开发','<p><a name=\"major1\"></a><span class=\"atitle\">从一个简单的 JPA 示例开始</span></p><p>&nbsp;</p><p>本文主要讲述 Spring Data JPA，但是为了不至于给 JPA 和 Spring 的初学者造成较大的学习曲线，我们首先从 \r\nJPA 开始，简单介绍一个 JPA 示例；接着重构该示例，并引入 Spring 框架，这两部分不会涉及过多的篇幅，如果希望能够深入学习 \r\nSpring 和 JPA，可以根据本文最后提供的参考资料进一步学习。</p><p>&nbsp;</p><p>自 JPA 伴随 Java EE 5 发布以来，受到了各大厂商及开源社区的追捧，各种商用的和开源的 JPA \r\n框架如雨后春笋般出现，为开发者提供了丰富的选择。它一改之前 EJB 2.x 中实体 Bean \r\n笨重且难以使用的形象，充分吸收了在开源社区已经相对成熟的 ORM 思想。另外，它并不依赖于 EJB \r\n容器，可以作为一个独立的持久层技术而存在。目前比较成熟的 JPA 框架主要包括 Jboss 的 Hibernate \r\nEntityManager、Oracle 捐献给 Eclipse 社区的 EclipseLink、Apache 的 OpenJPA 等。</p><p>&nbsp;</p><p>本文的示例代码基于 Hibernate EntityManager 开发，但是读者几乎不用修改任何代码，便可以非常容易地切换到其他 \r\nJPA 框架，因为代码中使用到的都是 JPA 规范提供的接口 / \r\n类，并没有使用到框架本身的私有特性。示例主要涉及七个文件，但是很清晰：业务层包含一个接口和一个实现；持久层包含一个接口、一个实现、一个实体类；另\r\n外加上一个 JPA 配置文件和一个测试类。相关类 / 接口代码如下：</p><p><br/><a name=\"listing1\"></a><strong>清单 1. 实体类 AccountInfo.java</strong><br/></p><table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" summary=\"This table contains a code listing.\"><tbody><tr class=\"firstRow\"><td class=\"code-outline\"><pre class=\"displaycode\">				&nbsp;@Entity&nbsp;\r\n&nbsp;@Table(name&nbsp;=&nbsp;&quot;t_accountinfo&quot;)&nbsp;\r\n&nbsp;public&nbsp;class&nbsp;AccountInfo&nbsp;implements&nbsp;Serializable&nbsp;{&nbsp;\r\n&nbsp;private&nbsp;Long&nbsp;accountId;&nbsp;\r\n&nbsp;private&nbsp;Integer&nbsp;balance;&nbsp;\r\n\r\n&nbsp;//&nbsp;此处省略&nbsp;getter&nbsp;和&nbsp;setter&nbsp;方法。\r\n&nbsp;}</pre></td></tr></tbody></table><p><br/><br/><a name=\"listing2\"></a><strong>清单 2. 业务层接口 UserService.java</strong><br/></p><table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" summary=\"This table contains a code listing.\"><tbody><tr class=\"firstRow\"><td class=\"code-outline\"><pre class=\"displaycode\">				&nbsp;public&nbsp;interface&nbsp;UserService&nbsp;{&nbsp;\r\n&nbsp;public&nbsp;AccountInfo&nbsp;createNewAccount(String&nbsp;user,&nbsp;String&nbsp;pwd,&nbsp;Integer&nbsp;init);&nbsp;\r\n&nbsp;}</pre></td></tr></tbody></table><p><br/><br/><a name=\"listing3\"></a><strong>清单 3. 业务层的实现类 UserServiceImpl.java</strong><br/></p><table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" summary=\"This table contains a code listing.\"><tbody><tr class=\"firstRow\"><td class=\"code-outline\"><pre class=\"displaycode\">				&nbsp;public&nbsp;class&nbsp;UserServiceImpl&nbsp;implements&nbsp;UserService&nbsp;{&nbsp;\r\n\r\n&nbsp;private&nbsp;UserDao&nbsp;userDao&nbsp;=&nbsp;new&nbsp;UserDaoImpl();&nbsp;\r\n\r\n&nbsp;public&nbsp;AccountInfo&nbsp;createNewAccount(String&nbsp;user,&nbsp;String&nbsp;pwd,&nbsp;Integer&nbsp;init){&nbsp;\r\n&nbsp;//&nbsp;封装域对象\r\n&nbsp;AccountInfo&nbsp;accountInfo&nbsp;=&nbsp;new&nbsp;AccountInfo();&nbsp;\r\n&nbsp;UserInfo&nbsp;userInfo&nbsp;=&nbsp;new&nbsp;UserInfo();&nbsp;\r\n&nbsp;userInfo.setUsername(username);&nbsp;\r\n&nbsp;userInfo.setPassword(password);&nbsp;\r\n&nbsp;accountInfo.setBalance(initBalance);&nbsp;\r\n&nbsp;accountInfo.setUserInfo(userInfo);&nbsp;\r\n&nbsp;//&nbsp;调用持久层，完成数据的保存\r\n&nbsp;return&nbsp;userDao.save(accountInfo);&nbsp;\r\n&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;\r\n&nbsp;}</pre></td></tr></tbody></table><p><br/><br/><a name=\"listing4\"></a><strong>清单 4. 持久层接口</strong><br/></p><table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" summary=\"This table contains a code listing.\"><tbody><tr class=\"firstRow\"><td class=\"code-outline\"><pre class=\"displaycode\">				&nbsp;public&nbsp;interface&nbsp;UserDao&nbsp;{&nbsp;\r\n&nbsp;public&nbsp;AccountInfo&nbsp;save(AccountInfo&nbsp;accountInfo);&nbsp;\r\n&nbsp;}</pre></td></tr></tbody></table><p><br/><br/><a name=\"listing5\"></a><strong>清单 5. 持久层的实现类</strong><br/></p><table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" summary=\"This table contains a code listing.\"><tbody><tr class=\"firstRow\"><td class=\"code-outline\"><pre class=\"displaycode\">				&nbsp;public&nbsp;class&nbsp;UserDaoImpl&nbsp;implements&nbsp;UserDao&nbsp;{&nbsp;\r\n&nbsp;public&nbsp;AccountInfo&nbsp;save(AccountInfo&nbsp;accountInfo)&nbsp;{&nbsp;\r\n&nbsp;EntityManagerFactory&nbsp;emf&nbsp;=&nbsp;\r\n&nbsp;Persistence.createEntityManagerFactory(&quot;SimplePU&quot;);&nbsp;\r\n&nbsp;EntityManager&nbsp;em&nbsp;=&nbsp;emf.createEntityManager();&nbsp;\r\n&nbsp;em.getTransaction().begin();&nbsp;\r\n&nbsp;em.persist(accountInfo);&nbsp;\r\n&nbsp;em.getTransaction().commit();&nbsp;\r\n&nbsp;emf.close();&nbsp;\r\n&nbsp;return&nbsp;accountInfo;&nbsp;\r\n&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;\r\n&nbsp;}</pre></td></tr></tbody></table><p><br/><br/><a name=\"listing6\"></a><strong>清单 6. JPA 标准配置文件 persistence.xml</strong><br/></p><table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" summary=\"This table contains a code listing.\"><tbody><tr class=\"firstRow\"><td class=\"code-outline\"><pre class=\"displaycode\">				&nbsp;&lt;?xml&nbsp;version=&quot;1.0&quot;&nbsp;encoding=&quot;UTF-8&quot;?&gt;&nbsp;\r\n&nbsp;&lt;persistence&nbsp;xmlns=&quot;http://java.sun.com/xml/ns/persistence&quot;&nbsp;version=&quot;2.0&quot;&gt;&nbsp;\r\n&nbsp;&lt;persistence-unit&nbsp;name=&quot;SimplePU&quot;&nbsp;transaction-type=&quot;RESOURCE_LOCAL&quot;&gt;&nbsp;\r\n&nbsp;&lt;provider&gt;org.hibernate.ejb.HibernatePersistence&lt;/provider&gt;&nbsp;\r\n&nbsp;&lt;class&gt;footmark.springdata.jpa.domain.UserInfo&lt;/class&gt;&nbsp;\r\n&nbsp;&lt;class&gt;footmark.springdata.jpa.domain.AccountInfo&lt;/class&gt;&nbsp;\r\n&nbsp;&lt;properties&gt;&nbsp;\r\n&nbsp;&lt;property&nbsp;name=&quot;hibernate.connection.driver_class&quot;\r\n&nbsp;value=&quot;com.mysql.jdbc.Driver&quot;/&gt;&nbsp;\r\n&nbsp;&lt;property&nbsp;name=&quot;hibernate.connection.url&quot;&nbsp;\r\n&nbsp;value=&quot;jdbc:mysql://10.40.74.197:3306/zhangjp&quot;/&gt;&nbsp;\r\n&nbsp;&lt;property&nbsp;name=&quot;hibernate.connection.username&quot;&nbsp;value=&quot;root&quot;/&gt;&nbsp;\r\n&nbsp;&lt;property&nbsp;name=&quot;hibernate.connection.password&quot;&nbsp;value=&quot;root&quot;/&gt;&nbsp;\r\n&nbsp;&lt;property&nbsp;name=&quot;hibernate.dialect&quot;\r\n&nbsp;value=&quot;org.hibernate.dialect.MySQL5Dialect&quot;/&gt;&nbsp;\r\n&nbsp;&lt;property&nbsp;name=&quot;hibernate.show_sql&quot;&nbsp;value=&quot;true&quot;/&gt;&nbsp;\r\n&nbsp;&lt;property&nbsp;name=&quot;hibernate.format_sql&quot;&nbsp;value=&quot;true&quot;/&gt;&nbsp;\r\n&nbsp;&lt;property&nbsp;name=&quot;hibernate.use_sql_comments&quot;&nbsp;value=&quot;false&quot;/&gt;&nbsp;\r\n&nbsp;&lt;property&nbsp;name=&quot;hibernate.hbm2ddl.auto&quot;&nbsp;value=&quot;update&quot;/&gt;&nbsp;\r\n&nbsp;&lt;/properties&gt;&nbsp;\r\n&nbsp;&lt;/persistence-unit&gt;&nbsp;\r\n&nbsp;&lt;/persistence&gt;</pre></td></tr></tbody></table><p><br/><br/><a name=\"listing7\"></a><strong>清单 7. 本文使用如下的 main 方法进行开发者测试</strong><br/></p><table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" summary=\"This table contains a code listing.\"><tbody><tr class=\"firstRow\"><td class=\"code-outline\"><pre class=\"displaycode\">				&nbsp;public&nbsp;class&nbsp;SimpleSpringJpaDemo&nbsp;{&nbsp;\r\n&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;static&nbsp;void&nbsp;main(String[]&nbsp;args)&nbsp;{&nbsp;\r\n&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new&nbsp;UserServiceImpl().createNewAccount(&quot;ZhangJianPing&quot;,&nbsp;&quot;123456&quot;,&nbsp;1);&nbsp;\r\n&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;\r\n&nbsp;}</pre></td></tr></tbody></table><p><br/></p><p class=\"ibm-ind-link ibm-back-to-top\"><a class=\"ibm-anchor-up-link\" href=\"http://www.ibm.com/developerworks/cn/opensource/os-cn-spring-jpa/#ibm-pcon\">回页首</a></p><p><a name=\"major2\"></a><span class=\"atitle\">简述 Spring 框架对 JPA 的支持</span></p><p>&nbsp;</p><p>接下来我们引入 Spring，以展示 Spring 框架对 JPA 的支持。业务层接口 UserService \r\n保持不变，UserServiceImpl 中增加了三个注解，以让 Spring 完成依赖注入，因此不再需要使用 new 操作符创建 \r\nUserDaoImpl 对象了。同时我们还使用了 Spring 的声明式事务：</p><p><br/><a name=\"listing8\"></a><strong>清单 8. 配置为 Spring Bean 的业务层实现</strong><br/></p><table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" summary=\"This table contains a code listing.\"><tbody><tr class=\"firstRow\"><td class=\"code-outline\"><pre class=\"displaycode\">				&nbsp;@Service(&quot;userService&quot;)&nbsp;\r\n&nbsp;public&nbsp;class&nbsp;UserServiceImpl&nbsp;implements&nbsp;UserService&nbsp;{&nbsp;\r\n&nbsp;@Autowired&nbsp;\r\n&nbsp;private&nbsp;UserDao&nbsp;userDao;&nbsp;\r\n\r\n&nbsp;@Transactional&nbsp;\r\n&nbsp;public&nbsp;AccountInfo&nbsp;createNewAccount(&nbsp;\r\n&nbsp;String&nbsp;name,&nbsp;String&nbsp;pwd,&nbsp;Integer&nbsp;init)&nbsp;{&nbsp;……&nbsp;}&nbsp;\r\n&nbsp;}</pre></td></tr></tbody></table><p><br/></p><p>对于持久层，UserDao 接口也不需要修改，只需修改 UserDaoImpl 实现，修改后的代码如下：</p><p><br/><a name=\"listing9\"></a><strong>清单 9. 配置为 Spring Bean 的持久层实现</strong><br/></p><table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" summary=\"This table contains a code listing.\"><tbody><tr class=\"firstRow\"><td class=\"code-outline\"><pre class=\"displaycode\">				&nbsp;@Repository(&quot;userDao&quot;)&nbsp;\r\n&nbsp;public&nbsp;class&nbsp;UserDaoImpl&nbsp;implements&nbsp;UserDao&nbsp;{&nbsp;\r\n\r\n&nbsp;@PersistenceContext&nbsp;\r\n&nbsp;private&nbsp;EntityManager&nbsp;em;&nbsp;\r\n\r\n&nbsp;@Transactional&nbsp;\r\n&nbsp;&nbsp;&nbsp;public&nbsp;Long&nbsp;save(AccountInfo&nbsp;accountInfo)&nbsp;{&nbsp;\r\n&nbsp;em.persist(accountInfo);&nbsp;\r\n&nbsp;return&nbsp;accountInfo.getAccountId();&nbsp;\r\n&nbsp;}&nbsp;\r\n&nbsp;}</pre></td></tr></tbody></table><p><br/><br/><a name=\"listing10\"></a><strong>清单 10. Spring 配置文件</strong><br/></p><table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" summary=\"This table contains a code listing.\"><tbody><tr class=\"firstRow\"><td class=\"code-outline\"><pre class=\"displaycode\">				&nbsp;&lt;?xml&nbsp;version=&quot;1.0&quot;&nbsp;encoding=&quot;UTF-8&quot;?&gt;&nbsp;\r\n&nbsp;&lt;beans...&gt;&nbsp;\r\n&nbsp;&lt;context:component-scan&nbsp;base-package=&quot;footmark.springdata.jpa&quot;/&gt;&nbsp;\r\n&nbsp;&lt;tx:annotation-driven&nbsp;transaction-manager=&quot;transactionManager&quot;/&gt;&nbsp;\r\n&nbsp;&lt;bean&nbsp;id=&quot;transactionManager&quot;&nbsp;\r\n&nbsp;class=&quot;org.springframework.orm.jpa.JpaTransactionManager&quot;&gt;&nbsp;\r\n&nbsp;&lt;property&nbsp;name=&quot;entityManagerFactory&quot;&nbsp;ref=&quot;entityManagerFactory&quot;/&gt;&nbsp;\r\n&nbsp;&lt;/bean&gt;&nbsp;\r\n&nbsp;&lt;bean&nbsp;id=&quot;entityManagerFactory&quot;&nbsp;class=&nbsp;\r\n&quot;org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean&quot;&gt;&nbsp;\r\n&nbsp;&nbsp;&nbsp;&nbsp;&lt;/bean&gt;&nbsp;\r\n&nbsp;&lt;/beans&gt;</pre></td></tr></tbody></table><p><br/><br/><a name=\"listing11\"></a><strong>清单 11. 改造后的基于 Spring 的开发者测试代码</strong><br/></p><table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" summary=\"This table contains a code listing.\"><tbody><tr class=\"firstRow\"><td class=\"code-outline\"><pre class=\"displaycode\">				&nbsp;public&nbsp;class&nbsp;SimpleSpringJpaDemo{&nbsp;\r\n&nbsp;public&nbsp;static&nbsp;void&nbsp;main(String[]&nbsp;args){&nbsp;\r\n&nbsp;ClassPathXmlApplicationContext&nbsp;ctx&nbsp;=&nbsp;\r\n&nbsp;new&nbsp;ClassPathXmlApplicationContext(&quot;spring-demo-cfg.xml&quot;);&nbsp;\r\n&nbsp;UserDao&nbsp;userDao&nbsp;=&nbsp;ctx.getBean(&quot;userDao&quot;,&nbsp;UserDao.class);&nbsp;\r\n&nbsp;userDao.createNewAccount(&quot;ZhangJianPing&quot;,&nbsp;&quot;123456&quot;,&nbsp;1);&nbsp;\r\n&nbsp;}&nbsp;\r\n&nbsp;}</pre></td></tr></tbody></table><p><br/></p><p>通过对比重构前后的代码，可以发现 Spring 对 JPA 的简化已经非常出色了，我们可以大致总结一下 Spring 框架对 JPA 提供的支持主要体现在如下几个方面：</p><ul class=\" list-paddingleft-2\"><li><p>&nbsp;</p></li><li><p>首先，它使得 JPA 配置变得更加灵活。JPA 规范要求，配置文件必须命名为 persistence.xml，并存在于类路径下的 \r\nMETA-INF 目录中。该文件通常包含了初始化 JPA 引擎所需的全部信息。Spring 提供的 \r\nLocalContainerEntityManagerFactoryBean 提供了非常灵活的配置，persistence.xml \r\n中的信息都可以在此以属性注入的方式提供。</p></li><li><p>&nbsp;</p></li></ul><ul class=\" list-paddingleft-2\"><li><p>&nbsp;</p></li><li><p>其次，Spring 实现了部分在 EJB 容器环境下才具有的功能，比如对 @PersistenceContext、@PersistenceUnit 的容器注入支持。</p></li><li><p>&nbsp;</p></li><li><p>第三，也是最具意义的，Spring 将 EntityManager \r\n的创建与销毁、事务管理等代码抽取出来，并由其统一管理，开发者不需要关心这些，如前面的代码所示，业务方法中只剩下操作领域对象的代码，事务管理和 \r\nEntityManager 创建、销毁的代码都不再需要开发者关心了。</p></li><li><p>&nbsp;</p></li></ul><p>&nbsp;</p><p class=\"ibm-ind-link ibm-back-to-top\"><a class=\"ibm-anchor-up-link\" href=\"http://www.ibm.com/developerworks/cn/opensource/os-cn-spring-jpa/#ibm-pcon\">回页首</a></p><p><a name=\"major3\"></a><span class=\"atitle\">更进一步：Spring Data JPA 让一切近乎完美</span></p><p>&nbsp;</p><p>通过前面的分析可以看出，Spring 对 JPA 的支持已经非常强大，开发者只需关心核心业务逻辑的实现代码，无需过多关注 \r\nEntityManager 的创建、事务处理等 JPA 相关的处理，这基本上也是作为一个开发框架而言所能做到的极限了。然而，Spring \r\n开发小组并没有止步，他们再接再厉，于最近推出了 Spring Data JPA 框架，主要针对的就是 Spring \r\n唯一没有简化到的业务逻辑代码，至此，开发者连仅剩的实现持久层业务逻辑的工作都省了，唯一要做的，就只是声明持久层的接口，其他都交给 Spring \r\nData JPA 来帮你完成！</p><p>&nbsp;</p><p>至此，读者可能会存在一个疑问，框架怎么可能代替开发者实现业务逻辑呢？毕竟，每一个应用的持久层业务甚至领域对象都不尽相同，框架是怎么做\r\n到的呢？其实这背后的思想并不复杂，比如，当你看到 UserDao.findUserById() \r\n这样一个方法声明，大致应该能判断出这是根据给定条件的 ID 查询出满足条件的 User 对象。Spring Data JPA \r\n做的便是规范方法的名字，根据符合规范的名字来确定方法需要实现什么样的逻辑。</p><p>&nbsp;</p><p>接下来我们针对前面的例子进行改造，让 Spring Data JPA 来帮助我们完成业务逻辑。在着手写代码之前，开发者需要先 <a href=\"http://s3.amazonaws.com/dist.springframework.org/release/DATAJPA/spring-data-jpa-1.0.1.RELEASE.zip\">下载</a>Spring\r\n Data JPA 的发布包（需要同时下载 Spring Data Commons 和 Spring Data JPA \r\n两个发布包，Commons 是 Spring Data 的公共基础包），并把相关的依赖 JAR 文件加入到 CLASSPATH 中。</p><p>&nbsp;</p><p>首先，让持久层接口 UserDao 继承 Repository 接口。该接口使用了泛型，需要为其提供两个类型：第一个为该接口处理的域对象类型，第二个为该域对象的主键类型。修改后的 UserDao 如下：</p><p><br/><a name=\"listing12\"></a><strong>清单 12. Spring Data JPA 风格的持久层接口</strong><br/></p><table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" summary=\"This table contains a code listing.\"><tbody><tr class=\"firstRow\"><td class=\"code-outline\"><pre class=\"displaycode\">				&nbsp;public&nbsp;interface&nbsp;UserDao&nbsp;extends&nbsp;Repository&lt;AccountInfo,&nbsp;Long&gt;&nbsp;{&nbsp;\r\n&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;AccountInfo&nbsp;save(AccountInfo&nbsp;accountInfo);&nbsp;\r\n&nbsp;}</pre></td></tr></tbody></table><p><br/></p><p>然后删除 UserDaoImpl 类，因为我们前面说过，框架会为我们完成业务逻辑。最后，我们需要在 Spring 配置文件中增加如下配置，以使 Spring 识别出需要为其实现的持久层接口：</p><p><br/><a name=\"listing13\"></a><strong>清单 13. 在 Spring 配置文件中启用扫描并自动创建代理的功能</strong><br/></p><table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" summary=\"This table contains a code listing.\"><tbody><tr class=\"firstRow\"><td class=\"code-outline\"><pre class=\"displaycode\">				&nbsp;&lt;--&nbsp;需要在&nbsp;&lt;beans&gt;&nbsp;标签中增加对&nbsp;jpa&nbsp;命名空间的引用&nbsp;--&gt;&nbsp;\r\n&nbsp;&lt;jpa:repositories&nbsp;base-package=&quot;footmark.springdata.jpa.dao&quot;\r\n&nbsp;entity-manager-factory-ref=&quot;entityManagerFactory&quot;&nbsp;\r\n&nbsp;transaction-manager-ref=&quot;transactionManager&quot;/&gt;</pre></td></tr></tbody></table><p><br/></p><p>至此便大功告成了！执行一下测试代码，然后看一下数据库，新的数据已经如我们预期的添加到表中了。如果要再增加新的持久层业务，比如希望查询出给 ID 的 AccountInfo 对象，该怎么办呢？很简单，在 UserDao 接口中增加一行代码即可：</p><p><br/><a name=\"listing14\"></a><strong>清单 14. 修改后的持久层接口，增加一个方法声明</strong><br/></p><table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" summary=\"This table contains a code listing.\"><tbody><tr class=\"firstRow\"><td class=\"code-outline\"><pre class=\"displaycode\">				&nbsp;public&nbsp;interface&nbsp;UserDao&nbsp;extends&nbsp;Repository&lt;AccountInfo,&nbsp;Long&gt;&nbsp;{&nbsp;\r\n\r\n&nbsp;public&nbsp;AccountInfo&nbsp;save(AccountInfo&nbsp;accountInfo);&nbsp;\r\n\r\n&nbsp;//&nbsp;你需要做的，仅仅是新增如下一行方法声明\r\n&nbsp;public&nbsp;AccountInfo&nbsp;findByAccountId(Long&nbsp;accountId);&nbsp;\r\n&nbsp;}</pre></td></tr></tbody></table><p><br/></p><p>下面总结一下使用 Spring Data JPA 进行持久层开发大致需要的三个步骤：</p><ol class=\" list-paddingleft-2\" type=\"1\"><li><p>&nbsp;</p></li><li><p>声明持久层的接口，该接口继承 Repository，Repository 是一个标记型接口，它不包含任何方法，当然如果有需要，Spring Data 也提供了若干 Repository 子接口，其中定义了一些常用的增删改查，以及分页相关的方法。</p></li><li><p>&nbsp;</p></li><li><p>在接口中声明需要的业务方法。Spring Data 将根据给定的策略（具体策略稍后讲解）来为其生成实现代码。</p></li><li><p>&nbsp;</p></li><li><p>在 Spring 配置文件中增加一行声明，让 Spring 为声明的接口创建代理对象。配置了 &lt;jpa:repositories&gt; \r\n后，Spring 初始化容器时将会扫描 base-package 指定的包目录及其子目录，为继承 Repository \r\n或其子接口的接口创建代理对象，并将代理对象注册为 Spring Bean，业务层便可以通过 Spring 自动封装的特性来直接使用该对象。</p></li><li><p>&nbsp;</p></li></ol><p>&nbsp;</p><p>此外，&lt;jpa:repository&gt; 还提供了一些属性和子标签，便于做更细粒度的控制。可以在 \r\n&lt;jpa:repository&gt; 内部使用 \r\n&lt;context:include-filter&gt;、&lt;context:exclude-filter&gt; \r\n来过滤掉一些不希望被扫描到的接口。具体的使用方法见 <a href=\"http://static.springsource.org/spring/docs/3.0.x/spring-framework-reference/html/beans.html#beans-classpath-scanning\">Spring</a><a href=\"http://static.springsource.org/spring/docs/3.0.x/spring-framework-reference/html/beans.html#beans-classpath-scanning\">参考文档</a>。</p><p>&nbsp;</p><p><a name=\"minor3.1\"></a><span class=\"smalltitle\">应该继承哪个接口？</span></p><p>&nbsp;</p><p>前面提到，持久层接口继承 Repository 并不是唯一选择。Repository 接口是 Spring Data \r\n的一个核心接口，它不提供任何方法，开发者需要在自己定义的接口中声明需要的方法。与继承 Repository \r\n等价的一种方式，就是在持久层接口上使用 @RepositoryDefinition 注解，并为其指定 domainClass 和 idClass\r\n 属性。如下两种方式是完全等价的：</p><p><br/><a name=\"listing15\"></a><strong>清单 15. 两种等价的继承接口方式示例</strong><br/></p><table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" summary=\"This table contains a code listing.\"><tbody><tr class=\"firstRow\"><td class=\"code-outline\"><pre class=\"displaycode\">				&nbsp;public&nbsp;interface&nbsp;UserDao&nbsp;extends&nbsp;Repository&lt;AccountInfo,&nbsp;Long&gt;&nbsp;{&nbsp;……&nbsp;}&nbsp;\r\n\r\n&nbsp;@RepositoryDefinition(domainClass&nbsp;=&nbsp;AccountInfo.class,&nbsp;idClass&nbsp;=&nbsp;Long.class)&nbsp;\r\n&nbsp;public&nbsp;interface&nbsp;UserDao&nbsp;{&nbsp;……&nbsp;}</pre></td></tr></tbody></table><p><br/></p><p>如果持久层接口较多，且每一个接口都需要声明相似的增删改查方法，直接继承 Repository 就显得有些啰嗦，这时可以继承 \r\nCrudRepository，它会自动为域对象创建增删改查方法，供业务层直接使用。开发者只是多写了 &quot;Crud&quot; \r\n四个字母，即刻便为域对象提供了开箱即用的十个增删改查方法。</p><p>&nbsp;</p><p>但是，使用 CrudRepository \r\n也有副作用，它可能暴露了你不希望暴露给业务层的方法。比如某些接口你只希望提供增加的操作而不希望提供删除的方法。针对这种情况，开发者只能退回到 \r\nRepository 接口，然后到 CrudRepository 中把希望保留的方法声明复制到自定义的接口中即可。</p><p>&nbsp;</p><p>分页查询和排序是持久层常用的功能，Spring Data 为此提供了 PagingAndSortingRepository \r\n接口，它继承自 CrudRepository 接口，在 CrudRepository \r\n基础上新增了两个与分页有关的方法。但是，我们很少会将自定义的持久层接口直接继承自 \r\nPagingAndSortingRepository，而是在继承 Repository 或 CrudRepository \r\n的基础上，在自己声明的方法参数列表最后增加一个 Pageable 或 Sort 类型的参数，用于指定分页或排序信息即可，这比直接使用 \r\nPagingAndSortingRepository 提供了更大的灵活性。</p><p>&nbsp;</p><p>JpaRepository 是继承自 PagingAndSortingRepository 的针对 JPA \r\n技术提供的接口，它在父接口的基础上，提供了其他一些方法，比如 flush()，saveAndFlush()，deleteInBatch() \r\n等。如果有这样的需求，则可以继承该接口。</p><p>&nbsp;</p><p>上述四个接口，开发者到底该如何选择？其实依据很简单，根据具体的业务需求，选择其中之一。笔者建议在通常情况下优先选择 \r\nRepository 接口。因为 Repository 接口已经能满足日常需求，其他接口能做到的在 Repository \r\n中也能做到，彼此之间并不存在功能强弱的问题。只是 Repository \r\n需要显示声明需要的方法，而其他则可能已经提供了相关的方法，不需要再显式声明，但如果对 Spring Data JPA \r\n不熟悉，别人在检视代码或者接手相关代码时会有疑惑，他们不明白为什么明明在持久层接口中声明了三个方法，而在业务层使用该接口时，却发现有七八个方法可\r\n用，从这个角度而言，应该优先考虑使用 Repository 接口。</p><p>&nbsp;</p><p>前面提到，Spring Data JPA 在后台为持久层接口创建代理对象时，会解析方法名字，并实现相应的功能。除了通过方法名字以外，它还可以通过如下两种方式指定查询语句：</p><ol class=\" list-paddingleft-2\" type=\"1\"><li><p>&nbsp;</p></li><li><p>Spring Data JPA 可以访问 JPA 命名查询语句。开发者只需要在定义命名查询语句时，为其指定一个符合给定格式的名字，Spring Data JPA 便会在创建代理对象时，使用该命名查询语句来实现其功能。</p></li><li><p>&nbsp;</p></li><li><p>开发者还可以直接在声明的方法上面使用 @Query 注解，并提供一个查询语句作为参数，Spring Data JPA 在创建代理对象时，便以提供的查询语句来实现其功能。</p></li><li><p>&nbsp;</p></li></ol><p>&nbsp;</p><p>下面我们分别讲述三种创建查询的方式。</p><p>&nbsp;</p><p><a name=\"minor3.2\"></a><span class=\"smalltitle\">通过解析方法名创建查询</span></p><p>&nbsp;</p><p>通过前面的例子，读者基本上对解析方法名创建查询的方式有了一个大致的了解，这也是 Spring Data JPA \r\n吸引开发者的一个很重要的因素。该功能其实并非 Spring Data JPA 首创，而是源自一个开源的 JPA 框架 Hades，该框架的作者 \r\nOliver Gierke 本身又是 Spring Data JPA 项目的 Leader，所以把 Hades 的优势引入到 Spring \r\nData JPA 也就是顺理成章的了。</p><p>&nbsp;</p><p>框架在进行方法名解析时，会先把方法名多余的前缀截取掉，比如 \r\nfind、findBy、read、readBy、get、getBy，然后对剩下部分进行解析。并且如果方法的最后一个参数是 Sort 或者 \r\nPageable 类型，也会提取相关的信息，以便按规则进行排序或者分页查询。</p><p>&nbsp;</p><p>在创建查询时，我们通过在方法名中使用属性名称来表达，比如 findByUserAddressZip ()。框架在解析该方法时，首先剔除 findBy，然后对剩下的属性进行解析，详细规则如下（此处假设该方法针对的域对象为 AccountInfo 类型）：</p><ul class=\" list-paddingleft-2\"><li><p>&nbsp;</p></li><li><p>先判断 userAddressZip （根据 POJO 规范，首字母变为小写，下同）是否为 AccountInfo 的一个属性，如果是，则表示根据该属性进行查询；如果没有该属性，继续第二步；</p></li><li><p>&nbsp;</p></li><li><p>从右往左截取第一个大写字母开头的字符串（此处为 Zip），然后检查剩下的字符串是否为 AccountInfo \r\n的一个属性，如果是，则表示根据该属性进行查询；如果没有该属性，则重复第二步，继续从右往左截取；最后假设 user 为 AccountInfo \r\n的一个属性；</p></li><li><p>&nbsp;</p></li><li><p>接着处理剩下部分（ AddressZip ），先判断 user 所对应的类型是否有 addressZip 属性，如果有，则表示该方法最终是根据 \r\n&quot;AccountInfo.user.addressZip&quot; 的取值进行查询；否则继续按照步骤 2 的规则从右往左截取，最终表示根据 \r\n&quot;AccountInfo.user.address.zip&quot; 的值进行查询。</p></li><li><p>&nbsp;</p></li></ul><p>&nbsp;</p><p>可能会存在一种特殊情况，比如 AccountInfo 包含一个 user 的属性，也有一个 userAddress \r\n属性，此时会存在混淆。读者可以明确在属性之间加上 &quot;_&quot; 以显式表达意图，比如 &quot;findByUser_AddressZip()&quot; 或者 \r\n&quot;findByUserAddress_Zip()&quot;。</p><p>&nbsp;</p><p>在查询时，通常需要同时根据多个属性进行查询，且查询的条件也格式各样（大于某个值、在某个范围等等），Spring Data JPA 为此提供了一些表达条件查询的关键字，大致如下：</p><ul class=\" list-paddingleft-2\"><li><p>&nbsp;</p></li><li><p>And --- 等价于 SQL 中的 and 关键字，比如 findByUsernameAndPassword(String user, Striang pwd)；</p></li><li><p>&nbsp;</p></li><li><p>Or --- 等价于 SQL 中的 or 关键字，比如 findByUsernameOrAddress(String user, String addr)；</p></li><li><p>&nbsp;</p></li><li><p>Between --- 等价于 SQL 中的 between 关键字，比如 findBySalaryBetween(int max, int min)；</p></li><li><p>&nbsp;</p></li><li><p>LessThan --- 等价于 SQL 中的 &quot;&lt;&quot;，比如 findBySalaryLessThan(int max)；</p></li><li><p>&nbsp;</p></li><li><p>GreaterThan --- 等价于 SQL 中的&quot;&gt;&quot;，比如 findBySalaryGreaterThan(int min)；</p></li><li><p>&nbsp;</p></li><li><p>IsNull --- 等价于 SQL 中的 &quot;is null&quot;，比如 findByUsernameIsNull()；</p></li><li><p>&nbsp;</p></li><li><p>IsNotNull --- 等价于 SQL 中的 &quot;is not null&quot;，比如 findByUsernameIsNotNull()；</p></li><li><p>&nbsp;</p></li><li><p>NotNull --- 与 IsNotNull 等价；</p></li><li><p>&nbsp;</p></li><li><p>Like --- 等价于 SQL 中的 &quot;like&quot;，比如 findByUsernameLike(String user)；</p></li><li><p>&nbsp;</p></li><li><p>NotLike --- 等价于 SQL 中的 &quot;not like&quot;，比如 findByUsernameNotLike(String user)；</p></li><li><p>&nbsp;</p></li><li><p>OrderBy --- 等价于 SQL 中的 &quot;order by&quot;，比如 findByUsernameOrderBySalaryAsc(String user)；</p></li><li><p>&nbsp;</p></li><li><p>Not --- 等价于 SQL 中的 &quot;！ =&quot;，比如 findByUsernameNot(String user)；</p></li><li><p>&nbsp;</p></li><li><p>In --- 等价于 SQL 中的 &quot;in&quot;，比如 findByUsernameIn(Collection&lt;String&gt; userList) ，方法的参数可以是 Collection 类型，也可以是数组或者不定长参数；</p></li><li><p>&nbsp;</p></li><li><p>NotIn --- 等价于 SQL 中的 &quot;not in&quot;，比如 findByUsernameNotIn(Collection&lt;String&gt; userList) ，方法的参数可以是 Collection 类型，也可以是数组或者不定长参数；</p></li><li><p>&nbsp;</p></li></ul><p>&nbsp;</p><p><a name=\"minor3.3\"></a><span class=\"smalltitle\">使用 @Query 创建查询</span></p><p>&nbsp;</p><p>@Query 注解的使用非常简单，只需在声明的方法上面标注该注解，同时提供一个 JP QL 查询语句即可，如下所示：</p><p><br/><a name=\"listing16\"></a><strong>清单 16. 使用 @Query 提供自定义查询语句示例</strong><br/></p><table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" summary=\"This table contains a code listing.\"><tbody><tr class=\"firstRow\"><td class=\"code-outline\"><pre class=\"displaycode\">				&nbsp;public&nbsp;interface&nbsp;UserDao&nbsp;extends&nbsp;Repository&lt;AccountInfo,&nbsp;Long&gt;&nbsp;{&nbsp;\r\n\r\n&nbsp;@Query(&quot;select&nbsp;a&nbsp;from&nbsp;AccountInfo&nbsp;a&nbsp;where&nbsp;a.accountId&nbsp;=&nbsp;?1&quot;)&nbsp;\r\n&nbsp;public&nbsp;AccountInfo&nbsp;findByAccountId(Long&nbsp;accountId);&nbsp;\r\n\r\n&nbsp;&nbsp;&nbsp;&nbsp;@Query(&quot;select&nbsp;a&nbsp;from&nbsp;AccountInfo&nbsp;a&nbsp;where&nbsp;a.balance&nbsp;&gt;&nbsp;?1&quot;)&nbsp;\r\n&nbsp;public&nbsp;Page&lt;AccountInfo&gt;&nbsp;findByBalanceGreaterThan(&nbsp;\r\n&nbsp;Integer&nbsp;balance,Pageable&nbsp;pageable);&nbsp;\r\n&nbsp;}</pre></td></tr></tbody></table><p><br/></p><p>很多开发者在创建 JP QL 时喜欢使用命名参数来代替位置编号，@Query 也对此提供了支持。JP QL 语句中通过&quot;: 变量&quot;的格式来指定参数，同时在方法的参数前面使用 @Param 将方法参数与 JP QL 中的命名参数对应，示例如下：</p><p><br/><a name=\"listing17\"></a><strong>清单 17. @Query 支持命名参数示例</strong><br/></p><table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" summary=\"This table contains a code listing.\"><tbody><tr class=\"firstRow\"><td class=\"code-outline\"><pre class=\"displaycode\">				&nbsp;public&nbsp;interface&nbsp;UserDao&nbsp;extends&nbsp;Repository&lt;AccountInfo,&nbsp;Long&gt;&nbsp;{&nbsp;\r\n\r\n&nbsp;public&nbsp;AccountInfo&nbsp;save(AccountInfo&nbsp;accountInfo);&nbsp;\r\n\r\n&nbsp;@Query(&quot;from&nbsp;AccountInfo&nbsp;a&nbsp;where&nbsp;a.accountId&nbsp;=&nbsp;:id&quot;)&nbsp;\r\n&nbsp;public&nbsp;AccountInfo&nbsp;findByAccountId(@Param(&quot;id&quot;)Long&nbsp;accountId);&nbsp;\r\n\r\n&nbsp;&nbsp;&nbsp;@Query(&quot;from&nbsp;AccountInfo&nbsp;a&nbsp;where&nbsp;a.balance&nbsp;&gt;&nbsp;:balance&quot;)&nbsp;\r\n&nbsp;&nbsp;&nbsp;public&nbsp;Page&lt;AccountInfo&gt;&nbsp;findByBalanceGreaterThan(&nbsp;\r\n&nbsp;@Param(&quot;balance&quot;)Integer&nbsp;balance,Pageable&nbsp;pageable);&nbsp;\r\n&nbsp;}</pre></td></tr></tbody></table><p><br/></p><p>此外，开发者也可以通过使用 @Query 来执行一个更新操作，为此，我们需要在使用 @Query 的同时，用 @Modifying 来将该操作标识为修改查询，这样框架最终会生成一个更新的操作，而非查询。如下所示：</p><p><br/><a name=\"listing18\"></a><strong>清单 18. 使用 @Modifying 将查询标识为修改查询</strong><br/></p><table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" summary=\"This table contains a code listing.\"><tbody><tr class=\"firstRow\"><td class=\"code-outline\"><pre class=\"displaycode\">				&nbsp;@Modifying&nbsp;\r\n&nbsp;@Query(&quot;update&nbsp;AccountInfo&nbsp;a&nbsp;set&nbsp;a.salary&nbsp;=&nbsp;?1&nbsp;where&nbsp;a.salary&nbsp;&lt;&nbsp;?2&quot;)&nbsp;\r\n&nbsp;public&nbsp;int&nbsp;increaseSalary(int&nbsp;after,&nbsp;int&nbsp;before);</pre></td></tr></tbody></table><p><br/></p><p><a name=\"minor3.4\"></a><span class=\"smalltitle\">通过调用 JPA 命名查询语句创建查询</span></p><p>&nbsp;</p><p>命名查询是 JPA 提供的一种将查询语句从方法体中独立出来，以供多个方法共用的功能。Spring Data JPA \r\n对命名查询也提供了很好的支持。用户只需要按照 JPA 规范在 orm.xml 文件或者在代码中使用 @NamedQuery（或 \r\n@NamedNativeQuery）定义好查询语句，唯一要做的就是为该语句命名时，需要满足”DomainClass.methodName()”的\r\n命名规则。假设定义了如下接口：</p><p><br/><a name=\"listing19\"></a><strong>清单 19. 使用 JPA 命名查询时，声明接口及方法时不需要什么特殊处理</strong><br/></p><table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" summary=\"This table contains a code listing.\"><tbody><tr class=\"firstRow\"><td class=\"code-outline\"><pre class=\"displaycode\">				&nbsp;public&nbsp;interface&nbsp;UserDao&nbsp;extends&nbsp;Repository&lt;AccountInfo,&nbsp;Long&gt;&nbsp;{&nbsp;\r\n\r\n&nbsp;......&nbsp;\r\n&nbsp;&nbsp;&nbsp;\r\n&nbsp;public&nbsp;List&lt;AccountInfo&gt;&nbsp;findTop5();&nbsp;\r\n&nbsp;}</pre></td></tr></tbody></table><p><br/></p><p>如果希望为 findTop5() 创建命名查询，并与之关联，我们只需要在适当的位置定义命名查询语句，并将其命名为 \r\n&quot;AccountInfo.findTop5&quot;，框架在创建代理类的过程中，解析到该方法时，优先查找名为 \r\n&quot;AccountInfo.findTop5&quot; 的命名查询定义，如果没有找到，则尝试解析方法名，根据方法名字创建查询。</p><p>&nbsp;</p><p><a name=\"minor3.5\"></a><span class=\"smalltitle\">创建查询的顺序</span></p><p>&nbsp;</p><p>Spring Data JPA \r\n在为接口创建代理对象时，如果发现同时存在多种上述情况可用，它该优先采用哪种策略呢？为此，&lt;jpa:repositories&gt; 提供了\r\n query-lookup-strategy 属性，用以指定查找的顺序。它有如下三个取值：</p><ul class=\" list-paddingleft-2\"><li><p>&nbsp;</p></li><li><p>create --- 通过解析方法名字来创建查询。即使有符合的命名查询，或者方法通过 @Query 指定的查询语句，都将会被忽略。</p></li><li><p>&nbsp;</p></li><li><p>create-if-not-found --- 如果方法通过 @Query \r\n指定了查询语句，则使用该语句实现查询；如果没有，则查找是否定义了符合条件的命名查询，如果找到，则使用该命名查询；如果两者都没有找到，则通过解析方\r\n法名字来创建查询。这是 query-lookup-strategy 属性的默认值。</p></li><li><p>&nbsp;</p></li><li><p>use-declared-query --- 如果方法通过 @Query 指定了查询语句，则使用该语句实现查询；如果没有，则查找是否定义了符合条件的命名查询，如果找到，则使用该命名查询；如果两者都没有找到，则抛出异常。</p></li><li><p>&nbsp;</p></li></ul><p>&nbsp;</p><p><a name=\"minor3.6\"></a><span class=\"smalltitle\">Spring Data JPA 对事务的支持</span></p><p>&nbsp;</p><p>默认情况下，Spring Data JPA 实现的方法都是使用事务的。针对查询类型的方法，其等价于 \r\n@Transactional(readOnly=true)；增删改类型的方法，等价于 \r\n@Transactional。可以看出，除了将查询的方法设为只读事务外，其他事务属性均采用默认值。</p><p>&nbsp;</p><p>如果用户觉得有必要，可以在接口方法上使用 @Transactional 显式指定事务属性，该值覆盖 Spring Data JPA \r\n提供的默认值。同时，开发者也可以在业务层方法上使用 @Transactional \r\n指定事务属性，这主要针对一个业务层方法多次调用持久层方法的情况。持久层的事务会根据设置的事务传播行为来决定是挂起业务层事务还是加入业务层的事务。\r\n具体 @Transactional 的使用，请参考 <a href=\"http://static.springsource.org/spring/docs/3.0.x/spring-framework-reference/html/transaction.html#transaction-declarative-annotations\">Spring</a><a href=\"http://static.springsource.org/spring/docs/3.0.x/spring-framework-reference/html/transaction.html#transaction-declarative-annotations\">的参考文档</a>。</p><p>&nbsp;</p><p><a name=\"minor3.7\"></a><span class=\"smalltitle\">为接口中的部分方法提供自定义实现</span></p><p>&nbsp;</p><p>有些时候，开发者可能需要在某些方法中做一些特殊的处理，此时自动生成的代理对象不能完全满足要求。为了享受 Spring Data JPA 带给我们的便利，同时又能够为部分方法提供自定义实现，我们可以采用如下的方法：</p><ul class=\" list-paddingleft-2\"><li><p>&nbsp;</p></li><li><p>将需要开发者手动实现的方法从持久层接口（假设为 AccountDao ）中抽取出来，独立成一个新的接口（假设为 AccountDaoPlus ），并让 AccountDao 继承 AccountDaoPlus；</p></li><li><p>&nbsp;</p></li><li><p>为 AccountDaoPlus 提供自定义实现（假设为 AccountDaoPlusImpl ）；</p></li><li><p>&nbsp;</p></li><li><p>将 AccountDaoPlusImpl 配置为 Spring Bean；</p></li><li><p>&nbsp;</p></li><li><p>在 &lt;jpa:repositories&gt; 中按清单 19 的方式进行配置。</p></li><li><p>&nbsp;</p></li></ul><p><br/><a name=\"listing20\"></a><strong>清单 20. 指定自定义实现类</strong><br/></p><table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" summary=\"This table contains a code listing.\"><tbody><tr class=\"firstRow\"><td class=\"code-outline\"><pre class=\"displaycode\">				&nbsp;&lt;jpa:repositories&nbsp;base-package=&quot;footmark.springdata.jpa.dao&quot;&gt;&nbsp;\r\n&nbsp;&lt;jpa:repository&nbsp;id=&quot;accountDao&quot;&nbsp;repository-impl-ref=&quot;&nbsp;accountDaoPlus&nbsp;&quot;&nbsp;/&gt;&nbsp;\r\n&nbsp;&lt;/jpa:repositories&gt;&nbsp;\r\n\r\n&nbsp;&lt;bean&nbsp;id=&quot;accountDaoPlus&quot;&nbsp;class=&quot;.......&quot;/&gt;</pre></td></tr></tbody></table><p><br/></p><p>此外，&lt;jpa:repositories &gt; 提供了一个 repository-impl-postfix 属性，用以指定实现类的后缀。假设做了如下配置：</p><p><br/><a name=\"listing21\"></a><strong>清单 21. 设置自动查找时默认的自定义实现类命名规则</strong><br/></p><table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" summary=\"This table contains a code listing.\"><tbody><tr class=\"firstRow\"><td class=\"code-outline\"><pre class=\"displaycode\">				&nbsp;&lt;jpa:repositories&nbsp;base-package=&quot;footmark.springdata.jpa.dao&quot;\r\n&nbsp;repository-impl-postfix=&quot;Impl&quot;/&gt;</pre></td></tr></tbody></table><p><br/></p><p>则在框架扫描到 AccountDao 接口时，它将尝试在相同的包目录下查找 AccountDaoImpl.java，如果找到，便将其中的实现方法作为最终生成的代理类中相应方法的实现。</p><p>&nbsp;</p><p class=\"ibm-ind-link ibm-back-to-top\"><a class=\"ibm-anchor-up-link\" href=\"http://www.ibm.com/developerworks/cn/opensource/os-cn-spring-jpa/#ibm-pcon\">回页首</a></p><p><a name=\"major4\"></a><span class=\"atitle\">结束语</span></p><p>&nbsp;</p><p>本文主要介绍了 Spring Data JPA 的使用，以及它与 Spring 框架的无缝集成。Spring Data JPA 其实并不依赖于 Spring 框架，有兴趣的读者可以参考本文最后的&quot;参考资源&quot;进一步学习。</p><p>&nbsp;</p>','2014-05-13 06:14:15'),(3,'长江与丝路双向开放 重庆保税物流增添新机遇','<p>聚焦保税港区</p><p>商报记者 高亮</p><p>5月9日，保税港区机器轰鸣，一座面积达18万平方米的物流中心明年将在这里落成。这是澳大利亚嘉民集团打造的重点物流项目，也是保税港区发展保税物流的一个缩影。</p><p>作为连接长江经济带、丝绸之路经济带的内陆国际物流枢纽，重庆正成为跨国物流巨头抢滩发展的枢纽城市。在两江新区，重庆保税港以其口岸优势和果园\r\n港、空港、铁路港的联动优势，成为聚集辐射长江经济带、丝绸之路经济带物流的枢纽港，南来北往、承东启西的战略区位，使保税物流发展强劲，成为支撑重庆内\r\n陆开放高地建设的战略支点。</p><p>保税物流是保税港区重要功能，在重庆海关等部门的帮助下，区内2013年全年累计实现进出口总额204.62亿美元，同比增长33.91%，进出口外贸集装箱34万标箱，海关监管货物货值达246亿美元。</p><p>重点引进龙头企业</p><p>“去年10月开工建设，今年10月竣工三分之一，明年10月全部建成并投入使用。”嘉民集团中国区总经理黄炜说。对于上千亩的物流中心而言，这样的建设速度让人震惊，事实上，嘉民从第一次接触保税港区到落户，不到一年。</p><p>黄炜说，三年前嘉民第一次和保税港区接触，那时很多客户正从沿海向重庆转移，加之对重庆发展前景看好，嘉民决定西进，在渝布局两大项目均选择两江新区。</p><p>“保税港区的工作效率让我们十分满意。”黄炜说，保税港区业务非常活跃，加上政府的鼓励政策和高效的工作效率，嘉民决定追加投资，“在目前投资一亿美元的基础上，再追加一亿美元，把这里打造成为嘉民在西南战略布局的关键一环。”</p><p>保税港区将保税物流发展壮大的思路：引进龙头物流企业，形成物流产业规模发展。目前，菜鸟网络、新加坡普洛斯&amp;日本三菱商事等知名物流企业先后签约入驻，投资总额达50亿元；另与美国安博等达成合作意向，K分区1.88平方公里现代商贸产业物流园已基本布局完成。</p><p>物流产业规模发展</p><p>目前，保税港区正大力打造空港功能区A分区物流集散分拨中心，与意向投资企业合作规划建设海关二级监管仓库及航空产业物流配送中心等航空物流基础设施。</p><p>此外，保税港区还加快进境肉类指定口岸、进口水果口岸建设相关工作。目前，进口水果口岸建设已经正式投入运行，消费者在家门口就能买到新鲜的进口水果，进境肉类指定口岸也将在近期正式对外开放。</p><p>打造现代物流产业集群</p><p>日前，国务院总理李克强在重庆考察，并主持召开依托黄金水道推动长江经济带发展座谈会。李克强强调,建设长江经济带要实施东西双向开放战略,与依托亚欧大陆桥的丝绸之路经济带相连接,构建沿海、沿江、沿边全方位开放新格局。</p><p>这为保税港区发展保税物流带来巨大机遇。记者获悉，下一步保税港区将发力打造现代物流产业集群。</p><p>&nbsp;</p><p>一是依托国际物流口岸功能优势，利用江北国际机场提供具备保税功能的综合性物流服务，在空港功能区打造物流集散分拨中心并形成现代物流产业\r\n集群。二是借助“渝新欧”等国际物流通道，吸引回程货物在保税港区集聚和分拨；利用长江黄金水道货运优势，争取各类特设口岸，通过“区域联动”、“水水中\r\n转”等形成以寸滩港为核心的多式联运物流枢纽。</p><p>此外，保税港区还要引进联动上下游的知名企业带动国际物流产业集群,力争至2017年形成占地面积逾5000亩的内陆地区现代化保税物流基地，机场国际货运量超过50万吨，外贸集装箱吞吐量达到120万标箱，海关税收达到200亿元以上。</p><p></p>','2014-05-13 06:15:14'),(4,'中国仓储物流商机吸引外资目光','<p>毕马威(KPMG)最近的一份报告称，到2020年，中国的电子商务产业总规模将超过<a href=\"http://news.hexun.com/usa/index.html\" target=\"_blank\">美国</a>、<a href=\"http://news.hexun.com/britain/index.html\" target=\"_blank\">英国</a>、<a href=\"http://news.hexun.com/2013/japan/index.html\" target=\"_blank\">日本</a>、<a href=\"http://news.hexun.com/germany/index.html\" target=\"_blank\">德国</a>和<a href=\"http://news.hexun.com/france/index.html\" target=\"_blank\">法国</a>的总和。但中国的仓库普遍面临老化问题，既没有现代化管理手段，也缺乏最新技术，现有仓库中只有不到20%算得上先进，配备有全方位电脑追踪系统和最先进的零售科技。一家建筑公司预测，仅未来15年可能需要投资多达2.5万亿美元购买土地和新建仓库。<a onmouseover=\"tipBlogT.showGsInfo(this,&#39;http://gongsi.hexun.com/gs_1056.shtml&#39;)\" href=\"http://gongsi.hexun.com/fc_1056.shtml\" target=\"_blank\">黑石集团</a>和凯雷投资集团等众多全球<a href=\"http://funds.hexun.com/smjj/\" target=\"_blank\">私募</a>股权公司被这一美好前景吸引，纷纷想从这场投资盛宴中分一杯羹。中国物流设施领域最大的外资建筑商普洛斯预计，未来15年需要投资的2.5万亿美元也只能让人均拥有的全自动现代仓储空间达到美国三分之一的水平。</p>','2014-05-13 06:15:36');
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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wl_owner`
--

LOCK TABLES `wl_owner` WRITE;
/*!40000 ALTER TABLE `wl_owner` DISABLE KEYS */;
INSERT INTO `wl_owner` VALUES (1,14,2,'1396073821225','owner','gril',36,'15669015861','857062470@qq.com'),(2,16,1,'1399773443844','bc','gril',17,'15669015861','857062470@qq.com');
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
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wl_user`
--

LOCK TABLES `wl_user` WRITE;
/*!40000 ALTER TABLE `wl_user` DISABLE KEYS */;
INSERT INTO `wl_user` VALUES (1,'admin','admin','cb47846583fe40bca380034c0346d17b4f17cd01','e42db548d864a9cb','857062470@qq.com',NULL,3,'2012-06-03 17:00:00'),(2,'user','Calvin','2488aa0c31c624687bd9928e0a5d29e7d1ed520b','6d65d24122c30500','857062470@qq.com',NULL,3,'2012-06-03 18:00:00'),(9,'a','a','a3c6befa42b21286a92f133c7b06d22c4730ef92','b96d39af581dea78','857062470@qq.com',NULL,1,'2014-03-29 06:09:41'),(10,'mag','mag','73779a6702e64abcb51fd62efdba05bb803c6ac8','1eacf41e4444989e','857062470@qq.com',NULL,3,'2014-03-29 06:10:43'),(11,'controlller','controlller','d4c453a3cc66c6d59729396809c3ee828e3d227a','38c35a58b9a1799b','857062470@qq.com',NULL,1,'2014-03-29 06:11:15'),(13,'customer','customer','ac5d75e6c7f277e5ab457dbd6952a0fd01056f71','9f2c629c6b8a77be','857062470@qq.com',NULL,2,'2014-03-29 06:12:51'),(14,'owner','owner','498a0b0018348d8c90e462522ca0a8c15157210a','7763b9c13b7dd332','857062470@qq.com',NULL,4,'2014-03-29 06:17:01'),(15,'cus','cus','9c483136e1d48574565ccde1ad285a4772c30256','cc8fa531b5b0a84c','857062470@qq.com',NULL,2,'2014-05-11 01:48:15'),(16,'bc','bc','b5b163018b2c746e5200f53a1bd6e17c4d90b858','1019ce0169556fd1','857062470@qq.com',NULL,4,'2014-05-11 01:57:23'),(17,'test','test','1100fdfc742eb10035087bf8cec2f783c14a4e0b','aed037101123c25f','8570962470@qq.com',NULL,2,'2014-05-14 02:29:42'),(18,'cus1','冯晓晨','72dd2593d4116d5c2b4bb0ef7fca317563803386','9da2506ee472b45f','8570962470@qq.com',NULL,2,'2014-05-29 08:07:09'),(19,'cus2','王超','252674bb5994a7955f2ba3b234cba1224b9fca17','28d8f8641fc2da9c','8570962470@qq.com',NULL,2,'2014-05-29 08:07:38'),(20,'cus3','王刚','a664ce4e4137d158a715a61d198b9278a79b9a90','e0d4cd50b8e2e242','8570962470@qq.com',NULL,2,'2014-05-29 08:08:12'),(21,'cus4','陈志','b722f13c21060eb9e01f8e6d37d79929b925b873','725ecc74a3565bcc','8570962470@qq.com',NULL,2,'2014-05-29 08:08:38'),(22,'cus5','都敏俊','094cdf7234bf7bdf9af5da59a79cd1e60f22eaf4','833266174ca4fb71','8570962470@qq.com',NULL,2,'2014-05-29 08:09:03'),(23,'cus6','张绍刚','65eae4744bd51929567a362d5cb755ff7ec8fc89','37be34cbebbd6507','8570962470@qq.com',NULL,2,'2014-05-29 08:09:27'),(24,'controlll','controlll','87d71e93fe29a14092b0dccb06a5ef6f3a719dd3','2cdbf36005690cd5','8570962470@qq.com',NULL,1,'2014-06-09 02:43:40');
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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wl_vehicle`
--

LOCK TABLES `wl_vehicle` WRITE;
/*!40000 ALTER TABLE `wl_vehicle` DISABLE KEYS */;
INSERT INTO `wl_vehicle` VALUES (1,1,'浙 A 123456','车',10),(2,1,'浙 A 123457','车',100),(3,2,'浙 A 123567','车',100);
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
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wl_waybill`
--

LOCK TABLES `wl_waybill` WRITE;
/*!40000 ALTER TABLE `wl_waybill` DISABLE KEYS */;
INSERT INTO `wl_waybill` VALUES (5,5,2,'020140529162511','冯晓晨',1566901,'浙江省杭州市西湖区留和路288号','王刚',1566901,'广西省桂林市七星区漓江路一号',100,67,'集装箱',5025.00,'2014-05-29 00:00:00',NULL,'','现金','1'),(6,2,2,'020140611122559','冯晓晨',1566901,'浙江省杭州市西湖区留和路288号','王凡',1566901,'广西省桂林市七星区漓江路一号',100,67,'集装箱',5025.00,'2014-06-11 00:00:00',NULL,'','现金','1'),(7,3,3,'020140611144846','冯晓晨',1566901,'浙江省杭州市西湖区留和路288号','王刚',1566901,'广西省桂林市七星区漓江路一号',100,100,'集装箱',10000.00,'2012-02-29 00:00:00','2014-06-11 14:50:30','','转账','1'),(8,2,2,'020140612165754','冯晓晨',1566901,'浙江省杭州市西湖区留和路288号','陈志强',1566901,'浙江省杭州市西湖区滨江区联庄二区',100,67,'集装箱',10000.00,'2012-02-23 00:00:00',NULL,'','转账','1');
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
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wl_waybillstatus`
--

LOCK TABLES `wl_waybillstatus` WRITE;
/*!40000 ALTER TABLE `wl_waybillstatus` DISABLE KEYS */;
INSERT INTO `wl_waybillstatus` VALUES (24,6,2,3,'2014-06-11 12:26:24','分派车辆中'),(25,5,2,3,'2014-06-11 12:26:36','分派车辆中'),(26,7,2,3,'2014-06-11 14:50:17','分派车辆中'),(27,7,2,3,'2014-06-11 14:50:30','配送完成');
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

-- Dump completed on 2014-06-15 11:38:26
