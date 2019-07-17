# Astral Rover Kata
> Parce qu'il n'y a aucune raison que votre Rover se limite à Mars.

## Contexte

Cet exercice fait suite au kata [Mars Rover](https://katalyst.codurance.com/mars-rover). Il a vocation à mettre l'accent sur les aspects techniques non abordés durant les quatre semaines de formation, mais auxquels vous serez invariablement confrontés dans vos missions : industrialisation de projet, persistence de données, mise en place d'une API, développement d'un front-end... 

Faites bien attention à ne pas introduire des détails d'implémentation technique dans le coeur fonctionnel de votre rover. Des concepts comme l'architecture hexagonale ou la mise en place d'Anti Corruption Layers pourront vous aider à atteindre cet objectif.

[Forkez ce dépôt](https://github.com/lelionvert/astral-rover-kata/fork) et laissez-vous guider !


## User Stories

À travers différentes user stories, vous serez amenés à développer de nouvelles fonctionnalités pour votre Rover.

L'objectif étant de découvrir ou d'approfondir diverses technologies, libre à vous de suivre les user stories dans l'ordre qui vous convient le mieux. 

De même, vous êtes libre de remplacer une suggestion de technologie par une autre. Par exemple : utiliser un cache Redis plutôt qu'une base de donnée PostgreSQL pour la persistence, ou le micro-framework Spark plutôt que Spring Boot pour l'API...


### Industrialisation

#### IND-1
> **En tant que** Lead Tech, **je veux** avoir un feedback automatique sur l'état du rover **afin** d'assurer sa non regression entre chaque livraison.
Plusieurs pistes sont à explorer pour répondre à ce besoin :
  * Solutions cloud : TravisCI, CircleCI, GitlabCI... + badge README
  * Solution on-premise : Jenkins (pipeline)

#### IND-2
> **En tant que** Lead Tech, **je veux** mettre en place des indicateurs de qualité de code automatisés **afin** de garantir la maintenabilité du projet entre chaque livraison.
On pourra mettre en place des indicateurs de couverture de code, de sécurité, d'estimation de la dette technique...
  * Solutions cloud : CodeCov, CoverAlls, SonarCloud... + badge README
  * Solution on-premise : SonarQube

#### IND-3
> **En tant que** Lead Tech, **je veux** pouvoir déployer mon produit de manière identique sur l'ensemble des environnements **afin** de faciliter l'industrialisation.
Différents outils pourront vous aider dans la mise en oeuvre d'une infrastructure as code : Docker, Ansible, Puppet, Terraform.

Attention cependant, les utilisateurs de Java 9+ devront créer un JRE personnalisé ne contenant que les modules nécessaires au bon fonctionnement de l'application (`jlink`).

#### IND-4
> **En tant que** Lead Tech, **je veux** faire apparaitre le concept d'architecture hexagonale dans mon projet **afin** d'isoler les responsabilités techniques.
Cet objectif peut être réalisé en 2 temps :
  * Compréhension et organisation logicielle
  * Découpage du projet en sous-modules avec Maven/Gradle (Java), NuGet (C#)...

 Attention cependant, les utilisateurs de Java 9+ devront s'assurer que chaque module Maven/Gradle expose un `module-info.java`.


### Persistence

#### PER-1
> **En tant que** PO, **je veux** que chaque commande exécutée par le rover soit enregistrée **afin** d'assurer son auditabilité.
Vous pouvez utiliser différentes technologies de persistence : PostgreSQL, MongoDB, Redis, H2, SQLite...

#### PER-2
> **En tant que** PO, **je veux** que le rover s'initialise avec sa dernière position et son orientation connue **afin** de garantir un état cohérent après un redémarrage.
Imaginez que votre rover, fonctionnant à l'énergie solaire, exécute une série de commandes l'amenant à se déplacer durant la journée. Le soir venu le système s'arrête. En redémarrant le lendemain, le rover doit retrouver sa position réelle afin de continuer sa mission.


### API

#### API-1
> **En tant que** client, **je veux** récupérer la position actuelle du rover **afin** de pouvoir consulter cette information à distance.

#### API-2
> **En tant que** client, **je veux** récupérer l'historique des commandes exécutées par le rover **afin** de pouvoir réaliser un audit à distance.

#### API-3
> **En tant que** client, **je veux** envoyer une liste de commandes au rover et récupérer sa nouvelle position **afin** de le piloter à distance.

* Technologies : Spring Boot, Spark Java, Akka Http, Quarkus, Resteasy, NestJS, Nancy ...
* Queues


### Front-end

#### FRO-1
> **En tant que** client, **je veux** afficher le rover sur une grille **afin** de le situer dans son environnement.

#### FRO-2
> **En tant que** client, **je veux** une interface de saisie des commandes **afin** de faciliter le pilotage du rover.
  * Saisie d'une suite de commandes dans un input _ou_ clic sur les cases de la grille pour définir la prochaine action du rover, _ou_ ...

#### FRO-3
> **En tant que** client, **je veux** visualiser l'historique des commandes exécutées **afin** d'avoir un feedback immédiat.

#### FRO-4
> **En tant que** client, **je veux** pouvoir rejouer une suite de commandes depuis l'historique **afin** de faciliter le pilotage.

* Technologie de front-end : Angular, React, VueJS, WebAssembly, ...


## Contributions

Il s'agit bien entendu d'un projet d'exercice collaboratif, voué à évoluer avec les suggestions de chacun.

Ainsi, n'hésitez pas à soumettre une [pull request](https://github.com/lelionvert/astral-rover-kata/pulls) pour améliorer ce document : mise à jour du contexte, nouvelles
narrations et amélioration de celles déjà existantes...