import java.util.ArrayList;
import java.util.Scanner;

public class Plats {
    static Scanner input = new Scanner(System.in);
    private ArrayList<Plat> listePlats = new ArrayList<>();

    public Plats() {}

    public void ajouterPlat(){
        System.out.println("entrer le nom de nouveau plat: ");
        String nom = input.next();
        System.out.println("entrer le  prix: ");
        double prix = input.nextDouble();
        System.out.println("entrer le tempsPreparation: ");
        int tempsPreparation = input.nextInt();
        Plat p = new Plat(nom , prix , tempsPreparation);
        listePlats.add(p);
        System.out.println("Plat ajouté avec succes : " + p.getNom());
    }

    public void supprimerPlat(String nomPlat) {
        for (int i = 0; i < listePlats.size(); i++) {
            if (listePlats.get(i).getNom().equalsIgnoreCase(nomPlat)) {
                listePlats.remove(i);
                System.out.println("Plat supprimé : " + nomPlat);
                return;
            }
        }
        System.out.println("Plat non trouvé : " + nomPlat);
    }


    public void afficherTousPlats() {
        System.out.println("\n=== Liste des plats ===");

        if (listePlats.isEmpty()) {
            System.out.println("Aucun plat disponible.");
            return;
        }

        for (int i = 0; i < listePlats.size(); i++) {
            System.out.println(listePlats.get(i));
        }
    }

}
