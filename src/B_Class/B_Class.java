package B_Class;

public class B_Class {

    void run() {
        System.out.println("method running");
    }

    public static void main(String[] args) {
        B_Class b1 = new B_Class();
        b1.run();
        Vehicle v = new Vehicle();
        v.VehicleRun();
    }
}

