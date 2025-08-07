package udemy.university.section9;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ArraysJava {

    public static void main(String [] args) {
        //numbers();
        //showCountry();
        //average();

    }

    public static void numbers() {
        int[] numbers = new int[5];
        var names = new String[] {"", "", "", "",""};

        int cont = numbers.length - 1;

        fullArrays(numbers, names);
        while (cont >= 0) {
            System.out.print( numbers[cont] + "-" +names[cont--] + " " );
        }

    }

    public static void fullArrays(int [] numbers, String [] names) {
        var random = new Random();
        for (int i = 0; i < numbers.length; i ++) {
            numbers[i] = i;
            names[i] = String.valueOf( random.nextInt());
        }
    }

    public static void showCountry() {
        var random = new Random();
        var scanner = new Scanner(System.in);
        var countries = new String[random.nextInt(1, 8)];
        var cont = 0;

        while (cont <= countries.length-1) {
            System.out.print("Intro the first country: ");
            countries[cont++] = scanner.nextLine();
        }

        for (int i = 0; i < countries.length; i ++ ) {
            System.out.println(countries[i]);
        }

    }

    public static void average() {
        var random = new Random();
        var scanner = new Scanner(System.in);
        var notes = new double[random.nextInt(1, 5)];
        var cont = 0;
        double average = 0;

        for (int i = 0; i < notes.length; i ++) {
            System.out.print("Intro the notes: ");
            var note = Double.parseDouble(scanner.nextLine());
            if (note >= 0) {
                notes[i] = note;
            }
        }
        while (cont <= notes.length- 1) {
            average += notes[cont++];
        }
        System.out.println("The note is %.1f".formatted((average / notes.length)));
    }


}

