package Tasks;

//Program to remove vowels from String
public class Remove_Vowles {

    public static void main(String[] args) {
        removeVowels();
    }

    public static void removeVowels(){
        String s="apple";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='a' || s.charAt(i)=='A' || s.charAt(i)=='e' ||s.charAt(i)=='E'||
                s.charAt(i)=='i' ||s.charAt(i) =='I' ||s.charAt(i)=='o' ||s.charAt(i)=='O'||
                s.charAt(i)=='u' || s.charAt(i)=='U'){
               s= s.replaceAll(""+s.charAt(i),"");
            }
        }
        System.out.println(s);
    }
}
