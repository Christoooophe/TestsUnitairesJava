package fr.christophe.exercices.tp2.identite;

import fr.christophe.exercices.tp2.adresse.Adresse;
import fr.christophe.exercices.tp2.salaire.Salaire;
import fr.christophe.exercices.tp2.salarie.Salarie;

public class Identite {
    private String nom;
    private String prenom;
    private Adresse adresse;
    public Identite(String nom, String prenom, Adresse adresse){
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString(){
        return this.getPrenom() + " " + this.getNom();
    }

}