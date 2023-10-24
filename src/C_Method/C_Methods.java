package C_Method;

public class C_Methods {

    String name = "sravani";

    public String PrintName(String name) {
        name = this.name;
        return "My name is " +name;
    }

    public static void main(String[] args) {
        C_Methods c = new C_Methods();
        System.out.println(c.PrintName(c.name));
        Method_overloading m1=new Method_overloading();
        m1.name();
        m1.name("sra");
        System.out.println(Method_overloading.returnType());
    }
}
