public class Paypal extends Payment {
@Override
    public void effectuerPaiement(double montant){

    System.out.println("payment effectue de" + montant + "€");


}
}
