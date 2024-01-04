package fr.christophe.exercices.tp2.adresse;

public class Adresse {
    private String voie;
    private String rue;
    private int codePostal;
    private String ville;
    private String pays;

    public Adresse(String voie, String rue, int codePostal, String ville, String pays) {
        this.voie = voie;
        this.rue = rue;
        this.codePostal = codePostal;
        this.ville = ville;
        this.pays = pays;
    }

    public String getVoie() {
        return voie;
    }

    public void setVoie(String voie) {
        this.voie = voie;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    @Override
    public String toString(){
        return this.voie + " " + this.rue + " " + this.codePostal + " " + this.ville + " " + this.pays ;
    }
}