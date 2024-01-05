# Application gestion de personnel TP Java

![forthebadge](http://forthebadge.com/images/badges/built-with-love.svg)

Ce projet vous permet de créer des salariés, de les faire travailler, de les payer, de leur donner une adresse et de la
modifier comme bon vous semble.

## Pour commencer

Voici le diagramme de classes pour comprendre les liens entre ces dernières : 

```plantuml
@startuml

class Salaire {
  +tauxHoraire
  +payer(heures: int)
}

class Identite {
  +nom
  +prenom
  +adresse: Adresse
}

class Adresse {
  +voie
  +rue
  +cp
  +ville
  +pays
}

class SalarieCdi extends Salarie {
}

abstract class Salarie {
  +salaire: Salaire
  +identite: Identite
  +demenager(adresse: Adresse)
  +travailler(heures = 151)
  +augmenter(pourcentage)
}

Salarie o-- Identite
Salarie o-- Salaire

Identite o-- Adresse

@enduml

```

### Pré-requis

Pour lancer les tests, il faut utiliser ces libraires :

    - junit jupiter api
    - mockito junit jupiter
    - junit jupiter engine
    - junit jupiter params
    - mockito core

## Démarrage

Pour démarrer le projet, vous pouvez vous placer sur le main et utiliser les classes et méthodes. Pour les test, 
rendez-vous dans le répertoire test et lancez les tests des classes que vous souhaitez tester

## Stacks :

![java.png](..%2F..%2F..%2F..%2F..%2F..%2Fassets%2Fjava.png)

Test effectués avec Junit et Mockito

## Contributing

Si vous souhaitez contribuer, vous pouvez faire une PR.

# Soutenez-nous !!! 


N'hésitez pas à soutenir ce projet via notre lien en le suivant sur notre page Linkedin :
[![linkedin.png](..%2F..%2F..%2F..%2F..%2F..%2Fassets%2Flinkedin.png)](https://www.youtube.com/watch?v=dQw4w9WgXcQ&ab_channel=RickAstley)

