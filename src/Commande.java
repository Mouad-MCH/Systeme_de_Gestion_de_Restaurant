import java.util.*;

public class Commande {
    private List<Plat> plats = new ArrayList<>();
    private Server server;
    private Client client;

    public Commande(Client c,Plat p, Server server) {
        this.client = c;
        this.plats.add(p);
        this.server = server;
    }

    public void afficherInfo() {
        System.out.println("====== Command de " + client.getNom() + " ======");
        int i = 0;
        for(Plat p : plats) {
            System.out.println("  - plat "+ i++ + " : " + p.getNom());
        }
        System.out.println(" => Serveur : " + server.getNom());
    }

    @Override
    public String toString() {
        return "Commande{" +
                "plat=" + plats +
                ", server=" + server +
                ", clien=" + client +
                '}';
    }
}
