# Astral Rover Kata
> Parce qu'il n'y a aucune raison que votre Rover se limite à Mars.

## Contexte

Cet exercice fait suite au kata [Mars Rover](http://kata-log.rocks/mars-rover-kata). Il a vocation à mettre l'accent sur les aspects techniques non abordés durant les quatre semaines de formation, mais auxquels vous serez invariablement confrontés dans vos missions : industrialisation de projet, persistence de données, mise en place d'une API, développement d'un front-end... 

[Forkez ce dépôt](https://github.com/lelionvert/astral-rover-kata/fork) et laissez-vous guider !


## Narrations

À travers différentes narrations, vous serez amenés à développer de nouvelles fonctionnalités pour votre Rover.

L'objectif étant de découvrir ou d'approfondir diverses technologies, libre à vous de suivre les narrations dans l'ordre
qui vous convient le mieux. 

De même, vous êtes libre de remplacer une suggestion de technologie par une autre. Par exemple : utiliser un cache Redis
plutôt qu'une base de donnée PostrgreSQL pour la persistence, ou le micro-framework Spark plutôt que Spring Boot pour,
l'API, etc...


### Industrialisation
> ![#todo](https://img.shields.io/badge/%23todo-lightgrey.svg) ![#technique](https://img.shields.io/badge/%23technique-red.svg)

* US 1 : En tant que PO, je veux avoir un feedback sur l'état du rover afin d'assurer sa non regression entre chaque livraison.
  * Intégration continue :
    * Solutions cloud : TravisCI, CircleCI, GitlabCI ... + badge README.
    * Solution à intaller sur sa machine/serveur : Jenkins (pipeline)

* US 2 : En tant que PO, je veux avoir un indicateur de qualité du code afin de garantir sa maintenabilité.
  * Couverture de code, sécurité du code, dette technique.
    * Solutions cloud : CodeCov, CoverAlls, SonarCloud ... + badge README
    * Solution à installer : Sonarqube

* US 3 : En tant que PO, je veux simplifier le processus de déploiement afin de garantir le bon fonctionnement du rover quelque soit son environnement.
  * Docker
  * Java 11+ : Générer un JRE custom avec jlink

* US 4 : En tant qu'équipe, je veux organiser mon projet en modules afin d'isoler les responsabilités techniques.
  * Projet multi-modules Maven/Gradle (Java), NuGet (C#)
  * Java 9+ : S'assurer que chaque module Gradle/Maven expose un module-info.java


### Persistence
> ![todo](https://img.shields.io/badge/%23todo-lightgrey.svg) ![#technique](https://img.shields.io/badge/%23technique-red.svg) ![#fonctionnel](https://img.shields.io/badge/%23fonctionnel-blue.svg)

* Les commandes reçues par le rover doivent être persistées.
* Le rover doit être capable de nous renvoyer les dernières commandes qu'il a exécuté.
* À l'initialisation du rover, sa position doit correspondre à sa dernière position persistée _ou_ (N, 0, 0) par défaut.
* Technologie de persistence : PostgreSQL, MongoDB, Redis, H2, SQLite, ...


### API
> ![todo](https://img.shields.io/badge/%23todo-lightgrey.svg) ![#technique](https://img.shields.io/badge/%23technique-red.svg)

* Récupérer la position actuelle du rover.
* Récupérer l'historique des commandes exécutées par le rover.
* Envoyer une liste de commandes au rover et récupérer sa nouvelle position.
* Technologies : Spring Boot, Spark Java, Akka Http, ...
* Outils : curl, Postman, ...


### Front-end
> ![todo](https://img.shields.io/badge/%23todo-lightgrey.svg) ![#technique](https://img.shields.io/badge/%23technique-red.svg)

* Représentation graphique de la grille et du rover.
* Saisir une suite de commandes dans un input _ou_ cliquer successivement sur les cases de la grille pour définir la prochaine action du rover.
* Clique sur un bouton "Send" pour envoyer l'ensemble des commandes à l'API et mettre à jour la représentation graphique.
* Technologie de front-end : Angular, React, VueJS, WebAssembly, ...


## Contributions

Il s'agit bien entendu d'un projet d'exercice collaboratif, voué à évoluer avec les suggestions de chacun.

Ainsi, n'hésitez pas à soumettre une [pull request](https://github.com/lelionvert/astral-rover-kata/pulls) pour améliorer ce document : mise à jour du contexte, nouvelles
narrations et amélioration de celles déjà existantes...