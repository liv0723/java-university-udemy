package udemy.university.section4;

public class MainSection4 {
    public MainSection4() {
        classString();
        indicesString();
        immutabilityString();
    }

    public void classString() {
        System.out.println("************************** Class String *****************************");
        ClassString classString = new ClassString();
        System.out.println(classString.toString());
    }
    public void indicesString() {
        System.out.println("************************* Indices String *************************");
        IndicesString indicesString = new IndicesString();
        System.out.println(indicesString.indicesString());

    }
    public void immutabilityString() {
        System.out.println("*********************** Immutability String ***************************");
        ImmutabilityString immutabilityString = new ImmutabilityString();
        System.out.println(immutabilityString.toString());
    }
}
