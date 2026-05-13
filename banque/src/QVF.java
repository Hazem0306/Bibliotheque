import java.util.Scanner;

public class QVF extends Question implements eval {
    private boolean correctAnswer;

    public QVF(String texte, Difficulty difficulty, int points, boolean correctAnswer) {
        super(texte, difficulty, points);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public void ask(Scanner scanner) {
        System.out.println("Question Vrai/Faux : " + texte);
        System.out.println("Difficulté : " + difficulty + " | Points : " + points);
        System.out.print("Votre réponse (true/false) : ");
        userAnswer = scanner.nextLine();
    }

    @Override
    public boolean evaluate() {
        return userAnswer.equalsIgnoreCase(String.valueOf(correctAnswer));
    }
}