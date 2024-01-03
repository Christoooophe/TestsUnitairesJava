package fr.christophe.exercices.exercice1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MoyenneTest {

    private Moyenne moyenne;

    @BeforeEach
    public void setUp(){
        moyenne = new Moyenne();
    }

    @ParameterizedTest(name = "Test {index} : {0}")
    @MethodSource("argumentsCaculMoyenne")
    @DisplayName("Test calcul moyenne")
    public void testCalculMoyenne(int[] listeNotes, int resultatEspere){

        int result = moyenne.moyenne(listeNotes);

        assertEquals(resultatEspere, result, "Raté !");

    }

    @ParameterizedTest(name = "Test {index} : {0}")
    @MethodSource("argumentsPlusEtMoinsTroisNotes")
    @DisplayName("Test nombre de notes")
    public void testNombresDeNote(int[] listeNotes) {

        assertThrows(IllegalArgumentException.class, () -> moyenne.moyenne(listeNotes));

    }

    @ParameterizedTest(name = "Test {index} : {0}")
    @MethodSource("argumentsNotesInferieureSuperieureZeroEtVingt")
    @DisplayName("Test notes pas entre 0 et 20")
    public void testRangeNotes(int[] listeNotes) {

        assertThrows(IllegalArgumentException.class, () -> moyenne.moyenne(listeNotes));

    }

    private static Stream<Arguments> argumentsCaculMoyenne() {
        return Stream.of(
                Arguments.of((Object) new int[]{1, 3, 5}, 3),
                Arguments.of((Object) new int[]{2, 4, 6}, 4)
        );
    }

    private static Stream<Arguments> argumentsPlusEtMoinsTroisNotes() {
        return Stream.of(
                Arguments.of((Object) new int[]{1, 3}, 2),
                Arguments.of((Object) new int[]{2, 4, 6, 8}, 5)
        );
    }

    private static Stream<Arguments> argumentsNotesInferieureSuperieureZeroEtVingt() {
        return Stream.of(
                Arguments.of((Object) new int[]{-1, 5, 12}, 2),
                Arguments.of((Object) new int[]{21, 4, 6}, 5)
        );
    }
}