package udemy.university.section14.snacks_machine.service;

import udemy.university.section14.snacks_machine.entity.Snack;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
//               this.snacks = getSnacks();
//               System.out.println(this.snacks.isEmpty());
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

    @Override
    public List<Snack> getSnacks() {
        return this.snacks;
    }

    @Override
    public void showSnacks() {

    }


    private void addSnacksFile(Snack snack) {
       var append = false;
       var file = new File(this.NAME_FILE);
       try {
           append = file.exists();
           var out = new PrintWriter(new FileWriter(file, append));
           out.println(snack);
           out.close();
       } catch(Exception e) {
           System.out.print(e);
           e.printStackTrace();
       }
    }

}
