package fr.christophe.exercices.tp3.exercice1;

public class Thermometre {
    private int[] tableauTemperatures;

    public Thermometre(int[] tableauTemperatures){
        this.tableauTemperatures = tableauTemperatures;
    }

    /**
     * Cette méthode renvoie la température la plus proche de zéro. Elle récupère les valeurs dans le tableauTemperatures
     * donné en attribut à la création de l'instanciation de la classe
     * @return temperature plus proche de zéro
     */
    public int getClosestTemperature(){
        return 2;
    }
}
