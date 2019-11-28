package Equality;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Equality {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("one");
        list1.add("two");
        list1.add("three");
        list1.add("four");
        list1.add("five");

        List<String> list2 = new ArrayList<>();
        list2.add("one");
        list2.add("two");
        list2.add("three");
        list2.add("four");
        list2.add("five");


        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list1.equals(list2));
        System.out.println(list1==list2);

        String[] array1 = {"one", "two", "three", "four"};
        String[] array2 = {"one", "two", "three", "four"};

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(array1.equals(array2));
        System.out.println(array1 == array2);
        System.out.println(Arrays.equals(array1, array2));
    }
}
