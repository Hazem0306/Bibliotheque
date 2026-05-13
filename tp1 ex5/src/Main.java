import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("entrez le montant a payer :");
        double montant = scanner.nextDouble();

        System.out.println("bech bch t5ales ?");
        System.out.println("bl carte :1");
        System.out.println("paypal :2");
        int choix = scanner.nextInt();
      Payment monPayment;
        if (choix==1){
            monPayment = new CarteBancaire();
        } else if (choix == 2) {
            monPayment = new Paypal();
        } else {
            System.out.println("Choix invalide. Utilisation du paiement par défaut.");
            monPayment = new Payment();
        }

        }








    }

