package fr.christophe.exercices.tp2.salariecdi;

import fr.christophe.exercices.tp2.adresse.Adresse;
import fr.christophe.exercices.tp2.identite.Identite;
import fr.christophe.exercices.tp2.salaire.Salaire;
import fr.christophe.exercices.tp2.salarie.Salarie;

public class SalarieCdi extends Salarie {
    public SalarieCdi(Salaire salaire, Identite identite){
        super(salaire, identite);
    }

    public void demenager(Adresse adresse){
        System.out.println("Il a bougé le frérot");
    }

    public int augmenter(int pourcentage){
        return 0;
    }
}
