package udemy.university.section13.collections;

import udemy.university.section4.SubString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists {


    public static void main(String[] args) {
        List days = new ArrayList<>();
        //genericsList(days);

        System.out.println();
        List<String> daysString = new ArrayList();
        //noGenericsList(daysString);

        System.out.println();
        List<Integer> numbers = new ArrayList<>();
        //listWithLambdaFunctions(numbers);

        System.out.println();
        System.out.println("Methods References");
        //methodsReference(days);

        anotherWayToCreateList();


    }

    public static void genericsList(List days) {
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
        days.add("Sunday");
        days.add(20);

        for (Object elements : days) {
            System.out.print(elements + " ");
        }

    }

    public static void noGenericsList(List<String> days) {
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
        days.add("Sunday");
        days.add("Sunday");
        //days.add(5);

        for (Object elements : days) {
            System.out.print(elements + " ");
        }
    }

    public static void listWithLambdaFunctions(List<Integer> numbers) {
        int numb1 = 1, numb2 = 2, numb3 = 3;
        numbers.add(numb1);
        numbers.add(numb2);
        numbers.add(numb3);

        numbers.forEach((element) -> {
            System.out.print(element + " ");
        });
    }

    public static void methodsReference(List days) {

        var aux = new ArrayList<Integer>();
        days.forEach(System.out::print);
    }

    public static void anotherWayToCreateList() {
        List<String> namelIst = Arrays.asList("Pedro", "Maria", "Juana");
        System.out.println("\n List with the class Arrays  ");
        namelIst.forEach(System.out::println);
    }

}
