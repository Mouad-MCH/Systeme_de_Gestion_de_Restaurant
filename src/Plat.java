public class Plat {

        private String nom;
        private double prix;
        private String typeSpecial;
        private boolean isSpecial;

        public Plat(String nom, double prix) {
            this.nom = nom;
            this.prix = prix;
            this.typeSpecial = "";
            this.isSpecial = false;
        }

        public Plat(String nom, double prix, String typeSpecial) {
            this.nom = nom;
            this.prix = prix;
            this.typeSpecial = typeSpecial;
            this.isSpecial = true;
        }

        public double getPrix() {
            return prix;
        }

        public String getNom() {
            return nom;
        }

        public String getTypeSpecial() {
            return typeSpecial;
        }

        public boolean isSpecial() {
            return isSpecial;
        }


        @Override
        public String toString() {
            if(isSpecial) {
                return nom + " (" + typeSpecial + ") - " + prix + " MAD";
            }
            return nom + " - " + prix + " MAD";
        }
}
