package fr.christophe.exercices.exercice2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculTTCTest {

    private CalculTTC calcul;

    @BeforeEach
    public void setUp(){
        calcul = new CalculTTC();
    }

    @ParameterizedTest(name = "Test {index} : {0}")
    @ValueSource(ints = {25, 20, 10, 5})
    @DisplayName("Test calcul TTC")
    public void testCalculTTC(int prixHt){

        double result = calcul.HtToTtc(prixHt);

        double expected = prixHt * 1.20;

        assertEquals(expected, result, "Dommage !");
    }

    @ParameterizedTest(name = "Test {index} : {0}")
    @ValueSource(ints = {-25})
    @DisplayName("Test prix inférieur zéro")
    public void testPrixHtInferieurZero(int prixHt){

        assertThrows(IllegalArgumentException.class, () -> calcul.HtToTtc(prixHt));

    }
}