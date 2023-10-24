package D_Overriding;

public class D_overriding {
    public static void main(String[] args) {
//        Vehicle v =new Vehicle();
//        v.getColor();
//        v.getWheels();

// These are methods coming from child class but due to method overriding concept getColor method will print whatever is there in child method.
//        Car c=new Car();
//        c.getColor();
//        c.getWheels();

        //downcasting-downgrading parent class to child class.
        Vehicle v1=new Car();
        Car c3 =(Car) v1;
        c3.getColor();

        //upcasting -upgrading child class to parent class
        Vehicle v2=new Car();
        v2.getColor();



    }

}
