# Application gestion de personnel TP Java

---

Ce projet vous permet de créer des salariés, de les faire travailler, de les payer, de leur donner une adresse et de la
modifier comme bon vous semble.

---

## Voici le diagramme UML de notre application : 

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

## Dépendances à intaller pour les tests : 
    - junit jupiter api 
    - mockito junit jupiter
    - junit jupiter engine
    - junit jupiter params
    - mockito core

---

N'hésitez pas à soutenir ce projet via notre lien en le suivant sur notre page Linkedin :
[![linkedin.png](..%2F..%2F..%2F..%2F..%2F..%2Fassets%2Flinkedin.png)](https://www.youtube.com/watch?v=dQw4w9WgXcQ&ab_channel=RickAstley)


