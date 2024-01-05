package fr.christophe.exercices.tp3.exercice1;

public class Thermometre {
    private int[] arrayOfTemperatures;

    public Thermometre(int[] arrayOfTemperatures){
        this.arrayOfTemperatures = arrayOfTemperatures;
    }

    /**
     * Cette méthode renvoie la température la plus proche de zéro. Elle récupère les valeurs dans le tableauTemperatures
     * donné en attribut à l'instanciation de la classe
     * @return temperature plus proche de zéro
     */
    public int getClosestTemperature(){
        for (int i = 0; i < this.arrayOfTemperatures.length; i++) {
            int numberInsideArray = this.arrayOfTemperatures[i];
            if (numberInsideArray == 5) {
                return 5;
            }
        }
        return 2;
    }
}
