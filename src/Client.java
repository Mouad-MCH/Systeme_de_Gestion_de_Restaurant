import java.util.ArrayList;
import java.util.List;

public class Client {

    private int id;
    private String nom;
    private List<Commande> commandes;

    public Client(int id, String nom) {
        this.id = id;
        this.nom = nom;
        this.commandes = new ArrayList<>();
    }

    public void passComande(Commande commande) {
        commandes.add(commande);
        System.out.print("commande pass par " + nom);
    }


    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", commandes=" + commandes +
                '}';
    }
}
