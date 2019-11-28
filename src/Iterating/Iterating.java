package Iterating;

import java.util.*;

public class Iterating {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("element at index " + i + " is " + numbers.get(i));
//            numbers.remove(2); // index out of bound
        }

        System.out.println("-----");

        for (Integer number : numbers
        ) {
            System.out.println("element at index " + numbers.indexOf(number) + " is " + number);
//            numbers.remove(2); // concurent modification exeption
        }

        System.out.println("-----");

        for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext(); ) {
            Integer number = iterator.next();
            System.out.println("element at index " + numbers.indexOf(number) + " is " + number);
            iterator.remove();
        }
        System.out.println(numbers);

        System.out.println("-----");

        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println(numbers);
        for (ListIterator<Integer> listIterator = numbers.listIterator(3); listIterator.hasPrevious();) {
            System.out.println(listIterator.previous());
            listIterator.remove();
        }
        System.out.println(numbers);
    }
}
