import java.util.Scanner;

/**
 * Classe principale du programme de gestion d'un hôpital (sbitar).
 * Elle permet à l'utilisateur d'afficher, d'ajouter ou de consulter des patients
 * placés dans une structure en 2D (2 étages × 8 chambres).
 */
public class MainSbitar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        sbitar sbitar = new sbitar(2, 8);

        System.out.println(" Mar7ba bikom fl sbitar barra 9ayed se3a ");
        sbitar.Afficherchambres(); // Affichage initial (toutes chambres libres)

        int choix;
        do {


            System.out.println("1. Afficher les chambres");
            System.out.println("2. Ajouter un patient");
            System.out.println("3. Consulter une chambre");
            System.out.println("4. Quitter");
            System.out.print(" Votre choix : ");
            choix = sc.nextInt();
            sc.nextLine();

            switch (choix) {
                case 1:

                    sbitar.Afficherchambres();
                    break;

                case 2:

                    System.out.print(" Nom du patient : ");
                    String nom = sc.nextLine();

                    System.out.print(" Âge : ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print(" Maladie : ");
                    String maladie = sc.nextLine();


                    System.out.print(" Étage (1 ou 2) : ");
                    int etage = sc.nextInt();

                    System.out.print("  Numéro de chambre (1–8) : ");
                    int chambre = sc.nextInt();


                    patient p = new patient(nom, age, maladie);
                    sbitar.Ajouterpatient(etage, chambre, p);
                    break;

                case 3:

                    System.out.print("Étage : ");
                    int e = sc.nextInt();

                    System.out.print("Chambre : ");
                    int c = sc.nextInt();

                    sbitar.Consultpatient(e, c);
                    break;

                case 4:
                    System.out.println(" Merci d’avoir visité le Sbitar !");
                    break;

                default:
                    System.out.println(" Choix invalide, réessayez !");
                    break;
            }

        } while (choix != 4);

        sc.close();
    }
}