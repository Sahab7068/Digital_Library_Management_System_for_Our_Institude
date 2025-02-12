-- MySQL dump 10.13  Distrib 8.0.41, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: guruskm_library
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.32-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `fullshift`
--

DROP TABLE IF EXISTS `fullshift`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fullshift` (
  `seet_no` varchar(20) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `father_name` varchar(20) DEFAULT NULL,
  `mobile` varchar(20) DEFAULT NULL,
  `gender` varchar(20) DEFAULT NULL,
  `exam` varchar(20) DEFAULT NULL,
  `book_time` varchar(200) DEFAULT NULL,
  `diposit` varchar(20) DEFAULT NULL,
  `seetDrop_time` varchar(300) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fullshift`
--

LOCK TABLES `fullshift` WRITE;
/*!40000 ALTER TABLE `fullshift` DISABLE KEYS */;
INSERT INTO `fullshift` VALUES ('01','APLPNA ','OM PRAKASH ','9129740143','Female','NEET EXAM','Thu Feb 06 11:27:23 IST 2025','1800',NULL),('02','RADHIKA ','RAMESH','8081898166','Female','UPSC EXAM','Thu Feb 06 11:31:40 IST 2025','1500',NULL),('03','sdf','asdfa','dfasd','Male','asd','Sat Feb 08 20:06:03 IST 2025','adsf','2025-02-08 20:07:26'),('04','sdfd','asdfasd','fasd','Male','fasdfasd','Sat Feb 08 20:08:56 IST 2025','f','2025-02-08 20:10:19'),('05','s','dasdas','ddfsad','Male','dsfasdasdfasdf','Sat Feb 08 20:16:52 IST 2025','asdf','2025-02-08 20:18:24'),('06','s','dasdas','ddfsad','Male','dsfasdasdfasdf','Sat Feb 08 20:16:52 IST 2025','asdf',''),('07','asdfa','dfasdf','asdfadf','Male','sdfasdas','Sat Feb 08 20:18:36 IST 2025','dfasdf',''),('10','asdfa','dfasdf','asdfadf','Male','sdfasdas','Sat Feb 08 20:18:36 IST 2025','dfasdf',''),('08','asdfasdfa','sdfasd','fasdf','Male','sdfasdfadfa','Sat Feb 08 20:20:32 IST 2025','sdfads','2025-02-08 20:24:57'),('08','dsad','fasdf','asdasdfasdf','Male','sfasdf','Sat Feb 08 20:23:25 IST 2025','52000','2025-02-08 20:24:57'),('09','ram','shyam','8081890779','Male','neet','Wed Feb 12 15:56:51 IST 2025','1500','2025-02-12 15:58:50'),('11','ava','asdf','asdf','Male',' afd','Wed Feb 12 16:35:31 IST 2025','5000','2025-02-12 16:36:50');
/*!40000 ALTER TABLE `fullshift` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-02-12 20:28:45
