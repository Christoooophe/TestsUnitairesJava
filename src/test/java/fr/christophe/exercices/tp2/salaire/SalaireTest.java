package fr.christophe.exercices.tp2.salaire;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class SalaireTest {
    private Salaire salaire;

    @BeforeEach
    public void setUp(){
        salaire = new Salaire(10);
    }

    @ParameterizedTest(name = "Test {index} : {0}")
    @CsvSource({
            "151.67, 1516.70",
            "200, 2120.83"
    })
    @DisplayName("Test calcul salaire")
    public void testCalculSalaire(double heures, BigDecimal expectedSalaire){
        BigDecimal result = salaire.payer(heures);
        assertEquals(expectedSalaire, result, "Le résultat attendu était :" + expectedSalaire);
    }
}