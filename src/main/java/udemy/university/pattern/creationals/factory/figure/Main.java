package udemy.university.pattern.creationals.factory.figure;

public class Main {
    public static void main(String[] args) {
        Figure figure = FactoryFigure.factoryFigure("Square");
        System.out.println(figure.getClass());
    }
}

class FactoryFigure {
    public static Figure factoryFigure(String name) {
        Figure figure = switch (name) {
            case "Circle" -> new Circle();
            case "Square" -> new Square();
            default -> new Circle() {
            };
        };
        return figure;
    }

}
