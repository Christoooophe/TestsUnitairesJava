package fr.christophe.exercices.tp2.salaire;

public class Salaire {
    public final double HEURES_MINIMUM_TRAVAILLEES = 151.67;
    public final double COEFF_HEURES_LEGALES = 1;
    public final double COEFF_HEURES_SUP = 1.25;
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

    /**
     * Permet de calculer le salaire d'un salarié en fonction de ses heures, en prenant en compte les heures supp
     * @param heures
     * @return salaire
     */
    public double payer(double heures) {
        return calculPayePourHeuresTravaillees(heures);
    }

    /**
     * Prends en paramètres un nombre d'heures, si ce nombre est supérieur à 151, on prend le reste des heures
     * travaillées - 151 et on le multiplie par 1.25 pour avoir les heures supplémentaires payées (le coeff passé à la
     * méthode calculpaye() est de 1.25 et non de 1 pour les heures classiques
     * @param heures
     * @return salaire en prenant en compte les majorations
     */
    private double calculPayePourHeuresTravaillees(double heures){

        if (heures > this.HEURES_MINIMUM_TRAVAILLEES) {
            double heuresSup;
            heuresSup = heures - this.HEURES_MINIMUM_TRAVAILLEES;
            return calculPaye(heuresSup, COEFF_HEURES_SUP) +
                    calculPaye(this.HEURES_MINIMUM_TRAVAILLEES, this.COEFF_HEURES_LEGALES);
        }
        return calculPaye(heures, COEFF_HEURES_LEGALES);
    }

    /**
     * Prend en paramètre un nombre d'heures et un coeff, puis rend le résultat du calcul du taux horaires * le coeff
     * puis le réultat du calcul précédent multiplié par les heures
     * @param heures
     * @param coeff
     * @return Combien la personne va être payée
     */
    private double calculPaye(double heures, double coeff){
        return (this.tauxHoraire * coeff) * heures;
    }
}
