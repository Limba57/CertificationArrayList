package MethodsPart1;

import java.util.ArrayList;
import java.util.List;

public class MethodsPartone {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("dog");
        list.add(5);
        System.out.println(list.get(1));
        System.out.println(list.get(1).getClass());

        System.out.println(list);
        System.out.println(list.toString());//idem

        List<String> pets = new ArrayList<>();
        pets.add("dog");
        System.out.println(pets);
        pets.add(0, "cat");
        System.out.println(pets);
//        pets.add(5);// compilation error
        // cat dog
        // 0   1
        pets.add(1, "parrot");
        // cat parrot dog
        // 0   1      2
        pets.add(0, "husky");
        // husky cat parrot dog
        // 0     1   2      3
        System.out.println(pets);
//        pets.add(5, "rabbit");// twrows exeption indexOutOfBound
        System.out.println(pets);
        pets.add(1, "bird");
        System.out.println(pets);

        // remove
        pets.remove("parrot");
        pets.remove("snake"); // no match --> no action
        System.out.println(pets);
        if (pets.remove("cat")) { // return a boolean
            System.out.println("no more cat");
            System.out.println(pets);
        }
        if (pets.remove("snake")) {
            System.out.println("snake is removed");
        } else {
            System.out.println("no snake in this List");
        }
        System.out.println(pets.remove(2)); // return string
        System.out.println(pets);

        pets.set(0, "new bird");
        System.out.println(pets);
        System.out.println(pets.set(0, "newer bird")); // return the deleted string
        System.out.println(pets);

        List<Integer> numbers = new ArrayList();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers);
        numbers.remove(1); // enleve à l'index 1
        numbers.remove((Integer) 1); // enleve la valeur 1

        System.out.println(numbers);


    }
}
