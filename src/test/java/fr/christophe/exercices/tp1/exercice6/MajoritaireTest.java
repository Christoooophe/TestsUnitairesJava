package fr.christophe.exercices.tp1.exercice6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MajoritaireTest {

    @ParameterizedTest(name = "Test {index} : {0} == {1}")
    @MethodSource("argumentsListeNombres")
    @DisplayName("Test nombre majoritaire")
    public void testNombreMajoritaire(int[] listeNbresMajor, int expected){

        Majoritaire major = new Majoritaire();

        int result = major.hashMap(listeNbresMajor);

        assertEquals(expected, result, "Ah bah non dsl");
    }

    private static Stream<Arguments> argumentsListeNombres() {
        return Stream.of(
                Arguments.of((Object) new int[]{2, 5, 5, 5, 5, 5, 7, 2}, 5),
                Arguments.of((Object) new int[]{2, 2, 2, 4}, 2),
                Arguments.of((Object) new int[]{4, 5, 6, 6, 6}, 6),
                Arguments.of((Object) new int[]{4, 5, 6, 6, 2}, 0)
        );
    }
}