import exercice_e5er.Produit;

class ProduitSoldes extends Produit {

    private double pourcentageReduction;

    public ProduitSoldes(String nom, double prix, double pourcentageReduction) {
        super(nom, prix);
        this.pourcentageReduction = pourcentageReduction;
    }

    @Override
    public void afficherDetails() {
        double prixReduit = getPrix() - (getPrix() * pourcentageReduction / 100);
        System.out.println("Nom : " + getNom());
        System.out.println("Prix original : " + getPrix() + "€");
        System.out.println("Réduction : " + pourcentageReduction + "%");
        System.out.println("Nouveau prix : " + prixReduit + "€");
    }
}