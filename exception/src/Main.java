import java.util.Scanner;


 class Divexcept {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("entrez le premier nombre : ");
            int a = sc.nextInt();

            System.out.print("entrez le dexieme nombre : ");
            int b = sc.nextInt();

            int resultat = a / b;


            System.out.println("res est : " + resultat);

        }
        catch (ArithmeticException e) {
            System.out.println("erreur : division par 0");
        }
    }
}