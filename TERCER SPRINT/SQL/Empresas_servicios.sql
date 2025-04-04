-- MySQL dump 10.13  Distrib 8.0.41, for Win64 (x86_64)
--
-- Host: localhost    Database: empresas_servicios
-- ------------------------------------------------------
-- Server version	8.0.41

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
-- Table structure for table `empresas_de_servicios`
--

DROP TABLE IF EXISTS `empresas_de_servicios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empresas_de_servicios` (
  `CodEmp` int NOT NULL,
  `CIF` varchar(20) DEFAULT NULL,
  `Numero` int DEFAULT NULL,
  `Telefono` varchar(20) DEFAULT NULL,
  `Contacto` varchar(50) DEFAULT NULL,
  `Mail` varchar(50) DEFAULT NULL,
  `Observaciones` text,
  `Fecha_inicio` date DEFAULT NULL,
  `Fecha_fin` date DEFAULT NULL,
  PRIMARY KEY (`CodEmp`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empresas_de_servicios`
--

LOCK TABLES `empresas_de_servicios` WRITE;
/*!40000 ALTER TABLE `empresas_de_servicios` DISABLE KEYS */;
/*!40000 ALTER TABLE `empresas_de_servicios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `encargado`
--

DROP TABLE IF EXISTS `encargado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `encargado` (
  `ID_Encargado` int NOT NULL,
  `Nombre` varchar(50) DEFAULT NULL,
  `Apellido` varchar(50) DEFAULT NULL,
  `Fecha_inicio_contrato` date DEFAULT NULL,
  `Fecha_fin_contrato` date DEFAULT NULL,
  PRIMARY KEY (`ID_Encargado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `encargado`
--

LOCK TABLES `encargado` WRITE;
/*!40000 ALTER TABLE `encargado` DISABLE KEYS */;
/*!40000 ALTER TABLE `encargado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `servicios`
--

DROP TABLE IF EXISTS `servicios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `servicios` (
  `Codigo` int NOT NULL,
  `Observaciones` text,
  `CodEmp` int DEFAULT NULL,
  `ID_Encargado` int DEFAULT NULL,
  PRIMARY KEY (`Codigo`),
  KEY `fk_Servicios_Empresas` (`CodEmp`),
  KEY `fk_Servicios_Encargado` (`ID_Encargado`),
  CONSTRAINT `fk_Servicios_Empresas` FOREIGN KEY (`CodEmp`) REFERENCES `empresas_de_servicios` (`CodEmp`) ON DELETE CASCADE,
  CONSTRAINT `fk_Servicios_Encargado` FOREIGN KEY (`ID_Encargado`) REFERENCES `encargado` (`ID_Encargado`) ON DELETE CASCADE,
  CONSTRAINT `servicios_ibfk_1` FOREIGN KEY (`CodEmp`) REFERENCES `empresas_de_servicios` (`CodEmp`),
  CONSTRAINT `servicios_ibfk_2` FOREIGN KEY (`ID_Encargado`) REFERENCES `encargado` (`ID_Encargado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `servicios`
--

LOCK TABLES `servicios` WRITE;
/*!40000 ALTER TABLE `servicios` DISABLE KEYS */;
/*!40000 ALTER TABLE `servicios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-04-04 12:40:13
