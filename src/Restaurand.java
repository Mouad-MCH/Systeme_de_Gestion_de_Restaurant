import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Restaurand {

    private List<Plat> plats;
    private List<Command> commands;

    public Restaurand() {
        this.plats = new ArrayList<>();
        this.commands = new ArrayList<>();
    }

    public void ajouterPlat(Plat p){
        if(!plats.contains(p)) {
            plats.add(p);
            System.out.println("Ajoute " + p.getNom() + " 👍");
        }else {
            System.out.println("Plat est deja contains");
        }
    }

    public void passerComande(Command c) {
        if(!commands.contains(c)) {
            commands.add(c);
            System.out.println("Ajoute 👍");
            c.getClient().passCommande(c);
            c.getServeur().prendreCommande(c);
        }else {
            System.out.println("Command est deja contains");
        }
    }


    public List<Plat> getMenu() {
        return new ArrayList<>(plats);
    }


    public Plat afficherMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Menu du Restaurand ===");
        for (Plat p : plats) {
            System.out.println(p.toString());
        }
        System.out.println("==========================");
        System.out.print(" Entre nom de plat: ");
        String chois = input.nextLine();
        for(Plat p : plats) {
            if(p.getNom().contains(chois)) {
                return p;
            }
        }
        return null;
    }
}
