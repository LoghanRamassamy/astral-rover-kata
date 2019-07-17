# Astral Rover Kata
> Parce qu'il n'y a aucune raison que votre Rover se limite à Mars.

## Contexte

Cet exercice fait suite au kata [Mars Rover](https://katalyst.codurance.com/mars-rover). Il a vocation à mettre l'accent sur les aspects techniques non abordés durant les quatre semaines de formation, mais auxquels vous serez invariablement confrontés dans vos missions : industrialisation de projet, persistence de données, mise en place d'une API, développement d'un front-end... 

[Forkez ce dépôt](https://github.com/lelionvert/astral-rover-kata/fork) et laissez-vous guider !


## Narrations

À travers différentes narrations, vous serez amenés à développer de nouvelles fonctionnalités pour votre Rover.

L'objectif étant de découvrir ou d'approfondir diverses technologies, libre à vous de suivre les narrations dans l'ordre
qui vous convient le mieux. 

De même, vous êtes libre de remplacer une suggestion de technologie par une autre. Par exemple : utiliser un cache Redis
plutôt qu'une base de donnée PostrgreSQL pour la persistence, ou le micro-framework Spark plutôt que Spring Boot pour,
l'API, etc...


### Industrialisation ![#technique](https://img.shields.io/badge/%23technique-red.svg)

#### IND-1
> **En tant que** PO, **je veux** avoir un feedback sur l'état du rover **afin** d'assurer sa non regression entre chaque livraison.
  * Intégration continue :
    * Solutions cloud : TravisCI, CircleCI, GitlabCI ... + badge README.
    * Solution à intaller sur sa machine/serveur : Jenkins (pipeline)

#### IND-2
> **En tant que** PO, **je veux** avoir un indicateur de qualité du code **afin** de garantir sa maintenabilité.
  * Couverture de code, sécurité du code, dette technique.
    * Solutions cloud : CodeCov, CoverAlls, SonarCloud ... + badge README
    * Solution à installer : Sonarqube

#### IND-3
> **En tant que** PO, **je veux** simplifier le processus de déploiement **afin** de garantir le bon fonctionnement du rover quelque soit son environnement.
  * Docker
  * Java 11+ : Générer un JRE custom avec jlink

#### IND-4
> **En tant qu**'équipe, **je veux** organiser mon projet en modules **afin** d'isoler les responsabilités techniques.
  * Projet multi-modules Maven/Gradle (Java), NuGet (C#)
  * Java 9+ : S'assurer que chaque module Gradle/Maven expose un module-info.java


### Persistence ![#technique](https://img.shields.io/badge/%23technique-red.svg) ![#fonctionnel](https://img.shields.io/badge/%23fonctionnel-blue.svg)

#### PER-1
> **En tant qu**'équipe Sécurité, **je veux** que le rover enregistre l'historique des commandes exécutées **afin** d'assurer son auditabilité.
  * Technologie de persistence : PostgreSQL, MongoDB, Redis, H2, SQLite, ...

#### PER-2
> **En tant que** PO, **je veux** que le rover récupère sa dernière position connue lors de son initialisation **afin** d'assurer sa survie en milieu hostile.


### API
> ![todo](https://img.shields.io/badge/%23todo-lightgrey.svg) ![#technique](https://img.shields.io/badge/%23technique-red.svg)

#### API-1
> **En tant que** client, **je veux** récupérer la position actuelle du rover **afin** de pouvoir consulter cette information à distance.

#### API-2
> **En tant que** client, **je veux** récupérer l'historique des commandes exécutées par le rover **afin** de pouvoir réaliser un audit à distance.

#### API-3
> **En tant que** client, **je veux** envoyer une liste de commandes au rover et récupérer sa nouvelle position **afin** de le piloter à distance.

* Technologies : Spring Boot, Spark Java, Akka Http, Quarkus, Resteasy, NestJS, Nancy ...


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