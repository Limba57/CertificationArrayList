package ArrayListAndArrayConversion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListAndArrayConversion {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Tony");
        names.add("Jimmy");
        names.add("Anthony");

        Object[] namesArray = names.toArray();
        System.out.println(namesArray.length);
        // this will be a array of Object,

        String[] stringArray = names.toArray(new String[0]);
        String[] stringArray2 = names.toArray(new String[10]);
        // this methode automatically resize the new array to fit the ArrayList
        // if the new array is smaller than the arrayList
        // if new array is bigger it will be sized at the wanted parameter
        System.out.println("----");
        System.out.println(stringArray.length);
        System.out.println(stringArray2.length);

        String[] stringArray3 = names.toArray(new String[names.size()]);
        // best practice to match the two size
        System.out.println("----");
        System.out.println(stringArray3.length);

        String[] petsArray = {"dog", "cat", "parrot"};
        List<String> petsList = Arrays.asList(petsArray);
        //or
        List<String> petsList2 = Arrays.asList("dog", "cat", "parrot");
        // return a fixed size List
        System.out.println("----");
        System.out.println(petsList.size());
        System.out.println(petsList2.size());
        // size aree fixed, no more add

        System.out.println("----");
        System.out.println(Arrays.toString(petsArray));
        System.out.println(petsList);
        System.out.println(petsList2);
        System.out.println("----");

        petsList.set(0, "bird");
        System.out.println(Arrays.toString(petsArray));
        System.out.println(petsList);
        System.out.println(petsList2);
        System.out.println("----");

        petsList2.set(0, "snake");
        System.out.println(Arrays.toString(petsArray));
        System.out.println(petsList);
        System.out.println(petsList2);
        System.out.println("----");

        petsArray[0] = "husky";
        System.out.println(Arrays.toString(petsArray));
        System.out.println(petsList);
        System.out.println(petsList2);
        System.out.println("----");

//        petsList.add("newDog"); // unSupported method: List is fix in size
//        petsList.remove(1);  // unSupported method: List is fix in size
    }
}
