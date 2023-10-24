package A_Object;

public  class A_Object {
    String firstName="sravani";
    //shift+fn+f6 -for Refactoring or rename
    //shift+alt=for multiple cursor selection
    //cntl+d=for copying the line
    public static void main(String[] args) {

        A_Object a1=new A_Object();
        //by writing the above line new memory is allocated for that object
        System.out.println(a1);
        System.out.println(a1.firstName);

        //new memory is allocated for below object even though it is same class
        A_Object a2=new A_Object();
        System.out.println(a2);
        System.out.println(a2.firstName);

    }
}
