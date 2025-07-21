package udemy.university.section7;

import java.util.Scanner;

public class SeasonYear {
    private String month;

    public SeasonYear() {
        getMonth();
    }

    public void getMonth() {
        var scanner = new Scanner(System.in);
        System.out.print("Intro the month between (1/12): ");
        this.month = scanner.nextLine();
    }

    public String toString() {

        var season = (month.equals("1") || month.equals("2") || month.equals("12")) ? "Winter" :
                (month.equals("3") || month.equals("4") || month.equals("5"))? "Spring" :
                        (month.equals("6") || month.equals("7") || month.equals("8")) ? "Summer" : "Autumn";

        return """
                Season of year
                The season is: %s
                """.formatted(season);
    }

}
