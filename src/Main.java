import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
public class Main {

    public static void main(String[] args){

        set2();

    }

    public static void set2() {
        Set<String> marche = new HashSet<String>(Arrays.asList("Zara","H&M","Moschino","Gucci"));

        marche.add("Versace");

        for (String i : marche) {
            System.out.println(i);
        }


    }
}
