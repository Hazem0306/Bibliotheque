import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Création de la salle
        System.out.print("Entrez le nombre de rangées : ");
        int rows = sc.nextInt();

        System.out.print("Entrez le nombre de sièges par rangée : ");
        int seatsPerRow = sc.nextInt();

        CinemaHall hall = new CinemaHall(rows, seatsPerRow);
        System.out.println("\n🎥 Bienvenue dans le système de réservation de cinéma 🎥");

        hall.displaySeats();

        int choix;
        do {
            System.out.println("Menu :");
            System.out.println("1. Afficher les sièges");
            System.out.println("2. Réserver un siège");
            System.out.println("3. Quitter");
            System.out.print("Votre choix : ");
            choix = sc.nextInt();

            switch (choix) {
                case 1:
                    hall.displaySeats();
                    break;
                case 2:
                    System.out.print("Entrez le numéro de rangée : ");
                    int row = sc.nextInt();
                    System.out.print("Entrez le numéro de siège : ");
                    int number = sc.nextInt();
                    hall.reserveSeat(row, number);
                    break;
                case 3:
                    System.out.println("👋 Merci d'avoir utilisé notre système de réservation !");
                    break;
                default:
                    System.out.println("❓ Option invalide, réessayez.\n");
                    break;
            }
        } while (choix != 3);

        sc.close();
    }
}