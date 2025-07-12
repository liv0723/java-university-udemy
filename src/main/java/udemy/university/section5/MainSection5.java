package udemy.university.section5;

import java.util.Random;

public class MainSection5 {
    public MainSection5() {
        //scannerClass();
        //employedSystem();
        //cookingRecipes();
        //randomClass();
        stringFormat();
    }
    public void scannerClass() {
        System.out.println("************************* Scanner Class ***********************");
        ScannerClass scannerClass = new ScannerClass();
        System.out.println(scannerClass.toString());
    }
    public void employedSystem() {
        System.out.println("************************** Employed System ***********************");
        EmployedSystem employedSystem = new EmployedSystem();
        System.out.print(employedSystem.toString());

    }
    public void cookingRecipes() {
        System.out.println("****************************** Cooking Recipes *************************");
        CookingRecipes cookingRecipes = new CookingRecipes();
        System.out.println(cookingRecipes.toString());
    }
    public void randomClass() {
        System.out.println("*************************** Random Class ****************************");
        RandomClass randomClass = new RandomClass();
        System.out.println(randomClass.generateNumber());
        System.out.println(randomClass.throwDice());
    }
    public void stringFormat() {
        System.out.println("**************************** String Format ****************************");
        StringFormat stringFormat = new StringFormat();
        System.out.println(stringFormat.stringFormat());


    }
}
