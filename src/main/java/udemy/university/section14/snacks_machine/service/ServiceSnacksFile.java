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
               //this.snacks = getSnacks();
           } else {
               var out = new PrintWriter(new FileWriter(file));
               out.close(); //save the file
               System.out.print("The file was created .....");
           }
       } catch (Exception e) {
           System.out.print("Error to create file: " + e);
       }
       //if do not exist, charging the initial snacks
       //chargingInitialSnacks();
   }

    @Override
    public void addSnack(Snack snack) {

    }

    @Override
    public List<Snack> getSnacks() {
        return List.of();
    }

    @Override
    public void showSnacks() {

    }
}
