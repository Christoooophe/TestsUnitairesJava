package fr.christophe.exercices.tp2.salariecdi;

import fr.christophe.exercices.tp2.adresse.Adresse;
import fr.christophe.exercices.tp2.identite.Identite;
import fr.christophe.exercices.tp2.salaire.Salaire;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
//
@ExtendWith(MockitoExtension.class)
class SalarieCdiTest {

    @Mock
    private Identite identiteMock;

    @Mock
    private Salaire salaireMock;

    @InjectMocks
    private SalarieCdi salarieCdi;

    @Test
    public void testPayer() {
        String result = salarieCdi.travailler();

        verify(
                salaireMock,
                times(1)
        ).payer(151.67);

        assertEquals(
                "Le salarié " + identiteMock.getNom() + " " + identiteMock.getPrenom()
                        + " a travaillé 151.67 heures et a perçu " + salaireMock.payer(151.67),
                result
        );
    }

    @Test
    public void testPayerAvecParametres() {
        String result = salarieCdi.travailler(200);

        verify(
                salaireMock,
                times(1)
        ).payer(200);

        assertEquals(
                "Le salarié " + identiteMock.getNom() + " " + identiteMock.getPrenom()
                        + " a travaillé 200.0 heures et a perçu " + salaireMock.payer(200),
                result
        );
    }

    @Test
    public void testDemenager() {

        Adresse nouvelleAdresse = new Adresse(2, "rue", 02, "ee", "ff");

        salarieCdi.demenager(nouvelleAdresse);

        verify(
                identiteMock,
                times(1)
        ).setAdresse(nouvelleAdresse);

    }

    @ParameterizedTest
    @CsvSource({
            "10, 1.25, 12.5",
            "15, 1.50, 22.5"
    })
    @DisplayName("Test augmenter")
    public void testAugmenter(double tauxHoraire, double augmentation, double expected){
        Salaire salaire = new Salaire(tauxHoraire);
        SalarieCdi salarieTest = new SalarieCdi(salaire, identiteMock);

        salarieTest.augmenter(augmentation);
        double result = salarieTest.getSalaire().getTauxHoraire();

        assertEquals(expected, result, "Le résultat attendu était : " + expected);
    }
}
