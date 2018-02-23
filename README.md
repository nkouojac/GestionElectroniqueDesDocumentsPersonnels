# GestionElectroniqueDesDocumentsPersonnels
GestionElectroniqueDesDocumentsPersonnels est une application qui permet d'enregistrer les informations relatives à une collection des documents dans une base des données et de les afficher.

Installer un jdk ou au moins un jre sur son ordinateur.
Pour l'installation merci de suivre les étapes suivantes:

	-Rendez-vous sur la partie Java du site d’Oracle : http://www.oracle.com/technetwork/java
	-Dans la zone de droite ’software downloads’, cliquez sur le lien ’Java SE’ (pour Java Standard Edition)
	-Cliquez sur l’icône ’Java’ pour télécharger le JDK
	-Accepter la licence
	-De préférence choisir la version la plus récente (dernière sur la liste)
		-si votre machine est une 64 bit, choisir le jdk dont le nom a 'windows-X64' avant le '.exe'
		-si votre machine est une 32 bit, choisir le jdk dont le nom a 'windows-i586' avant le '.exe'
		-la version 32 bit fonctionne sur un Système Windows 32 bit ou 64 bit.
	-Cliquez sur le bouton ’Enregistrer le fichier’. Le téléchargement commence
	-Double cliquez sur le fichier téléchargé. L’assistant d’installation du JDK se lance
	-Cliquez sur le bouton ’Next’ des fenêtres qui vont s'afficher
	-Au moment d’installer un environnement d’exécution indépendant du JDK, l’assistant vous consulte. Acceptez les options par défaut et cliquez sur Next
	-Ainsi même si vous supprimez par la suite le répertoire d’installation du JDK (qui contient aussi une JRE), vous pourrez tout de même exécuter des programmes Java sur votre ordinateur
	-Vous arrivez à l’écran de fin d’installation, qui vous précise que l’installation s’est bien déroulée 
	-Cliquez sur Close: L’installation du JDK est terminée. 

Télécharger et installer une base de données Mysql à l'exemple de bitnami-wampstack-5.5.38-0-windows-installer
télécharger et installer un client de base de donnée à l'exemple de  SQLyog-11.5.0-1_x86-x64_setup 
	-Démarrez les services de mysql et lancer le client de base de donnée concernée
	(si c'est SQLyog double cliquée sur l'icone de 
	-créer l'utilisateur root avec le mot de passe ""
	-si c'est SQLyog cliquez sur l'onglet Database puis sur----> Import puis sur---> execute SQL Script
Dans le dossier 'Livrable4' copier le jar "mysql-connector-java-5.1.28-bin" 
puis collez le dans le dossier lib/ext présent dans le dossier d'installation du JRE.
	

	************************************
*****  		Version du jdk utilisé		  	*****
	************************************
java version "1.8.0_73"
Java(TM) SE Runtime Environment (build 1.8.0_73-b02)
Java HotSpot(TM) 64-Bit Server VM (build 25.73-b02, mixed mode)



	************************************
*****  	Documentation:			  	*****
	************************************

Veuillez suivre les indications suivantes:

1) Rendez vous dans le dossier 'livrable4\doc'.

2) Double cliquez sur 'index.html'.

	
	************************************
***** 	Execution de l'application:    		*****
	************************************

1) 	A l'aide de votre interpretteur de commande (cmd.exe),
	placer vous dans le dossier où vous avez téléchargé
	le fichier compressé "GestionElectroniqueDesDocuments.jar"
	('cd [chemin]/[dossier cible]').

2)	Assurer vous que la base de donnée est démarrée.

3)	Entrer la commande 'java -jar GestionDocuments.jar'.
