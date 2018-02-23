/*
SQLyog Ultimate v11.5 (64 bit)
MySQL - 5.5.50 : Database - gestiondesdocuments
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`gestiondesdocuments` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `gestiondesdocuments`;

/*Table structure for table `document` */

DROP TABLE IF EXISTS `document`;

CREATE TABLE `document` (
  `idDocument` int(1) NOT NULL AUTO_INCREMENT,
  `nomDuDocument` varchar(60) NOT NULL,
  `objet` varchar(30) NOT NULL,
  `auteur` varchar(40) NOT NULL,
  `destinataire` varchar(40) NOT NULL,
  `dateRedaction` varchar(30) NOT NULL,
  `nombreDesPiecesJointes` int(10) DEFAULT NULL,
  PRIMARY KEY (`idDocument`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

/*Data for the table `document` */

insert  into `document`(`idDocument`,`nomDuDocument`,`objet`,`auteur`,`destinataire`,`dateRedaction`,`nombreDesPiecesJointes`) values (1,'lettre','demande de stage',' NKOUOTOU YEYAP','Ministre de l\'Habitat ','08 Aout 2017',5),(2,'Etat civil','acteDeMariage',' Mairie','Maries ','08 Aout 2017',3),(3,'Etat civil','acteDeMariage',' Mairie','Maries','08 Aout 2017',3),(4,'Succession','Testament',' Defunt','Survivant','08 Aout 2016',1),(5,'Etat civil','ActeDeNaissance',' Mairie','Enfants','08 Mai 2016',1),(6,'Etat civil','ActeDeDeces',' Mairie','Veuves','08 Septembre 2016',1),(7,'Titre de propriete','titre foncier',' Cadastre','Couple','15 Mars 2000',1),(9,'lettre','demande de stage','NKOUOTOU Yvan','Ministre de l Habitat ','08 Aout 2017',5),(10,'NOTE','DOSIER','DOYUM','MINHFOF','12 JUILLET',10),(11,'lettre1','demande de stage1','YEYAP KEVIN1','MINHDU1','18 Aout2017',12),(12,'LETTREV','DEMANDE','NKOUOTOU','MINHDU','21/09/2017',6),(13,'LETTRE','DEMANDE','NDOYOUM','CUY','06/09/2017',4),(14,'Lettre','Demande','POUOH','MINFI','11/10/2017',2);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
