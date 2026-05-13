public class CarteBancaire extends Payment {
@Override
public void effectuerPaiement(double montant){

    System.out.println("payment de " + montant + "par PayPal");


    }

}
