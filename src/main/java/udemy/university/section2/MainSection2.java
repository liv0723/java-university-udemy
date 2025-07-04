package udemy.university.section2;

public class MainSection2 {

    public MainSection2() {
        helloWorld();
    }

    public static void helloWorld() {
        String helloWorld = new HelloWorld().getMsg1();

        System.out.println(HelloWorld.msg);
        System.out.println(helloWorld);

    }
}
