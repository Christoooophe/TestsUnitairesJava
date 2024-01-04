package fr.christophe.exercices.tp1;

import fr.christophe.exercices.tp1.exercice1.Moyenne;
import fr.christophe.exercices.tp1.exercice2.CalculTTC;
import fr.christophe.exercices.tp1.exercice3.Palindrome;
import fr.christophe.exercices.tp1.exercice4.Doublon;
import fr.christophe.exercices.tp1.exercice5.RomanToNumber;
import fr.christophe.exercices.tp1.exercice6.Majoritaire;

public class Main {
    public static void main(String[] args){

        // Test de la classe Moyenne
        Moyenne moy = new Moyenne();
        int[] liste = {3, 1, 8};

        System.out.println("La moyenne : " + moy.moyenne(liste));

        //Test de la classe CalculTTC
        CalculTTC calcul = new CalculTTC();
        System.out.println("Le prix TTC : " + calcul.HtToTtc(5));

        //Test de la classe Palindrome
        Palindrome palindrome = new Palindrome();
        System.out.println("Est un palindrome ? " + palindrome.estUnPalindrome(151));
        System.out.println("Est un palindrome ? " + palindrome.estUnPalindrome(152));

        //Test des doublons
        Doublon doublon = new Doublon();
        int[] listeNbres = {2, 5, 3, 5, 1};
        System.out.println("Contient des doublons ? " + doublon.verifierSiDoublons(listeNbres));

        //Test des chiffres Romains
        RomanToNumber chiffresRomain = new RomanToNumber();
        System.out.println("Chiffres arabes depuis nombre romain : " + chiffresRomain.convertirNombreRomainEnNombreArabe("XIV"));

        //Test de la classe Majoritaire
        Majoritaire major = new Majoritaire();
        int[] listeNbresMajor = {2, 5, 5, 5, 5, 5, 7, 2};
        System.out.println("Majoritaire : " + major.hashMap(listeNbresMajor));
    }
}
