package D_Overriding;

//it is applicable to variables for data hiding in a single entity.0
public class Vehicle {
    private  int noOfWheels=4;
   void getColor(){
       System.out.println("parent-green");
   }
   void getWheels(){
       System.out.println("no of wheels are "+noOfWheels);
   }
}
