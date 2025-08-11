package udemy.university.section14.snacks_machine.service;

import udemy.university.section14.snacks_machine.entity.Snack;

import java.util.ArrayList;
import java.util.List;

public class ServiceSnacksList implements IServiceSnacks{
    private static final List<Snack> snacks;

    //bloque static inicializador
    static {
        snacks = new ArrayList<>();
        snacks.add(new Snack("papa", 50));
        snacks.add(new Snack("refresco", 70));
        snacks.add(new Snack("sandwish", 120));
    }

    @Override
    public void addSnack(Snack snack) {
        ServiceSnacksList.snacks.add(snack);
    }

    @Override
    public List<Snack> getSnacks() {
        return ServiceSnacksList.snacks;
    }

    @Override
    public void showSnacks() {
        var inventory = "";

        for (var snack : snacks) {
            inventory += snack.toString() + "\n";
        }

        System.out.println("************ Snacks in Inventory ***********");
        System.out.println(inventory);

    }



}
