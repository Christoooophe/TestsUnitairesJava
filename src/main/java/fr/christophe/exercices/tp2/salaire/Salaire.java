package fr.christophe.exercices.tp2.salaire;

public class Salaire {
    private int tauxHoraire;

    public Salaire(int tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }

    public double getTauxHoraire() {
        return tauxHoraire;
    }

    public void setTauxHoraire(int tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }

    public int payer(int heures) {
        return tauxHoraire * heures;
    }

}
