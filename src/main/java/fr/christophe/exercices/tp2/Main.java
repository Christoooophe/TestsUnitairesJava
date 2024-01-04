package fr.christophe.exercices.tp2;

import fr.christophe.exercices.tp2.adresse.Adresse;
import fr.christophe.exercices.tp2.identite.Identite;
import fr.christophe.exercices.tp2.salaire.Salaire;
import fr.christophe.exercices.tp2.salarie.Salarie;
import fr.christophe.exercices.tp2.salariecdi.SalarieCdi;

public class Main {
    public static void main(String[] args){

        Adresse adresse = new Adresse("rue", "de la rue", 59150, "Paris", "Belgique");
        Adresse nouvelleAdresse = new Adresse("rue", "de la rue", 59150, "Marseille", "Belgique");

        Identite identite = new Identite("Jack", "Jacques", adresse);

        Salaire salaire = new Salaire(10);

        SalarieCdi jacques = new SalarieCdi(salaire, identite);

        System.out.println("----------------------------------");

        System.out.println(jacques.travailler());
        System.out.println(jacques.travailler(200));

        System.out.println("----------------------------------");

        System.out.println(jacques.getIdentite().getAdresse());
        jacques.demenager(nouvelleAdresse);
        System.out.println(jacques.getIdentite().getAdresse());

        System.out.println("----------------------------------");

        System.out.println(jacques.getSalaire().getTauxHoraire());
        jacques.augmenter(1.25);
        System.out.println(jacques.getSalaire().getTauxHoraire());

        System.out.println("----------------------------------");



//
//        System.out.println(jacques.travailler(200));
//        System.out.println(jacques.travailler());
    }
}
