//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public static class TestAge {
    public static void verifierAge (int age) throws AgeInvalideException {
        if (age< 18){
            throw new AgeInvalideException("trop jeune");

        } else {
            System.out.println("Age valide mar7bé !!");
        }

    }
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
        System.out.print("Entrez votre âge : ");
        int age = sc.nextInt();


        TestAge.verifierAge(age);
    }
    catch (AgeInvalideException e) {
        System.out.println("Exception : " + e.getMessage());
    }
    finally {
        sc.close();
    }
}



