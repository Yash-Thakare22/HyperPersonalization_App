-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: insurancedb
-- ------------------------------------------------------
-- Server version	8.0.26

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
-- Table structure for table `claim_status_codes`
--

DROP TABLE IF EXISTS `claim_status_codes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `claim_status_codes` (
  `status_code` int NOT NULL AUTO_INCREMENT,
  `status_description` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`status_code`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `claim_status_codes`
--

LOCK TABLES `claim_status_codes` WRITE;
/*!40000 ALTER TABLE `claim_status_codes` DISABLE KEYS */;
INSERT INTO `claim_status_codes` VALUES (11,'Submitted'),(12,'Under-Review'),(13,'Approved'),(14,'Rejected'),(15,'Claim-Settled');
/*!40000 ALTER TABLE `claim_status_codes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `claims`
--

DROP TABLE IF EXISTS `claims`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `claims` (
  `claim_id` int NOT NULL AUTO_INCREMENT,
  `date_of_claim` date DEFAULT NULL,
  `amount_of_claim` double DEFAULT NULL,
  `details_of_claim` varchar(50) DEFAULT NULL,
  `policy_no` int DEFAULT NULL,
  `status_code` int DEFAULT NULL,
  PRIMARY KEY (`claim_id`)
) ENGINE=InnoDB AUTO_INCREMENT=603 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `claims`
--

