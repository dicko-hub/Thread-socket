# ALOM (Architectures Logicielles Orientées Microservices)
## TP
Thread-socket

## Description
 L'objectif est de créer un mini serveur web :
- Créant une écoute sur un port
- Acceptant les connexions sur ce port
- En gérant ces connexions au travers d'un thread dédié (gestion d'une requête à chaque connexion, possibilité d'utiliser une ConcurrentLinkedQueue pour se passer les requêtes d'un thread à un autre)
- Fermant la socket lorsque la requête a été traitée

## PROCÉDURE DE LANCEMENT
- Etre dans le repertoire java-webserver : 
  	faire un "mvn package"
- Etre dans le repertoire java-webserver/target : 
  	Coller les fichiers "index.html" et "favicon.ico"
- Etre dans le repertoire java-webserver/target : 
  	faire "java -cp java-webserver-1.0-SNAPSHOT.jar fr.lille.ios.App"
- Etre dans un navigateur web :
  	taper l'url "localhost:8082/index.html"
