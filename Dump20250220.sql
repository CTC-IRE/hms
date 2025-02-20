-- MySQL dump 10.13  Distrib 8.0.41, for Win64 (x86_64)
--
-- Host: localhost    Database: hms
-- ------------------------------------------------------
-- Server version	8.4.4

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
-- Table structure for table `bills`
--

DROP TABLE IF EXISTS `bills`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bills` (
  `bill_id` text,
  `room_id` text,
  `guest_id` text,
  `res_id` text,
  `Total` text,
  `paid` text,
  `date_created` text,
  `date_paid` text,
  `notes` text,
  `status` text,
  `txn_id` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bills`
--

LOCK TABLES `bills` WRITE;
/*!40000 ALTER TABLE `bills` DISABLE KEYS */;
/*!40000 ALTER TABLE `bills` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `blilcycl`
--

DROP TABLE IF EXISTS `blilcycl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `blilcycl` (
  `BillingCycl_id` int DEFAULT NULL,
  `Date_Run` text,
  `ResevBilld` int DEFAULT NULL,
  `BillLogg` text,
  `V1` text,
  `V2` text,
  `V3` text,
  `LastRun` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `blilcycl`
--

LOCK TABLES `blilcycl` WRITE;
/*!40000 ALTER TABLE `blilcycl` DISABLE KEYS */;
/*!40000 ALTER TABLE `blilcycl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `guests`
--

DROP TABLE IF EXISTS `guests`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `guests` (
  `ID` int DEFAULT NULL,
  `Prefix` text,
  `FirstName` text,
  `LastName` text,
  `Address_1` text,
  `Address_2` text,
  `Town_City` text,
  `County` text,
  `Country` text,
  `Phone1` text,
  `Phone2` text,
  `Reference` text,
  `Email` text,
  `UserField1` text,
  `UserField2` text,
  `ExtraField1` text,
  `ExtraField2` text,
  `FirstDate` date DEFAULT NULL,
  `LastDate` date DEFAULT NULL,
  `Status` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `guests`
--

LOCK TABLES `guests` WRITE;
/*!40000 ALTER TABLE `guests` DISABLE KEYS */;
/*!40000 ALTER TABLE `guests` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `occupancy`
--

DROP TABLE IF EXISTS `occupancy`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `occupancy` (
  `Date` text,
  `Occupied` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `occupancy`
--

LOCK TABLES `occupancy` WRITE;
/*!40000 ALTER TABLE `occupancy` DISABLE KEYS */;
INSERT INTO `occupancy` VALUES ('00/01/1900',0),('01/01/1900',0),('02/01/1900',0),('03/01/1900',0),('04/01/1900',0),('05/01/1900',0),('06/01/1900',0),('07/01/1900',0),('08/01/1900',0),('09/01/1900',0),('10/01/1900',0),('11/01/1900',0),('12/01/1900',0),('13/01/1900',0),('14/01/1900',0),('15/01/1900',0),('16/01/1900',0),('17/01/1900',0),('18/01/1900',0),('19/01/1900',0),('20/01/1900',0),('21/01/1900',0),('22/01/1900',0),('23/01/1900',0),('24/01/1900',0),('25/01/1900',0),('26/01/1900',0),('27/01/1900',0),('28/01/1900',0),('29/01/1900',0),('30/01/1900',0),('31/01/1900',0),('01/02/1900',0),('02/02/1900',0),('03/02/1900',0),('04/02/1900',0),('05/02/1900',0),('06/02/1900',0),('07/02/1900',0),('08/02/1900',0),('09/02/1900',0),('10/02/1900',0),('11/02/1900',0),('12/02/1900',0),('13/02/1900',0),('14/02/1900',0),('15/02/1900',0),('16/02/1900',0),('17/02/1900',0),('18/02/1900',0),('19/02/1900',0),('20/02/1900',0),('21/02/1900',0),('22/02/1900',0),('23/02/1900',0),('24/02/1900',0),('25/02/1900',0),('26/02/1900',0),('27/02/1900',0),('28/02/1900',0),('01/03/1900',0),('02/03/1900',0),('03/03/1900',0),('04/03/1900',0),('05/03/1900',0),('06/03/1900',0),('07/03/1900',0),('08/03/1900',0),('09/03/1900',0),('10/03/1900',0),('11/03/1900',0),('12/03/1900',0),('13/03/1900',0),('14/03/1900',0),('15/03/1900',0),('16/03/1900',0),('17/03/1900',0),('18/03/1900',0),('19/03/1900',0),('20/03/1900',0),('21/03/1900',0),('22/03/1900',0),('23/03/1900',0),('24/03/1900',0),('25/03/1900',0),('26/03/1900',0),('27/03/1900',0),('28/03/1900',0),('29/03/1900',0),('30/03/1900',0),('31/03/1900',0),('01/04/1900',0),('02/04/1900',0),('03/04/1900',0),('04/04/1900',0),('05/04/1900',0),('06/04/1900',0),('07/04/1900',0),('08/04/1900',0),('09/04/1900',0),('10/04/1900',0),('11/04/1900',0),('12/04/1900',0),('13/04/1900',0),('14/04/1900',0),('15/04/1900',0),('16/04/1900',0),('17/04/1900',0),('18/04/1900',0),('19/04/1900',0),('20/04/1900',0),('21/04/1900',0),('22/04/1900',0),('23/04/1900',0),('24/04/1900',0),('25/04/1900',0),('26/04/1900',0),('27/04/1900',0),('28/04/1900',0),('29/04/1900',0),('30/04/1900',0),('01/05/1900',0),('02/05/1900',0),('03/05/1900',0),('04/05/1900',0),('05/05/1900',0),('06/05/1900',0),('07/05/1900',0),('08/05/1900',0),('09/05/1900',0),('10/05/1900',0),('11/05/1900',0),('12/05/1900',0),('13/05/1900',0),('14/05/1900',0),('15/05/1900',0),('16/05/1900',0),('17/05/1900',0),('18/05/1900',0),('19/05/1900',0),('20/05/1900',0),('21/05/1900',0),('22/05/1900',0),('23/05/1900',0),('24/05/1900',0),('25/05/1900',0),('26/05/1900',0),('27/05/1900',0),('28/05/1900',0),('29/05/1900',0),('30/05/1900',0),('31/05/1900',0),('01/06/1900',0),('02/06/1900',0),('03/06/1900',0),('04/06/1900',0),('05/06/1900',0),('06/06/1900',0),('07/06/1900',0),('08/06/1900',0),('09/06/1900',0),('10/06/1900',0),('11/06/1900',0),('12/06/1900',0),('13/06/1900',0),('14/06/1900',0),('15/06/1900',0),('16/06/1900',0),('17/06/1900',0),('18/06/1900',0),('19/06/1900',0),('20/06/1900',0),('21/06/1900',0),('22/06/1900',0),('23/06/1900',0),('24/06/1900',0),('25/06/1900',0),('26/06/1900',0),('27/06/1900',0),('28/06/1900',0),('29/06/1900',0),('30/06/1900',0),('01/07/1900',0),('02/07/1900',0),('03/07/1900',0),('04/07/1900',0),('05/07/1900',0),('06/07/1900',0),('07/07/1900',0),('08/07/1900',0),('09/07/1900',0),('10/07/1900',0),('11/07/1900',0),('12/07/1900',0),('13/07/1900',0),('14/07/1900',0),('15/07/1900',0),('16/07/1900',0),('17/07/1900',0),('18/07/1900',0),('19/07/1900',0),('20/07/1900',0),('21/07/1900',0),('22/07/1900',0),('23/07/1900',0),('24/07/1900',0),('25/07/1900',0),('26/07/1900',0),('27/07/1900',0),('28/07/1900',0),('29/07/1900',0),('30/07/1900',0),('31/07/1900',0),('01/08/1900',0),('02/08/1900',0),('03/08/1900',0),('04/08/1900',0),('05/08/1900',0),('06/08/1900',0),('07/08/1900',0),('08/08/1900',0),('09/08/1900',0),('10/08/1900',0),('11/08/1900',0),('12/08/1900',0),('13/08/1900',0),('14/08/1900',0),('15/08/1900',0),('16/08/1900',0),('17/08/1900',0),('18/08/1900',0),('19/08/1900',0),('20/08/1900',0),('21/08/1900',0),('22/08/1900',0),('23/08/1900',0),('24/08/1900',0),('25/08/1900',0),('26/08/1900',0),('27/08/1900',0),('28/08/1900',0),('29/08/1900',0),('30/08/1900',0),('31/08/1900',0),('01/09/1900',0),('02/09/1900',0),('03/09/1900',0),('04/09/1900',0),('05/09/1900',0),('06/09/1900',0),('07/09/1900',0),('08/09/1900',0),('09/09/1900',0),('10/09/1900',0),('11/09/1900',0),('12/09/1900',0),('13/09/1900',0),('14/09/1900',0),('15/09/1900',0),('16/09/1900',0),('17/09/1900',0),('18/09/1900',0),('19/09/1900',0),('20/09/1900',0),('21/09/1900',0),('22/09/1900',0),('23/09/1900',0),('24/09/1900',0),('25/09/1900',0),('26/09/1900',0),('27/09/1900',0),('28/09/1900',0),('29/09/1900',0),('30/09/1900',0),('01/10/1900',0),('02/10/1900',0),('03/10/1900',0),('04/10/1900',0),('05/10/1900',0),('06/10/1900',0),('07/10/1900',0),('08/10/1900',0),('09/10/1900',0),('10/10/1900',0),('11/10/1900',0),('12/10/1900',0),('13/10/1900',0),('14/10/1900',0),('15/10/1900',0),('16/10/1900',0),('17/10/1900',0),('18/10/1900',0),('19/10/1900',0),('20/10/1900',0),('21/10/1900',0),('22/10/1900',0),('23/10/1900',0),('24/10/1900',0),('25/10/1900',0),('26/10/1900',0),('27/10/1900',0),('28/10/1900',0),('29/10/1900',0),('30/10/1900',0),('31/10/1900',0),('01/11/1900',0),('02/11/1900',0),('03/11/1900',0),('04/11/1900',0),('05/11/1900',0),('06/11/1900',0),('07/11/1900',0),('08/11/1900',0),('09/11/1900',0),('10/11/1900',0),('11/11/1900',0),('12/11/1900',0),('13/11/1900',0),('14/11/1900',0),('15/11/1900',0),('16/11/1900',0),('17/11/1900',0),('18/11/1900',0),('19/11/1900',0),('20/11/1900',0),('21/11/1900',0),('22/11/1900',0),('23/11/1900',0),('24/11/1900',0),('25/11/1900',0),('26/11/1900',0),('27/11/1900',0),('28/11/1900',0),('29/11/1900',0),('30/11/1900',0),('01/12/1900',0),('02/12/1900',0),('03/12/1900',0),('04/12/1900',0),('05/12/1900',0),('06/12/1900',0),('07/12/1900',0),('08/12/1900',0),('09/12/1900',0),('10/12/1900',0),('11/12/1900',0),('12/12/1900',0),('13/12/1900',0),('14/12/1900',0),('15/12/1900',0),('16/12/1900',0),('17/12/1900',0),('18/12/1900',0),('19/12/1900',0),('20/12/1900',0),('21/12/1900',0),('22/12/1900',0),('23/12/1900',0),('24/12/1900',0),('25/12/1900',0),('26/12/1900',0),('27/12/1900',0),('28/12/1900',0),('29/12/1900',0);
/*!40000 ALTER TABLE `occupancy` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `paytypes`
--

DROP TABLE IF EXISTS `paytypes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `paytypes` (
  `ID` int DEFAULT NULL,
  `1` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paytypes`
--

LOCK TABLES `paytypes` WRITE;
/*!40000 ALTER TABLE `paytypes` DISABLE KEYS */;
INSERT INTO `paytypes` VALUES (1,'Cash'),(2,'Card'),(3,'DD'),(4,'RAS'),(5,'eTransfer'),(6,'Voucher'),(7,'Credit'),(8,'Cheque'),(9,'Arrears_Cash'),(10,'Arrears_Card'),(11,'Arrears_Voucher'),(12,'Arrears_eTransfer'),(13,'Arrears_Cheque'),(14,'RateCharge');
/*!40000 ALTER TABLE `paytypes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prices`
--

DROP TABLE IF EXISTS `prices`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prices` (
  `price_id` int DEFAULT NULL,
  `ItemName` text,
  `type` text,
  `amount` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prices`
--

LOCK TABLES `prices` WRITE;
/*!40000 ALTER TABLE `prices` DISABLE KEYS */;
INSERT INTO `prices` VALUES (1,'Rate A','Accommodation',135),(2,'Rate B','Accommodation',140),(3,'Rate C','Accommodation',145),(4,'Rate D','Accommodation',150),(5,'Rate E','Accommodation',155),(6,'Overnight','Accommodation',65),(7,'D/D A','Accommodation',431.66),(8,'D/D B','Accommodation',585),(9,'D/D C','Accommodation',606.66),(10,'D/D D','Accommodation',628.33),(11,'D/D E','Accommodation',671.66),(12,'Surcharge','Sundry',50);
/*!40000 ALTER TABLE `prices` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reservations`
--

DROP TABLE IF EXISTS `reservations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reservations` (
  `res_id` int DEFAULT NULL,
  `guest_id` int DEFAULT NULL,
  `date_start` date DEFAULT NULL,
  `room_no` int DEFAULT NULL,
  `date_end` date DEFAULT NULL,
  `notes` text,
  `bill_id` int DEFAULT NULL,
  `status` int DEFAULT NULL,
  `date_resmade` datetime DEFAULT NULL,
  `txn_id` int DEFAULT NULL,
  `charge` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservations`
--

LOCK TABLES `reservations` WRITE;
/*!40000 ALTER TABLE `reservations` DISABLE KEYS */;
/*!40000 ALTER TABLE `reservations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rooms`
--

DROP TABLE IF EXISTS `rooms`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rooms` (
  `room_id` int DEFAULT NULL,
  `room_num` int DEFAULT NULL,
  `floor` int DEFAULT NULL,
  `beds` int DEFAULT NULL,
  `rm_size` text,
  `status` text,
  `notes` text,
  `price` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rooms`
--

LOCK TABLES `rooms` WRITE;
/*!40000 ALTER TABLE `rooms` DISABLE KEYS */;
INSERT INTO `rooms` VALUES (1,201,1,1,'Single','','',1),(2,202,1,1,'Single','','',1),(3,203,1,1,'Single','','',1),(4,204,1,1,'Single','','',1),(5,205,1,1,'Single','','',1),(6,206,1,1,'Single','','',1),(7,207,1,1,'Single','','',1),(8,208,1,1,'Single','','',1),(9,209,1,1,'Single','','',1),(10,210,1,1,'Single','','',1),(11,301,2,1,'Single','','',1),(12,302,2,1,'Single','','',1),(13,303,2,1,'Single','','',1),(14,304,2,1,'Single','','',1),(15,305,2,1,'Single','','',1),(16,306,2,1,'Single','','',1),(17,307,2,1,'Single','','',1),(18,308,2,1,'Single','','',1),(19,309,2,1,'Single','','',1),(20,310,2,1,'Single','','',1),(21,401,3,1,'Single','','',1),(22,402,3,1,'Single','','',1),(23,403,3,1,'Single','','',1),(24,404,3,1,'Single','','',1),(25,405,3,1,'Single','','',1),(26,406,3,1,'Single','','',1),(27,407,3,1,'Single','','',1),(28,408,3,1,'Single','','',1),(29,409,3,1,'Single','','',1),(30,410,3,1,'Single','','',1),(31,501,4,1,'Single','','',1),(32,502,4,1,'Single','','',1),(33,503,4,1,'Single','','',1),(34,504,4,1,'Single','','',1),(35,505,4,1,'Single','','',1),(36,506,4,1,'Single','','',1),(37,507,4,1,'Single','','',1),(38,508,4,1,'Single','','',1),(39,509,4,1,'Single','','',1),(40,510,4,1,'Single','','',1);
/*!40000 ALTER TABLE `rooms` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `settings`
--

DROP TABLE IF EXISTS `settings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `settings` (
  `setting_name` text,
  `description` text,
  `setting_value` text,
  `V1` int DEFAULT NULL,
  `V2` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `settings`
--

LOCK TABLES `settings` WRITE;
/*!40000 ALTER TABLE `settings` DISABLE KEYS */;
INSERT INTO `settings` VALUES ('BillCycl','Weekly Billing Cycle','26/03',-1,0);
/*!40000 ALTER TABLE `settings` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `txns`
--

DROP TABLE IF EXISTS `txns`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `txns` (
  `tx_id` int DEFAULT NULL,
  `created` date DEFAULT NULL,
  `type` text,
  `resv_no` int DEFAULT NULL,
  `gu_rm_no` int DEFAULT NULL,
  `gue_no` int DEFAULT NULL,
  `rm_no` int DEFAULT NULL,
  `details` text,
  `amtpay` double DEFAULT NULL,
  `meth` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `txns`
--

LOCK TABLES `txns` WRITE;
/*!40000 ALTER TABLE `txns` DISABLE KEYS */;
/*!40000 ALTER TABLE `txns` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-02-20 16:54:30
