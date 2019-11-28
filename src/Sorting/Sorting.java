package Sorting;

import java.util.*;

public class Sorting {

    public static void main(String[] args) {

        List<String> numsList = new ArrayList<>();
        numsList.add("500");
        numsList.add("10");
        numsList.add("9");
        numsList.add("50");
        numsList.add("40");

        System.out.println(numsList);
        Collections.sort(numsList);
        // sort by first number, NOT by alphabetical
        System.out.println(numsList);
        System.out.println("-----");

        List<Integer> numbers = Arrays.asList(5, 4, 8, 10, 11, 7, 3);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);

        System.out.println("-----");

        List<Integer> numbers2 = Arrays.asList(5, 4, 8, 10, 11, 7, 3);
        System.out.println(numbers2);
        numbers2.sort(null);
        System.out.println(numbers2);

        System.out.println("-----");
        List<String> numsList2 = new ArrayList<>();
        numsList2.add("500");
        numsList2.add("10");
        numsList2.add("9");
        numsList2.add("50");
        numsList2.add("40");
        System.out.println(numsList2);
        numsList2.sort(Comparator.naturalOrder());
        System.out.println(numsList2);
    }
}
