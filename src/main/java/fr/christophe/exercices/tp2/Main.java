package fr.christophe.exercices.tp2;

import fr.christophe.exercices.tp2.adresse.Adresse;
import fr.christophe.exercices.tp2.identite.Identite;
import fr.christophe.exercices.tp2.salaire.Salaire;
import fr.christophe.exercices.tp2.salariecdi.SalarieCdi;

public class Main {
    public static void main(String[] args){
        Adresse adresse = new Adresse("rue", "de la rue", 59150, "Paris", "Belgique");
        Identite identite = new Identite("Jack", "Jacques", adresse);
        Salaire salaire = new Salaire(10);
        SalarieCdi jacques = new SalarieCdi(salaire, identite);
        System.out.println(jacques.getIdentite() + " habite " + jacques.getIdentite().getAdresse());
    }
}
