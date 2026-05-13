 package List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> eleves = new ArrayList<>();
        eleves.add("mehrez");
        eleves.add("selim");
        eleves.add("hazem");
        eleves.add("youssef");

        System.out.println(eleves);

        eleves.remove("selim");
        System.out.println(eleves);


        System.out.println(eleves.size());


        Collections.sort(eleves);
        System.out.println(eleves);

        eleves.set(1, "youssef");
        System.out.println(eleves);


    }
}
