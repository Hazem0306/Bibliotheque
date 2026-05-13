package exercice_e5er;

class Produit {

    private String nom;
    private double prix;


    public Produit(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }


    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }


    public void afficherDetails() {
        System.out.println("--- Produit Standard ---");
        System.out.println("Nom : " + nom);
        System.out.println("Prix : " + prix + "€");
    }
}