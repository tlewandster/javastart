package t45_Referencje_do_metod.e1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        ArrayList<String> names = new ArrayList<String>(List.of("Czesław", "Henio", "Benio", "Krzysiek", "Rysiek", "Misiek"));
        names.sort(String::compareToIgnoreCase);
        System.out.println(names);
    }
}
