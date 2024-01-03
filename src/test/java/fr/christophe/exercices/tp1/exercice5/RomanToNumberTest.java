package fr.christophe.exercices.tp1.exercice5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RomanToNumberTest {

    //Un problème qui pourrait être relevé, si le nombre romain est écrit en minuscule, le code ne marche plus.
    //Il faudrait donc devoir retravailler le code de la classe pour gérer la taille des charactères

    @ParameterizedTest(name = "Test {index} : {0} / {1}")
    @CsvSource({
            "XIV, 14",
            "DXLI, 541",
            "MDCCCLIX, 1859",
    })
    @DisplayName("Test nombres romains")
    public void testNombresRomains(String nombreRomain, int nombreArabe){

        RomanToNumber roman = new RomanToNumber();

        int result = roman.convertirNombreRomainEnNombreArabe(nombreRomain);

        assertEquals(nombreArabe, result, "GG !");
    }

}