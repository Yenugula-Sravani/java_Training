package E_Interface;

public class Fruits implements E_Fruit{


    public void sellFruit() {
        System.out.println("apples are only available here!!");
    }

    @Override
    public void FruitCount() {
        System.out.println("the number of fruits available in this shop are :" +fruitCount);
    }
}
