package fr.christophe.exercices.tp2.salariecdi;

import fr.christophe.exercices.tp2.adresse.Adresse;
import fr.christophe.exercices.tp2.identite.Identite;
import fr.christophe.exercices.tp2.salaire.Salaire;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
//
@ExtendWith(MockitoExtension.class)
class SalarieCdiTest {

    @Mock
    private Adresse adressMock;

    @Mock
    private Identite identiteMock;

    @Mock
    private Salaire salaireMock;

    @InjectMocks
    private SalarieCdi salarieCdi;

    @BeforeEach
    public void setUp() {
    }

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

        verify(
                adressMock,
                times(1)
        ).setVille("test");
    }

//    @Test
//    public void testAugmenter(){
//
//        verify(
//                salaireMock,
//                times(1)
//        ).
//    }
}
