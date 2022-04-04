package lap;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Invoice> order = new ArrayList<Invoice>();
        order.add(new Invoice("botatoo","this is potato",22.5,10));
        order.add(new Invoice("egg","this is egg",12.5,1));
        order.add(new Invoice("tomato","this is tomato",2,10));
        order.add(new Invoice("balah","this is balah",50,5));
        for (Invoice item : order) {
            System.out.println(item.rebort());
            System.out.println("total price:"+item.getTotalPrice() );
            System.out.println("-------------");
        }


    }
}
