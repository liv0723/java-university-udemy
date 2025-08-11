package udemy.university.section13.collections.snack_machine;

import java.util.ArrayList;
import java.util.List;

public class Snacks {
    private static final List<Snack> snacks;

    //bloque static inicializador
    static {
        snacks = new ArrayList<>();
        snacks.add(new Snack("papa", 50));
        snacks.add(new Snack("refresco", 70));
        snacks.add(new Snack("sandwish", 120));
    }

    public static void addSnack(Snack snack) {
        Snacks.snacks.add(snack);
    }

    public static List<Snack> getSnacks() {
        return Snacks.snacks;
    }

    public static void showSnacks() {
        var inventory = "";

        for (var snack : snacks) {
            inventory += snack.toString() + "\n";
        }

        System.out.println("************ Snacks in Inventory ***********");
        System.out.println(inventory);

    }



}
