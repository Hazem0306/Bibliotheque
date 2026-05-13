public class Comptebanquaire {
    private String numeroCompte;
    private double solde;

    public CompteBancaire(String numeroCompte, double solde) {
        this.numeroCompte=numeroCompte;
        this.solde=solde;

    }
    public void setSolde(double montant){
        this.solde=montant;

    }
    public double getSolde(){
        return solde;
    }
    public void retrait(double montant) throws SoldeInsuffisantException {
        if (montant > solde) {
            throw new SoldeInsuffisantException("fond insufisant");

        } else {
            solde -= montant;
            System.out.println(montant + " retiré");
        }


    }