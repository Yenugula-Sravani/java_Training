package J_Collections;

import java.util.LinkedList;

public class J_LinkedList {

    public static void main(String[] args) {
        LinkedList<CukooHotel> c1=new LinkedList<>();
        CukooHotel c2=new CukooHotel();
        c2.setTiffin("dosa");
        c2.setPrice(200);
        c1.add(c2);
        System.out.println(c1.get(0).getTiffin());


    }


}
