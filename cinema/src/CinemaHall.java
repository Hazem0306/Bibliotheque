public class CinemaHall {
    private Seat[][] seats;

    public CinemaHall(int rows, int seatsPerRow) {
        seats = new Seat[rows][seatsPerRow];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seatsPerRow; j++) {
                seats[i][j] = new Seat(i + 1, j + 1);
            }
        }
    }
    public void displaySeats() {
        System.out.println("\n=== État actuel de la salle ===");
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println(); // retour à la ligne pour chaque rangée
        }
        System.out.println("Légende : [O] = disponible, [X] = réservé\n");
    }
    public void reserveSeat(int row, int number) {
        if (row < 1 || row > seats.length ||
                number < 1 || number > seats[0].length) {
            System.out.println("❌ Ce siège n’existe pas !");
            return;
        }

        Seat seat = seats[row - 1][number - 1];

        if (seat.isAvailable()) {
            seat.reserve();
            System.out.println("✅ Siège " + row + "-" + number + " réservé avec succès !");
        } else {
            System.out.println("⚠️  Ce siège est déjà réservé.");
        }
    }
}