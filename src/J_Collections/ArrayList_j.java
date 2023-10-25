package J_Collections;

import java.util.ArrayList;

public class ArrayList_j {
    public static void main(String[] args) {
//        ArrayList<String> fruits=new ArrayList<>();
//        fruits.add("apples");
//        fruits.add("banana");
//        fruits.add("strawberry");
//        System.out.println(fruits);
//        System.out.println(fruits.get(0));
//        System.out.println(fruits.get(1));
        ArrayList<Student> s1=new ArrayList<>();
        //adding the student object
        System.out.println("Adding the students Object in ArrayList");
        s1.add(new Student(1,"sravani"));
        s1.add(new Student(2,"santhosh"));
        System.out.println(s1.get(0).getName() +" "+s1.get(0).getRollNo());
        System.out.println(s1.get(1).getName() +" "+s1.get(1).getRollNo());


        //get method
        System.out.println("By using Get(index) Method ,we are using for getting the value from ArrayList");
        System.out.println(s1.get(0).getName());
//
        //updating method
        System.out.println("By using set(index,object name) ,we are updating the values in ArrayList");
        s1.set(1,new Student(1,"sravaniSanthosh"));
        System.out.println(s1.get(1).getName() +" "+s1.get(1).getRollNo());
//
//        //printing the Student details
        System.out.println("------Before Removing---------");
        for(Student s:s1){
            System.out.println(s.getName() + " " +s.getRollNo());
        }
        System.out.println("------After Removing---------");
        //Removing the values in Student arrayList
        s1.remove(1);
        for(Student s:s1){
            System.out.println(s.getName() + " " +s.getRollNo());
        }

    }
}
