package fr.christophe.exercices;

import fr.christophe.exercices.exercice1.Moyenne;

import java.util.List;

public class Main {
    public static void main(String[] args){
        Moyenne moy = new Moyenne();
        int[] liste = {1, 2, 8};

        System.out.println(moy.moyenne(liste));
    }
}
