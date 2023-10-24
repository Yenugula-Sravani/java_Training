package D_Overriding;

public class Car  extends Vehicle{

    void getColor(){
        System.out.println("child-Red");
    }
    void carName() throws  ClassCastException{
        System.out.println("car name is bmw");
    }

}
