public class Plat {
    private String nom;
    private double prix;
    private int tempsPreparation;

    public Plat(String nom, double prix, int tempsPreparation) {
        this.nom = nom;
        this.prix = prix;
        this.tempsPreparation = tempsPreparation;
    }

    public String getNom() {
        return nom;
    }


    @Override
    public String toString() {
        return "Plat : " + nom + " | Prix : " + prix + " DH | Temps : " + tempsPreparation + " min";
    }
}
