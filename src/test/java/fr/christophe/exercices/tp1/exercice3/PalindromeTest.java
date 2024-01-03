package fr.christophe.exercices.tp1.exercice3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    private Palindrome palindrome;

    @BeforeEach
    public void setUp(){
        palindrome = new Palindrome();
    }

    //Changement de la méthode pour tester le true et false dans deux méthodes différentes (voir commits précédents pour
    //la version précédente
    @ParameterizedTest(name = "Test {index} : {0}")
    @ValueSource(ints = {15, 225, 453, 144})
    @DisplayName("Test palindrome false")
    public void testPalindromeFalse(long nombre){
        boolean result = palindrome.estUnPalindrome(nombre);
        assertFalse(result);
    }

    @ParameterizedTest(name = "Test {index} : {0}")
    @ValueSource(ints = {151, 222, 454, 141})
    @DisplayName("Test palindrome true")
    public void testPalindromeTrue(long nombre){
        boolean result = palindrome.estUnPalindrome(nombre);
        assertTrue(result);
    }

    @ParameterizedTest(name = "Test {index} : {0}")
    @ValueSource(ints = {5, 3, 9})
    @DisplayName("Test nombre moins de 2 chiffres")
    public void testLongueurNombre(int nombre) {

        assertThrows(IllegalArgumentException.class, () -> palindrome.estUnPalindrome(nombre));

    }

}