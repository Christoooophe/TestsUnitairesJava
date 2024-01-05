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

            int temperature = this.arrayOfTemperatures[i];
            int numberInsideArray = Math.abs(temperature);

            if (numberInsideArray < valueTemporary) {
                valueToFind = temperature;
                valueTemporary = numberInsideArray;
            }
            else if (numberInsideArray == valueTemporary && temperature > 0
                    && temperature < 0) {
                valueToFind = temperature;
            }
        }
        return valueToFind;
    }
}
