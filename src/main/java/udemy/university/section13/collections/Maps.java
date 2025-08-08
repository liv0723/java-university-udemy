package udemy.university.section13.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {
        //createHashMap();
        createTreeMao();
        //likeSet();
    }

    public static void createHashMap() {
        Map<String, String> person = new HashMap<>();


        person.put("Name", "Diego");
        person.put("Name1", "Laura");
        person.put("Name2", "Juan");

        person.forEach((key, value) -> System.out.println(key + " " + value));

    }
    public static void createTreeMao() {
        Map<String, String> person1 = new TreeMap<>();

        person1.put("Name", "Diego1");
        person1.put("Name1", "Diego1");
        person1.put("Name2", "Juan1");

        person1.forEach((key, value) -> {
            System.out.print("Key: " + key + " " +"Value: " + value);
            System.out.println();
        });

    }

    public static void likeSet() {
        Map<Integer, Integer> numbers = new HashMap<>();
        numbers.put(1, 1);
        numbers.put(2, 2);
        numbers.put(3, 3);


        numbers.entrySet().forEach((value) -> System.out.println(value));
        System.out.println();
        numbers.put(2, 2);
        numbers.entrySet().forEach(System.out:: println);

        System.out.println();
        numbers.put(2, 4);
        numbers.entrySet().forEach(System.out:: println);


    }
}
