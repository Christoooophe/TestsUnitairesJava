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
        int valueToFind = 0;
        int valueTemporary = Integer.MAX_VALUE;
        for (int i = 0; i < this.arrayOfTemperatures.length; i++) {
            int numberInsideArray = Math.abs(this.arrayOfTemperatures[i]);
            if (numberInsideArray < valueTemporary) {
                valueToFind = this.arrayOfTemperatures[i];
                valueTemporary = numberInsideArray;
            }
            else if (numberInsideArray == valueTemporary && this.arrayOfTemperatures[i] > 0
                    && this.arrayOfTemperatures[valueToFind] < 0) {
                valueToFind = this.arrayOfTemperatures[i];
            }
        }
        return valueToFind;
    }
}
