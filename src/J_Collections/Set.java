package J_Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {

    public static void main(String[] args) {
        //hashing (Ds)-Random insertion
//        HashSet<String> fruits = new HashSet<>();
//        fruits.add("apples");
//        fruits.add("banana");
//        fruits.add("strawberry");
//        fruits.add("apples");
//        System.out.println(fruits);

        //hashing (Ds)--insertion order
        LinkedHashSet<String> fruits = new LinkedHashSet<>();
        fruits.add("apples");
        fruits.add("banana");
        fruits.add("strawberry");
        fruits.add("apples");
        System.out.println(fruits);

        //Binary search tree(Ds)--sorted order
//        TreeSet<Integer> integers = new TreeSet<>();
//        integers.add(1);
//        integers.add(29);
//        integers.add(4);
//        integers.add(19);
//        System.out.println(integers);


    }


}
