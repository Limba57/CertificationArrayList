package UndersandingArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class UnderStandingArrayList {

    public static void main(String[] args) {

        ArrayList mylist = new ArrayList();
        ArrayList<Object> myList2 = new ArrayList<Object>();
        ArrayList<Object> myList3 = new ArrayList<>();
        // idem
        mylist.add("string");
        mylist.add(10);
        String[] stringList = {"one", "two"};
        mylist.add(stringList);
        System.out.println(mylist);


        ArrayList<String> list = new ArrayList<String>();
        List<String> list3 = new ArrayList<>(); // using interface as type

//        ArrayList<String> list4 = new List<>(); // no compilation
//        ArrayList<String> list5 = new List<String>(); // no compilation: List is abstract

        List<String> list5 = new ArrayList<>(20);
        list5.add("one");
        list5.add("three");
        System.out.println(list5);
        list5.add(1, "two");
        System.out.println(list5);

    }
}
