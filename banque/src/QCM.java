import java.util.Scanner;

public class QCM extends Question implements Evaluable {
    private String[] options;
    private int correctIndex;

    public QCM(String texte, Difficulty difficulty, int points, String[] options, int correctIndex) {
        super(texte, difficulty, points);
        this.options = options;
        this.correctIndex = correctIndex;
    }

    @Override
    public void ask(Scanner scanner) {
        System.out.println("Question à choix multiples : " + texte);
        System.out.println("Difficulté : " + difficulty + " | Points : " + points);

        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }

        System.out.print("Votre réponse (numéro) : ");
        userAnswer = scanner.nextLine();
    }

    @Override
    public boolean evaluate() {
        try {
            int answer = Integer.parseInt(userAnswer) - 1;
            return answer == correctIndex;
        } catch (Exception e) {
            return false;
        }
    }
}