-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: calorie_counter_app
-- ------------------------------------------------------
-- Server version	8.0.36

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
-- Table structure for table `menu`
--

DROP TABLE IF EXISTS `menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `menu` (
  `menu_id` int NOT NULL AUTO_INCREMENT,
  `menu_date` date DEFAULT NULL,
  `eaten_product_amount` double DEFAULT NULL,
  `eaten_product_calories` double DEFAULT NULL,
  `eaten_product_protein` double DEFAULT NULL,
  `eaten_product_fat` double DEFAULT NULL,
  `eaten_product_carbs` double DEFAULT NULL,
  `eaten_product_fiber` double DEFAULT NULL,
  `product_id` int DEFAULT NULL,
  `user_id` int DEFAULT NULL,
  `eaten_product_name` varchar(100) NOT NULL,
  PRIMARY KEY (`menu_id`),
  KEY `product_id` (`product_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `menu_ibfk_1` FOREIGN KEY (`product_id`) REFERENCES `products` (`product_id`),
  CONSTRAINT `menu_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu`
--

LOCK TABLES `menu` WRITE;
/*!40000 ALTER TABLE `menu` DISABLE KEYS */;
INSERT INTO `menu` VALUES (1,'2024-04-30',150,510,19.5,3.75,91.5,16.5,2,2,'Гречка Увелка'),(2,'2024-04-30',150,144,2.25,0.75,31.5,2.55,4,2,'Банан'),(3,'2024-04-29',150,144,2.25,0.75,31.5,2.55,4,2,'Банан'),(4,'2024-05-01',130,217.1,2.6,20.02,2.34,8.84,8,2,'Авокадо, Калифорнийские, сырые'),(5,'2024-05-01',140,518,19.6,4.9,95.2,9.52,1,2,'Хлопья 5 злаков Увелка'),(6,'2024-05-01',110.00000000000001,125.4,22,2.2,3.3,0,7,2,'Творог 2% жирности'),(7,'2024-05-01',110.00000000000001,53.9,3.3,2.2,5.17,0,5,2,'Молоко 2% [Восток Молоко]'),(8,'2024-05-02',30,68.1,1.8,0.3,14.22,0,6,2,'Хлеб Традиционный без Хлебопекарных Дрожжей [Хлебный Дом]'),(9,'2024-04-28',10,16.7,0.2,1.54,0.18,0.68,8,2,'Авокадо, Калифорнийские, сырые');
/*!40000 ALTER TABLE `menu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `products` (
  `product_id` int NOT NULL AUTO_INCREMENT,
  `product_name` varchar(100) NOT NULL,
  `product_cal_perg` double DEFAULT NULL,
  `product_protein_perg` double DEFAULT NULL,
  `product_fat_perg` double DEFAULT NULL,
  `product_carbs_perg` double DEFAULT NULL,
  `product_fiber_perg` double DEFAULT NULL,
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (1,'Хлопья 5 злаков Увелка',370,14,3.5,68,6.8),(2,'Гречка Увелка',340,13,2.5,61,11),(4,'Банан',96,1.5,0.5,21,1.7),(5,'Молоко 2% [Восток Молоко]',49,3,2,4.7,0),(6,'Хлеб Традиционный без Хлебопекарных Дрожжей [Хлебный Дом]',227,6,1,47.4,0),(7,'Творог 2% жирности',114,20,2,3,0),(8,'Авокадо, Калифорнийские, сырые',167,2,15.4,1.8,6.8);
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `user_name` varchar(45) DEFAULT NULL,
  `user_password` varchar(45) DEFAULT NULL,
  `user_gender` varchar(10) DEFAULT NULL,
  `user_height` int DEFAULT NULL,
  `user_weight` double DEFAULT NULL,
  `user_dt_calories` double DEFAULT NULL,
  `user_dt_proteins` double DEFAULT NULL,
  `user_dt_fat` double DEFAULT NULL,
  `user_dt_fiber` double DEFAULT NULL,
  `user_dt_carbo` double DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'Sofia','sunflower55','female',167,55.7,NULL,NULL,NULL,NULL,NULL),(2,'Ann','camomile44','Female',170,53.5,1464.64,42.8,48.82,25,183.08);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-02  0:54:25
