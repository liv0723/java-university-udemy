package udemy.university.section5;

public class MainSection5 {
    public MainSection5() {
        scannerClass();
        employedSystem();
        cookingRecipes();
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
}
