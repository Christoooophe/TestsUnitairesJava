package fr.christophe.exercices.tp3.exercice1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThermometreTest {

    @ParameterizedTest
    @MethodSource("listeTemperatures")
    @DisplayName("Test retour plus proche zéro")
    public void should_return_closest_temperature_from_zero(int[] listeTemperatures, int expectedResult){
        Thermometre thermometre = new Thermometre(listeTemperatures);
        int result = thermometre.getClosestTemperature();
        assertEquals(expectedResult, result);
    }

    private static Stream<Arguments> listeTemperatures() {
        return Stream.of(
                Arguments.of((Object) new int[]{2}, 2),
                Arguments.of((Object) new int[]{5, 10}, 5),
                Arguments.of((Object) new int[]{-5, -10, -15}, -5),
                Arguments.of((Object) new int[]{-25, 100, 50, 28, -522}, -25)
        );
    }

}