LOCK TABLES `claims` WRITE;
/*!40000 ALTER TABLE `claims` DISABLE KEYS */;
INSERT INTO `claims` VALUES (601,'2019-05-19',40000,'Vehicle Accident',10001,11),(602,'2019-06-04',40000,'Knee Surgery',10003,12);
/*!40000 ALTER TABLE `claims` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `insurance_companies`
--

DROP TABLE IF EXISTS `insurance_companies`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `insurance_companies` (
  `company_id` int NOT NULL AUTO_INCREMENT,
  `company_name` varchar(50) DEFAULT NULL,
  `about_company` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`company_id`)
) ENGINE=InnoDB AUTO_INCREMENT=104 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `insurance_companies`
--

LOCK TABLES `insurance_companies` WRITE;
/*!40000 ALTER TABLE `insurance_companies` DISABLE KEYS */;
INSERT INTO `insurance_companies` VALUES (101,'Medical Insurers','Medical Insurers are best'),(102,'Vehicle Insurers','Vehicle Insurers are better'),(103,'Life Insurers','Life Insurers are good');
/*!40000 ALTER TABLE `insurance_companies` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payment_schedules`
--

DROP TABLE IF EXISTS `payment_schedules`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `payment_schedules` (
  `payment_due_id` int NOT NULL AUTO_INCREMENT,
  `payment_due_date` date DEFAULT NULL,
  `payment_due_amount` double DEFAULT NULL,
  `receiptno` int DEFAULT NULL,
  PRIMARY KEY (`payment_due_id`)
) ENGINE=InnoDB AUTO_INCREMENT=102 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payment_schedules`
--

LOCK TABLES `payment_schedules` WRITE;
/*!40000 ALTER TABLE `payment_schedules` DISABLE KEYS */;
INSERT INTO `payment_schedules` VALUES (101,'2017-03-06',10000,402);
/*!40000 ALTER TABLE `payment_schedules` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `policy_payments`
--

DROP TABLE IF EXISTS `policy_payments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `policy_payments` (
  `receiptno` int NOT NULL AUTO_INCREMENT,
  `dateofpayment` date DEFAULT NULL,
  `amount` double DEFAULT NULL,
  `fine` double DEFAULT NULL,
  `policy_no` int DEFAULT NULL,
  `user_id` int DEFAULT NULL,
  PRIMARY KEY (`receiptno`)
) ENGINE=InnoDB AUTO_INCREMENT=404 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `policy_payments`
--

LOCK TABLES `policy_payments` WRITE;
/*!40000 ALTER TABLE `policy_payments` DISABLE KEYS */;
INSERT INTO `policy_payments` VALUES (401,'2019-03-23',3000,0,10001,1111),(402,'2016-09-07',10000,0,10002,1111),(403,'2017-04-05',10000,0,10002,1111);
/*!40000 ALTER TABLE `policy_payments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `policy_sub_types`
--

DROP TABLE IF EXISTS `policy_sub_types`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `policy_sub_types` (
  `policy_type_id` int NOT NULL AUTO_INCREMENT,
  `description` varchar(50) DEFAULT NULL,
  `yearsofpayments` int DEFAULT NULL,
  `amount` double DEFAULT NULL,
  `maturityperiod` int DEFAULT NULL,
  `maturityamount` double DEFAULT NULL,
  `validity` int DEFAULT NULL,
  `medicalcondn` varchar(50) DEFAULT NULL,
  `vehiclecondn` varchar(50) DEFAULT NULL,
  `agecondn` varchar(50) DEFAULT NULL,
  `policy_type_code` int DEFAULT NULL,
  `company_id` int DEFAULT NULL,
  PRIMARY KEY (`policy_type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2004 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `policy_sub_types`
--

LOCK TABLES `policy_sub_types` WRITE;
/*!40000 ALTER TABLE `policy_sub_types` DISABLE KEYS */;
INSERT INTO `policy_sub_types` VALUES (2001,'Medical Policy1',2,180000,5,300000,8,'normal','NA','senior',2,101),(2002,'Vehicle Policy1',10,30000,0,0,10,'NA','new','NA',1,102),(2003,'Life Policy1',15,300000,20,1300000,25,'normal','NA','adult',3,103);
/*!40000 ALTER TABLE `policy_sub_types` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `preferences`
--

DROP TABLE IF EXISTS `preferences`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `preferences` (
  `pref_id` int NOT NULL AUTO_INCREMENT,
  `pref_policy` varchar(50) DEFAULT NULL,
  `user_id` int DEFAULT NULL,
  PRIMARY KEY (`pref_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `preferences`
--

LOCK TABLES `preferences` WRITE;
/*!40000 ALTER TABLE `preferences` DISABLE KEYS */;
INSERT INTO `preferences` VALUES (1,'vehicle,life',1111),(2,'life,medical',1112),(3,'medical',1113);
/*!40000 ALTER TABLE `preferences` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ref_policy_types`
--

DROP TABLE IF EXISTS `ref_policy_types`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ref_policy_types` (
  `policy_type_code` int NOT NULL AUTO_INCREMENT,
  `policy_type_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`policy_type_code`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ref_policy_types`
--

LOCK TABLES `ref_policy_types` WRITE;
/*!40000 ALTER TABLE `ref_policy_types` DISABLE KEYS */;
INSERT INTO `ref_policy_types` VALUES (1,'vehicle'),(2,'medical'),(3,'life');
/*!40000 ALTER TABLE `ref_policy_types` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_details`
--

DROP TABLE IF EXISTS `user_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_details` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `firstname` varchar(50) DEFAULT NULL,
  `lastname` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `mobileno` varchar(50) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `address_line` varchar(100) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `state` varchar(50) DEFAULT NULL,
  `country` varchar(50) DEFAULT NULL,
  `postal_zipcode` varchar(50) DEFAULT NULL,
  `age` int DEFAULT NULL,
  `gender` varchar(50) DEFAULT NULL,
  `bmi` double DEFAULT NULL,
  `children` int DEFAULT NULL,
  `smoker` tinyint(1) DEFAULT NULL,
  `vehicle_age` int DEFAULT NULL,
  `vehicle_damage` tinyint(1) DEFAULT NULL,
  `vehicle_reg_num` varchar(50) DEFAULT NULL,
  `model` varchar(50) DEFAULT NULL,
  `employment` varchar(50) DEFAULT NULL,
  `family_history` varchar(100) DEFAULT NULL,
  `medical_history` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1115 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_details`
--

LOCK TABLES `user_details` WRITE;
/*!40000 ALTER TABLE `user_details` DISABLE KEYS */;
INSERT INTO `user_details` VALUES (1111,'raju','reddy','raju@gmail.com','9854261456','2002-04-11','6-21, kphb','hyderabad','andhra pradesh','India','1254',18,'M',17,0,0,1,1,'AP48AB0080','Venue ES','Unemployed','NA','Smoker'),(1112,'vamsi','reddy','vamsi@gmail.com','9854261463','1986-04-11','7-81, abcd','chennai','tamil nadu','India','125456',35,'M',24,1,1,2,0,'TN47AB0070','Activa 125','Employed','heartdisease','NA'),(1113,'navin','reddy','navin@gmail.com','9854261477','1985-03-14','8-81, qwerty','lucknow','uttar pradesh','India','456123',60,'M',32,2,0,0,0,'Na','NA','selfemployed','cancer','diabetics'),(1114,'raj','thakare','raj@gmail.com','9854261400','2002-04-23','6-21, cgs','mumbai','maharashtra','India','4000',12,'M',20,0,0,0,1,'MH48AB0080','Venue 10','Unemployed','NA','NA');
/*!40000 ALTER TABLE `user_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_login`
--

DROP TABLE IF EXISTS `user_login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_login` (
  `email` varchar(50) NOT NULL,
  `password` varchar(50) DEFAULT NULL,
  `user_id` int DEFAULT NULL,
  PRIMARY KEY (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_login`
--

LOCK TABLES `user_login` WRITE;
/*!40000 ALTER TABLE `user_login` DISABLE KEYS */;
INSERT INTO `user_login` VALUES ('naveen@gmail.com','admin@1234',1113),('raj@gmail.com','raj@1234',1114),('raju@gmail.com','admin@1234',1111),('vamsi@gmail.com','admin@1234',1112);
/*!40000 ALTER TABLE `user_login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_policies`
--

DROP TABLE IF EXISTS `user_policies`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_policies` (
  `policy_no` int NOT NULL AUTO_INCREMENT,
  `date_registered` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  `final_amount` double DEFAULT NULL,
  `premium_amount` double DEFAULT NULL,
  `policy_renewable_type` varchar(50) DEFAULT NULL,
  `user_id` int DEFAULT NULL,
  `policy_type_id` int DEFAULT NULL,
  PRIMARY KEY (`policy_no`)
) ENGINE=InnoDB AUTO_INCREMENT=10006 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_policies`
--

LOCK TABLES `user_policies` WRITE;
/*!40000 ALTER TABLE `user_policies` DISABLE KEYS */;
INSERT INTO `user_policies` VALUES (10001,'2019-03-20','2029-03-19',30000,3000,'yearly',1111,2002),(10002,'2016-09-07','2036-09-07',300000,10000,'halfyearly',1112,2003),(10003,'2019-12-28','2024-12-28',180000,7500,'monthly',1113,2001),(10004,'2016-03-20','2049-03-19',30005,3005,'yearly',1113,2002),(10005,'2016-03-20','2049-03-19',30005,3005,'yearly',1112,2003);
/*!40000 ALTER TABLE `user_policies` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-08-29 20:39:12
