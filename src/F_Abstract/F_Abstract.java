package F_Abstract;
//process of hiding the internal details of application
//we cannot create the object of abstract and interfaces..
abstract public class F_Abstract {

    //we should declare abstract keyword for the methods which are in abstract class.
    abstract void shopTypes();

    //we can also  create concrete methods.
    void shoeRate() {
        System.out.println("We have starting price ranging from 1000 to 10000");
    }
}
