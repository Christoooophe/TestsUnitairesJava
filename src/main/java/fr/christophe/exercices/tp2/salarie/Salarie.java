package fr.christophe.exercices.tp2.salarie;

import fr.christophe.exercices.tp2.adresse.Adresse;
import fr.christophe.exercices.tp2.identite.Identite;
import fr.christophe.exercices.tp2.salaire.Salaire;

public abstract class Salarie {
    protected Salaire salaire;
    protected Identite identite;
    public Salarie(Salaire salaire, Identite identite){
        this.salaire = salaire;
        this.identite = identite;
    }

    public Salaire getSalaire() {
        return salaire;
    }

    public void setSalaire(Salaire salaire) {
        this.salaire = salaire;
    }

    public Identite getIdentite() {
        return identite;
    }

    public void setIdentite(Identite identite) {
        this.identite = identite;
    }

    /**
     * Permet de changer l'adresse du salarié
     * @param adresse
     */
    public void demenager(Adresse adresse){
        this.identite.setAdresse(adresse);
    }

    /**
     * Permet de retourner le nombre d'heures travaillées par le salarié
     * @return heuresTravaillées
     */
    public String travailler(){
        return "Le salarié " + this.identite.getNom() + " " + this.identite.getPrenom()
                + " a travaillé 151.67 heures et a perçu " + this.salaire.payer(151.67);
    }

    /**
     * Permet de retourner les heures travaillées mais avec un parametre (heuresTravaillees)
     * @param heuresTravaillees
     * @return heures travaillées
     */
    public String travailler(double heuresTravaillees){
        return "Le salarié " + identite.getNom() + " " + identite.getPrenom() + " a travaillé "
                + heuresTravaillees + " heures et a perçu " + salaire.payer(heuresTravaillees);
    }

    /**
     * Permet d'augmenter le tauxHoraire du salarié en passant un pourcentage en paramètres et en faisant un set du
     * taux horaire dans la classe Salaire
     * @param pourcentage
     */
    public void augmenter(double pourcentage){
        this.salaire.setTauxHoraire(this.salaire.getTauxHoraire() * pourcentage);
    }

}
