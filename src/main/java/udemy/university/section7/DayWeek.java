package udemy.university.section7;

import java.util.Random;
import java.util.Scanner;

public class DayWeek {
    private static int day;
    public DayWeek() {
        getData();
    }

    public void getData() {
        var scanner = new Scanner(System.in);
        System.out.print("Intro the day of week: ");
        DayWeek.day = Integer.parseInt(scanner.nextLine());
    }

    public String dayWeekClassic() {
        var msg = "";
        switch (DayWeek.day) {
            case 1:
                msg = "Monday";
                break;
            case 2:
                msg = "Martes";
                break;
            case 3:
                msg = "Miercoles";
                break;
            case 4:
                msg = "Jueves";
                break;
            case 5:
                msg = "Viernes";
                break;
            case 6:
                msg = "Sabado";
                break;
            case 7:
                msg = "Domingo";
                break;
            default:
                msg = "The day was bad";
        }

        return String.format("""
                The day of week using classic syntax is: %d - %s
                """, day, msg);
    }

    public String dayWeekBetter() {
        var scanner = new Scanner(System.in);

        System.out.print("Intro the number of day: ");
        DayWeek.day = Integer.parseInt(scanner.nextLine());

        var msg = "";
        msg = switch (DayWeek.day) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "miercoles";
            case 4 -> "Jueves";
            case 5 -> "viernes";
            case 6 -> "sabado";
            case 7 -> "domingo";
            default -> "The day was incorrect";
        };

        return """
                the day of week using modern syntax: %d - %s
                """.formatted(day, msg);
    }




}
