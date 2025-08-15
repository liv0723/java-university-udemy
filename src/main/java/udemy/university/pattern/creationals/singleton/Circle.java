package udemy.university.pattern.creationals.singleton;

public class Circle implements Figure{
    private double ladeA;
    private double ladeB;

    @Override
    public double area() {
        return this.getLadeA() * this.getLadeB();
    }

    @Override
    public double perimeter() {
        return  2 * (this.getLadeA() + this.getLadeB());
    }

    public double getLadeA() {
        return ladeA;
    }

    public void setLadeA(double ladeA) {
        this.ladeA = ladeA;
    }

    public double getLadeB() {
        return ladeB;
    }

    public void setLadeB(double adeB) {
        this.ladeB = adeB;
    }
}
