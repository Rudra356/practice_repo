package Day_3;

import java.util.ArrayList;
import java.util.LinkedList;

public class p7 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        //push
        a.addLast(1);
        a.addLast(2);
        a.addLast(3);
        a.addLast(4);

        //peak
        System.out.println(a.isEmpty());
        System.out.println(a.getLast());

        //pop
        System.out.println("Removing "+a.removeLast());

//        display
        System.out.println(a);

        LinkedList<Integer> b = new LinkedList<>();
        b.addLast(1);
        b.addLast(2);
        b.addLast(3);
        b.addLast(4);

        System.out.println(b.getFirst());

        b.removeFirst();
        b.removeFirst();

        System.out.println(b.getFirst());

        System.out.println(b);
    }
}
