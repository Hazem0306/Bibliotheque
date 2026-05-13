//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args){


        Scanner sc=new Scanner(System.in);

        int T[]=new int[10];
        int somme=0;

        for (int i=0;i<T.length;i++){
            System.out.print('entrer la valeur'+(i+1)+" : ");
            T[i]= sc.nextInt();
            somme +=T[i];
        }
        int min =T[0];
        int max =T[0];
        float moy=0
        for (int i=0;i<T.length;i++){
            if (T[i]>max){
                max=T[i];
            }
            if (T[i]<min){
                min=T[i];
            }
            moy+=T[i];
    }



}