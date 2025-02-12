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
-- Table structure for table `studentr2`
--

DROP TABLE IF EXISTS `studentr2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `studentr2` (
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
-- Dumping data for table `studentr2`
--

LOCK TABLES `studentr2` WRITE;
/*!40000 ALTER TABLE `studentr2` DISABLE KEYS */;
INSERT INTO `studentr2` VALUES ('01','set','fddf','sdfsd','Male','sdf','Wed Feb 05 19:47:31 IST 2025','500',NULL),('02','raghul','ghanm','adf','Male','exa','Sat Feb 08 15:18:30 IST 2025','500',''),('03','adsfd','asdfa','sdfa','Male','adsf','Sat Feb 08 15:22:10 IST 2025','adfs','2025-02-12 15:56:59'),('03','good','sdgd','4','Male',' kllkjlk','Tue Feb 11 17:48:36 IST 2025',' klj','2025-02-12 15:56:59'),('07','sdsd','asdasd','asda','Male','asd','Wed Feb 12 14:33:52 IST 2025','5000','2025-02-12 14:35:03'),('03','ram','shyam','8081890799','Male','upsc','Wed Feb 12 15:55:28 IST 2025','500','2025-02-12 15:56:59'),('10','divyansu','divyansu','8081890779','Male','java','Wed Feb 12 16:01:04 IST 2025','500','2025-02-12 16:02:39');
/*!40000 ALTER TABLE `studentr2` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-02-12 20:28:47
