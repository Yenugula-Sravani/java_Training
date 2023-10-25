package Tasks;

//Find whether the given string is a palindrome
 //ex:dad
public class Palindrome {
    public static void main(String[] args) {

        palindrome();
    }

    public static  void palindrome(){
        boolean flag=true;
        String s="Dad".toUpperCase();
        for (int i = 0; i < s.length()/2; i++) {
           if (s.charAt(i) != s.charAt(s.length()-1+i)){
               flag=false;
               break;
           }
        }
        if (flag){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }

    }
}
