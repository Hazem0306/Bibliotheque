public class Seat {
    private int row;
    private int number;
    private boolean isAvailable;

    public Seat(int row, int number) {
        this.row = row;
        this.number = number;
        this.isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void reserve() {
        this.isAvailable = false;
    }

    public int getRow() {
        return row;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return isAvailable ? "[O]" : "[X]";

    }
}