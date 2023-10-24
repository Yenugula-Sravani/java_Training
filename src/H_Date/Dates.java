package H_Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates {
    public static void main(String[] args) {
        Date d1= new Date();

        SimpleDateFormat s1=new SimpleDateFormat("E yyyy.MM.dd");
        System.out.println(s1.format(d1));
    }
}
