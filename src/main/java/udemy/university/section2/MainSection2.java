package udemy.university.section2;

import udemy.university.section3.Variables;

public class MainSection2 {

    public MainSection2() {
        helloWorld();
        presentJava();

    }

    public static void helloWorld() {
        System.out.println("******************* Hello World ***********************");
        String helloWorld = new HelloWorld().getMsg1();

        System.out.println(HelloWorld.msg);
        System.out.println(helloWorld);

    }

    public static void presentJava() {
        System.out.println("****************** Presentation Java ********************");
        PresentJava presentJava = new PresentJava();
        String presentation = """
                """.concat("name: " + presentJava.getName() + "\nage: "+presentJava.getAge() + "\nCountry: " + presentJava.getCountry());

        System.out.println(presentation);
    }

}
