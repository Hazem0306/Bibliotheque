public class Mamifere extends Animal {

    private double temperatureCorps;

    public Mamifere(String nom, int age, double temperatureCorps) {
        super(nom, age, TypeAnimal.MAMMIFERE);
        this.temperatureCorps = temperatureCorps;
    }

    public double getTemperatureCorps() {
        return temperatureCorps;
    }

    public void setTemperatureCorps(double temperatureCorps) {
        this.temperatureCorps = temperatureCorps;
    }
    public void allaiter() {
        System.out.println(getNom() + "  avec du lait.");
    }
    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Température du corps : " + temperatureCorps + " °C");
    }

    @Override
    public void manger() {
        System.out.println(getNom() + " est en train de manger.");
    }

    @Override
    public void faireDuBruit() {
        System.out.println(getNom() + " fait un bruit de mammifère.");
    }
}






}
