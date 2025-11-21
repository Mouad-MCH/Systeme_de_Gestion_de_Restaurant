public class PlatSpeciale extends Plats {

    public PlatSpeciale() {
        super();
    }

    @Override
    public void ajouterPlat() {
        System.out.println("=== Ajouter un plat spécial ===");
        super.ajouterPlat();
        System.out.println("Plat spécial ajouté avec un traitement particulier !");
    }

    @Override
    public void supprimerPlat(String nomPlat) {
        System.out.println("=== Suppression d'un plat spécial ===");
        super.supprimerPlat(nomPlat);
        System.out.println(" Suppression traitée pour plat spécial !");
    }

    @Override
    public void afficherTousPlats() {
        System.out.println("=== Liste des plats spéciaux ===");
        super.afficherTousPlats();
        System.out.println(" Fin d’affichage des plats spéciaux.");
    }
}
