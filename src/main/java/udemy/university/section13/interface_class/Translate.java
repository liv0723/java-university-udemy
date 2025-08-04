package udemy.university.section13.interface_class;

public interface Translate {

    void translate();

    default void initializeTranslate() {
        System.out.println("Initializing Translate .....");
    }

}

class English implements Translate{

    @Override
    public void translate() {
        System.out.println("Translate to English");
    }

}

class Francois implements Translate {

    @Override
    public void translate() {
        System.out.println("Translate to Francois");
    }

    @Override
    public void initializeTranslate() {
        System.out.println("Initializing from Francois ....");
    }
}

class Test {

    public static void main(String[] args) {

        Translate english = new English();
        english.initializeTranslate();
        english.translate();

        System.out.println();

        Translate francois = new Francois();
        francois.initializeTranslate();
        francois.translate();

    }

}
