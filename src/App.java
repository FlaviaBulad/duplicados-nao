import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> frutas1 = new ArrayList<String>();

        frutas1.add("Morango");
        frutas1.add("Uva");
        frutas1.add("Acerola");
        frutas1.add("Manga");
     
        List<String> frutas2 = new ArrayList<String>();

        frutas2.add("Pêra");
        frutas2.add("Caju");
        frutas2.add("Morango");
        frutas2.add("Kiwi");

        for (String fruta : frutas1) {
            if (frutas2.contains(fruta)) {
                System.out.println("Fruta repetida: " + fruta);
            }
        }

    }
}
