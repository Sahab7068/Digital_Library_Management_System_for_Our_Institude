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
-- Table structure for table `studentr`
--

DROP TABLE IF EXISTS `studentr`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `studentr` (
  `seet_no` varchar(20) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `father_name` varchar(20) DEFAULT NULL,
  `mobile` varchar(20) DEFAULT NULL,
  `gender` varchar(20) DEFAULT NULL,
  `exam` varchar(20) DEFAULT NULL,
  `book_time` varchar(200) DEFAULT NULL,
  `diposit` varchar(20) DEFAULT NULL,
  `seetDrop_time` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studentr`
--

LOCK TABLES `studentr` WRITE;
/*!40000 ALTER TABLE `studentr` DISABLE KEYS */;
INSERT INTO `studentr` VALUES ('02','NEHA PAL','RAMESH','4815455','Female','JEE','Fri Feb 07 15:48:08 IST 2025','1500','2025-02-07 16:06:12'),('02','ARUN MAURYA','SURENDRA KUMAR','7988545875','Male','UPSC','Fri Feb 07 15:55:01 IST 2025','500','2025-02-07 16:06:12'),('03','SURAJ VERMA','SURENDRA VERMA','7','Male','JEE','Fri Feb 07 16:01:55 IST 2025','500','2025-02-07 16:04:03'),('02','RAM KUMAR','SEETA RAM','79450','Male','JEE','Fri Feb 07 16:04:40 IST 2025','200','2025-02-07 16:06:12'),('02','ROHIT SHARMA','SONU SHARMA','7905806996','Male','UPSC','Fri Feb 07 16:09:28 IST 2025','500','Reserved'),('04','DHEERAJ KUMAR','MANOJ KUMAR','7545','Male','NEET','Fri Feb 07 16:13:26 IST 2025','155','2025-02-08 15:05:13'),('04','dog','cat','00','Male','0','Fri Feb 07 16:17:46 IST 2025','0','2025-02-08 15:05:13'),('04','VIKASH SINGH','DHIRENDRA SINGH','7894554545','Male','SSC','Fri Feb 07 16:21:07 IST 2025','500','2025-02-08 15:05:13'),('04','AD','ADSF','ASDF','Male','ASDF','Fri Feb 07 16:50:55 IST 2025','500','2025-02-08 15:05:13'),('5','Sumitra','radhysam','21000','Male','UPSSSC','01/02/2025','500','Reserved'),('05','sume','adf','454545','Male','adf','Fri Feb 07 17:06:46 IST 2025','450','2025-02-07 17:08:04'),('04','ram','ara','adf','Male','asdf','Sat Feb 08 15:03:03 IST 2025','500','Active'),('04','ram kumar','shyam','12154212','Male','upsc','Tue Feb 11 17:44:23 IST 2025','500','Active');
/*!40000 ALTER TABLE `studentr` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-02-12 20:28:42
