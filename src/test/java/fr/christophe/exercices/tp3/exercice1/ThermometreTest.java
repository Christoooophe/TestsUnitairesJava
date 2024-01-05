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

    @Test
    public void should_return_temperature_5(){
        int[] arrayTemperatures = {5, 10};
        Thermometre thermometre = new Thermometre(arrayTemperatures);
        int result = thermometre.getClosestTemperature();
        assertEquals(5, result);
    }

    @Test
    public void should_return_temperature_8(){
        int[] arrayTemperatures = {8, 15};
        Thermometre thermometre = new Thermometre(arrayTemperatures);
        int result = thermometre.getClosestTemperature();
        assertEquals(8, result);
    }
}
