package fr.christophe.exercices.tp1.exercice4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class DoublonTest {

    //Je ne vois pas d'autre test à effectuer pour le moment, les tableaux peuvent être vides, contenir des nombres
    //négatifs...
    @ParameterizedTest(name = "Test {index} : {0}")
    @MethodSource("argumentsListeNombres")
    @DisplayName("Test doublon")
    public void testDoublon(int[] liste, boolean bool){

        Doublon doublon = new Doublon();

        boolean resultat = doublon.verifierSiDoublons(liste);

        assertEquals(bool, resultat, "GG !");
    }

    private static Stream<Arguments> argumentsListeNombres() {
        return Stream.of(
                Arguments.of((Object) new int[]{1, 3, 6, 3, 5}, true),
                Arguments.of((Object) new int[]{-8, 4, 2, 15}, false),
                Arguments.of((Object) new int[]{}, false)
        );
    }
}