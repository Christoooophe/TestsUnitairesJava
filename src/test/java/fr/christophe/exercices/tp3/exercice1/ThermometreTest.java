package fr.christophe.exercices.tp3.exercice1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThermometreTest {
    @Test
    public void should_return_temperature_2(){
        int[] tableau = {2};
        Thermometre thermometre = new Thermometre(tableau);
        int result = thermometre.getClosestTemperature();
        assertEquals(2, result);
    }
}
