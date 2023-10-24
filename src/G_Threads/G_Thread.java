package G_Threads;

public class G_Thread extends Thread {


    @Override
    public void run() {
        System.out.println("Running");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        for (int i = 10; i <20
                ; i++) {
            System.out.println(i);
        }
    }


    public static void main(String[] args) {
        G_Thread g1=new G_Thread();
        g1.run();


    }
}
