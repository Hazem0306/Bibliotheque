import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 manager  2 employe");
        Integer choix = scanner.nextInt();
        scanner.nextLine();


    System.out.print("het l esm");
    String nom = scanner.nextLine();

    System.out.print("het l swared");
    float salaire =scanner.nextFloat();

    employe flen = null;

    if (choix == 2) {
        flen = new employe(nom, salaire);
    } else if (choix ==1) {
        System.out.print("het l prime");
        float prime = scanner.nextFloat();
        flen = new manager(nom, salaire, prime);

    }
        System.out.println("Nom : " + flen.getNom());
        System.out.println("Yo5les : " + flen.calculersalaire());


    }

}
