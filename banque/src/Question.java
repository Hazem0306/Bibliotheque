import java.util.Scanner;

public abstract class Question {
    protected String texte;
    protected Difficulty difficulty;
    protected int points;
    protected String userAnswer;

    public Question(String texte, Difficulty difficulty, int points) {
        this.texte = texte;
        this.difficulty = difficulty;
        this.points = points;
    }

    public String getTexte() {
        return texte;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public int getPoints() {
        return points;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public abstract void ask(Scanner scanner);
}