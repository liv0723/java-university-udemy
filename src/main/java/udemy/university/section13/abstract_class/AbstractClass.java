package udemy.university.section13.abstract_class;

public class AbstractClass {

    public static void main(String[] args) {
        GeometricFigure geometricFigureRectangle = new Rectangle();
        GeometricFigure geometricFigureTriangle = new Triangle();

        geometricFigureRectangle.draw();
        geometricFigureRectangle.other();

        System.out.println();

        geometricFigureTriangle.draw();
        geometricFigureTriangle.other();

        System.out.println();
        Triangle triangle = new Triangle();
        triangle.draw();
        triangle.otherTriangle();
        triangle.other();


    }
}

abstract class GeometricFigure {

    abstract public void draw();

    public void other() {
        System.out.println("Method from the father class");
    }
}

class Rectangle extends GeometricFigure{

    @Override
    public void draw() {
        System.out.println("Is a rectangle");
    }

    public void otherRectangle() {
        System.out.println("Method from Rectangle Class");
    }
}

class Triangle extends GeometricFigure {

    @Override
    public void draw() {
        System.out.println("Is a Triangle");
    }

    public void otherTriangle() {
        System.out.println("Method from Triangle Class");
    }
}
