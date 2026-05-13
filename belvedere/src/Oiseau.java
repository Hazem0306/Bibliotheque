public class Oiseau {

    public class Oiseau extends Animal {

        private double envergure;


        public Oiseau(String nom, int age, double envergure) {
            super(nom, age, TypeAnimal.OISEAU);
            this.envergure = envergure;
        }

                public double getEnvergure() {
            return envergure;
        }


        public void setEnvergure(double envergure) {
            this.envergure = envergure;
        }


        public void voler() {
            System.out.println(getNom() + " est en train de voler.");
        }


        @Override
        public void afficherInfos() {
            super.afficherInfos();
            System.out.println("Envergure : " + envergure + " m");
        }


        @Override
        public void manger() {
            System.out.println(getNom() + " picore sa nourriture.");
        }

        @Override
        public void faireDuBruit() {
            System.out.println(getNom() + " chante ou gazouille.");
        }
    }
}
