package fr.christophe.exercices;

import fr.christophe.exercices.tp1.exercice1.Moyenne;
import fr.christophe.exercices.tp1.exercice2.CalculTTC;
import fr.christophe.exercices.tp1.exercice3.Palindrome;

public class Main {
    public static void main(String[] args){

        // Test de la classe Moyenne
        Moyenne moy = new Moyenne();
        int[] liste = {3, 1, 8};

        System.out.println(moy.moyenne(liste));

        //Test de la classe CalculTTC
        CalculTTC calcul = new CalculTTC();
        System.out.println(calcul.HtToTtc(5));

        //Test de la classe Palindrome
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.estUnPalindrome(151));
        System.out.println(palindrome.estUnPalindrome(152));
    }
}
