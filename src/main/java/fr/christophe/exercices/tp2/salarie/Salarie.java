package fr.christophe.exercices.tp2.salarie;

import fr.christophe.exercices.tp2.adresse.Adresse;
import fr.christophe.exercices.tp2.identite.Identite;
import fr.christophe.exercices.tp2.salaire.Salaire;

public abstract class Salarie {
    private Salaire salaire;
    private Identite identite;
    public final int HEURES_TRAVAILLEES = 151;
    public Salarie(Salaire salaire, Identite identite){
        this.salaire = salaire;
        this.identite = identite;
    }

    public Salaire getSalaire() {
        return salaire;
    }

    public void setSalaire(Salaire salaire) {
        this.salaire = salaire;
    }

    public Identite getIdentite() {
        return identite;
    }

    public void setIdentite(Identite identite) {
        this.identite = identite;
    }

    public abstract void demenager(Adresse adresse);

    public int travailler(){
        return this.HEURES_TRAVAILLEES;
    }

    public abstract int augmenter(int pourcentage);

}
