package fr.christophe.exercices;

import fr.christophe.exercices.exercice1.Moyenne;

import java.util.List;

public class Main {
    public static void main(String[] args){

        // Test de la classe Moyenne
        Moyenne moy = new Moyenne();
        int[] liste = {3, 1, 8};

        System.out.println(moy.moyenne(liste));
    }
}
