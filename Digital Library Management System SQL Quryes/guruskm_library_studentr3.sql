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
-- Table structure for table `studentr3`
--

DROP TABLE IF EXISTS `studentr3`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `studentr3` (
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
-- Dumping data for table `studentr3`
--

LOCK TABLES `studentr3` WRITE;
/*!40000 ALTER TABLE `studentr3` DISABLE KEYS */;
INSERT INTO `studentr3` VALUES ('10','dono','dono','dono','Male','dn','Fri Feb 07 17:21:25 IST 2025','100',NULL),('03','asdf','adsf','asdf','Male','asdf','Fri Feb 07 17:22:40 IST 2025','asdf',NULL),('05','am','adf','saddf','Male','asdf','Fri Feb 07 17:36:16 IST 2025',' 541',NULL),('01','asdsdfa','ada','sdfasdf','Male','asdf','Fri Feb 07 17:39:56 IST 2025','asfd',NULL),('04','dekho','kya','mobl','Male','jee','Fri Feb 07 17:43:01 IST 2025','12000',NULL),('27','dekho','kya','mobl','Male','jee','Fri Feb 07 17:43:01 IST 2025','12000',NULL),('09','asdfa','sdfa','ada','Male','dasa','Fri Feb 07 17:47:38 IST 2025','adf',NULL),('08','as','dfadf','ada','Male','ads','Fri Feb 07 17:49:27 IST 2025','sdf',NULL),('11','ad','adfa','asd','Male','adfad','Fri Feb 07 17:54:03 IST 2025','asf',NULL),('02','jafdnm','asdf','adf','Male','adf','Sat Feb 08 15:28:40 IST 2025','aasdf','2025-02-12 14:37:01'),('02','ss','asdasd','as','Male','asd1000','Wed Feb 12 14:35:48 IST 2025','dfg100','2025-02-12 14:37:01');
/*!40000 ALTER TABLE `studentr3` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-02-12 20:28:44
