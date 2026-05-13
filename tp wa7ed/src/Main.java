import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("het l rayon");
        double rayon = scanner.nextDouble();
        double aire = rayon * rayon * Math.PI;
        double perimetre = 2 * rayon * Math.PI;

        System.out.println(aire);
        System.out.println(perimetre);


    }
    }
