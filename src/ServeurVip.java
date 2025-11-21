
public class ServeurVip extends Serveur {
    private int bounus;

    public ServeurVip(int serveurId, String nom, int bounus) {
        super(serveurId, nom);
        this.bounus = bounus;
    }
@Override
public void AddServeurVip(){
      System.out.println("=== Ajouter un serveur Vip ===");
      super.AddServeur();
      System.out.println("Serveur Vip ajouté avec un equipe !"+bounus);
    }
    @Override
    public void SupprimerServeurVip(){
        System.out.println("=== Supprimer un serveur Vip ===");
        super.SupprimerServeur();
        System.out.println("Serveur Vip supprimer dans equipe !"+bounus);
    }
    public void AfficherServeurVip(){
        System.out.printf("=== Afficher tous serveur===");
        super.AfficherServeur();
        System.out.printf("Serveurs :");

    }

    @Override
    public String toString() {
        return "ServeurVip{" +
                "bounus=" + bounus +
                '}';
    }


}
