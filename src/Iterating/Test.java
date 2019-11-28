package Iterating;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

    public static void main(String[] args) {


        List<String> names = new ArrayList<>();
        names.add("limba");
        names.add("seb");
        names.add("kathia");
        names.add("arthur");

        System.out.println(names);

//        for (String name : names) {
//            System.out.println(name);
//            if (name.equals("limba")) {
//                names.remove(name);
//            }
//        }

//        for (int i = 0; i < names.size(); i++) {
//            System.out.println(names.get(i));
//            if (names.get(i).equals("limba")) {
//                names.remove(i);
//            }
//        }

        for (Iterator<String> iterator = names.iterator(); iterator.hasNext(); ) {
            String name = iterator.next();
            System.out.println(name);
            if (name.equals("limba")) {
                iterator.remove();
            }
        }

        System.out.println(names);

    }
}
