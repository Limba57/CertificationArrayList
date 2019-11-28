package Wrappers;

import java.util.ArrayList;
import java.util.List;

public class Wrappers {

    public static void main(String[] args) {

//        List<double> doubleList = new ArrayList<>(); // no compilation: double is not an object
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(10.5); // autoboxing
        doubleList.add(new Double(55.1));
        doubleList.remove(55.10); // autoboxing
        double first = doubleList.get(0); // unboxing

        System.out.println(doubleList);
        System.out.println(first);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(null);

        System.out.println(numbers);
//        int number = numbers.get(0);
//        System.out.println(number); // throws a null pointer exeption: primitive can't be null

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);

        nums.remove(1);
        System.out.println(nums);

        List<Integer> nums2 = new ArrayList<>();
        nums2.add(1);
        nums2.add(2);

//        nums2.remove((Integer) 1);
        nums2.remove(new Integer(1)); // idem
        System.out.println(nums2);

    }
}
