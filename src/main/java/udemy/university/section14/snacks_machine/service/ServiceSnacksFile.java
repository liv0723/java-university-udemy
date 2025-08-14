package udemy.university.section14.snacks_machine.service;

import udemy.university.section14.snacks_machine.entity.Snack;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ServiceSnacksFile implements IServiceSnacks{
   private final String NAME_FILE = "snacks.txt";
   private List<Snack> snacks = new ArrayList<>();

   public ServiceSnacksFile() {
       var file = new File(this.NAME_FILE);
       var exist = false;

       try {
           exist = file.exists();
           if (exist) {
               this.snacks = obtenerSnacks();

           } else {
               var out = new PrintWriter(new FileWriter(file));
               out.close(); //save the file
               System.out.println("The file was created .....");

           }
       } catch (Exception e) {
           System.out.print("Error to create file: " + e);
       }
       //do not exist, charging the initial snacks
       if (!exist) {
           chargingInitialSnack();
           System.out.println(this.snacks.size());
       }
   }

    private void chargingInitialSnack() {
        this.addSnack(new Snack("papa", 70));
        this.addSnack(new Snack("refresco", 70));
        this.addSnack(new Snack("pan", 70));
    }

    @Override
    public void addSnack(Snack snack) {
       this.snacks.add(snack);
       this.addSnacksFile(snack);
    }


    public List<Snack> obtenerSnacks() {
        var snacks = new ArrayList<Snack>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(this.NAME_FILE));
            for (String line: lines) {
                var aux = line.split(",");
                var nameSnack = aux[1];
                var priceSnack = Double.parseDouble(aux[2]);
                this.snacks.add(new Snack(nameSnack, priceSnack));
            }

        } catch(Exception e) {
            System.out.print("error to read the snacks file: " + e.getMessage());
            e.printStackTrace();
        }
        return this.snacks;
    }

    @Override
    public List<Snack> getSnacks() {
       return this.snacks;
    }

    @Override
    public void showSnacks() {
       var inventorySnacks = "";
       for( Snack snack: this.snacks) {
           inventorySnacks = inventorySnacks.concat(snack.toString()) + "\n";
       }
       System.out.println("************ Inventory Snacks ****************");
       System.out.println(inventorySnacks);
    }


    private void addSnacksFile(Snack snack) {
       var append = false;
       var file = new File(this.NAME_FILE);
       try {
           append = file.exists();
           var out = new PrintWriter(new FileWriter(file, append));
           out.println(snack.writeSnack());
           out.close();
       } catch(Exception e) {
           System.out.print(e);
           e.printStackTrace();
       }
    }

}
