package J_Collections;

import java.util.ArrayList;

public class ArrayList_j {
    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("apples");
        fruits.add("banana");
        fruits.add("strawberry");
        System.out.println(fruits);
        System.out.println(fruits.get(0));
        System.out.println(fruits.get(1));
    }
}
