package fr.christophe.exercices.tp1.exercice3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PalindromeTest {

    private Palindrome palindrome;

    @BeforeEach
    public void setUp(){
        palindrome = new Palindrome();
    }

    @ParameterizedTest(name = "Test {index} : {0} / {1}")
    @CsvSource({
            "151, true",
            "152, false"
    })
    @DisplayName("Test palindrome")
    public void testPalindrome(long nombre, boolean nbrePalindrome){
        boolean result = palindrome.estUnPalindrome(nombre);
        assertEquals(nbrePalindrome, result, "Rip le s");
    }

    @ParameterizedTest(name = "Test {index} : {0}")
    @ValueSource(ints = {5, 3, 9})
    @DisplayName("Test nombre moins de 2 chiffres")
    public void testLongueurNombre(int nombre) {

        assertThrows(IllegalArgumentException.class, () -> palindrome.estUnPalindrome(nombre));

    }

}