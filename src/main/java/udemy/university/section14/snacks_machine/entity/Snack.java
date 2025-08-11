package udemy.university.section14.snacks_machine.entity;

import java.io.Serializable;
import java.util.Objects;

public class Snack implements Serializable {

    public static int countSnack = 0;
    private int idSnack;
    private String nameSnack;
    private double priceSnack;


    public Snack() {
        this.idSnack = ++Snack.countSnack;
    }

    public Snack(String nameSnack, double priceSnack) {
        this();
        this.nameSnack = nameSnack;
        this.priceSnack = priceSnack;
    }

    public static int getCountSnack() {
        return countSnack;
    }

    public int getIdSnack() {
        return idSnack;
    }

    public String getNameSnack() {
        return nameSnack;
    }

    public void setNameSnack(String nameSnack) {
        this.nameSnack = nameSnack;
    }

    public double getPriceSnack() {
        return priceSnack;
    }

    public void setPriceSnack(double priceSnack) {
        this.priceSnack = priceSnack;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "idSnack=" + idSnack +
                ", nameSnack='" + nameSnack + '\'' +
                ", priceSnack=" + priceSnack +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Snack snack)) return false;
        return getIdSnack() == snack.getIdSnack() && Double.compare(getPriceSnack(), snack.getPriceSnack()) == 0 && Objects.equals(getNameSnack(), snack.getNameSnack());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdSnack(), getNameSnack(), getPriceSnack());
    }
}
