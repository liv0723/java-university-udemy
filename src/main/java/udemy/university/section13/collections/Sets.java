package udemy.university.section13.collections;

import java.sql.Array;
import java.util.*;

public class Sets {

    public static void main(String[] args) {
        printNamesSet();

    }

    public static void printNamesSet() {
        Set<String > names = new TreeSet<>();
        names.add("Juana");
        names.add("Maria");
        names.add("Juana");

        names.forEach(System.out::println);
        System.out.println(names.size());
        names.remove("Juana");
        System.out.println(names.size());

        List<Integer> aux = new ArrayList<>();


    }
}
