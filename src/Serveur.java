import java.util.Scanner;

public abstract class Serveur {
    private  int serveurId;
    private String nom;
public static int count=1;

    public Serveur(int serveurId, String nom){
        this.serveurId=count++;
        this.nom=nom;
    }

    public Serveur(String nom, int serveurId) {
    }

    public int getServeurId() {
        return serveurId;
    }

    public void setServeurId(int serveurId) {
        this.serveurId = serveurId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public abstract void AddServeurVip();

    public abstract void SupprimerServeurVip();

    @Override
    public String toString() {
        return "Serveur{" +
                "serveurId=" + serveurId +
                ", nom='" + nom;
    }

    public void AddServeur() {
        Scanner input =new Scanner(System.in);
        System.out.println("entrer un nom de serveur :");
        String nom = input.nextLine();
        System.out.printf("ajouter un serveur dans equipe "+nom);
        Serveur s = new Serveurs(nom,getServeurId());
        this.serveurs.add(s);
    }

    public void SupprimerServeur() {
        Scanner input =new Scanner(System.in);
        System.out.print("entrer Id Serveur :");
        int id = input.nextInt();
        for(Serveur a:serveurs){
            if(a.getServeurId() == id){
                serveurs.remove(id);
            }
        }
        System.out.printf("supprimer un serveur dans equipe "+getServeurId());
    }

    public void AfficherServeur() {
        System.out.println("\n=== Liste des serveurs ===");

        if (serveurs.isEmpty()) {
            System.out.println("Aucun serveur disponible.");
            return;
        }
        for (Serveur s1 : serveurs) {
            System.out.println("serveurs est :"+serveurs);
        }
    }
    }

}

