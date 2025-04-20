package Day_3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class p5 {
    public static void main(String[] args) {
        LinkedList<String> que = new LinkedList<>();
        que.addLast("a");
        que.addLast("b");
        que.addLast("c");
        que.removeFirst();
        que.removeFirst();
        System.out.println(que.getLast());

        ArrayList<Integer> al = new ArrayList<>(List.of(1,3,5));
        ArrayList<Integer> al2 = new ArrayList<>(List.of(2,4,6));
        ArrayList<Integer> al3 = new ArrayList<>();
        al3.addAll(al);
        al3.addAll(al2);
        al3.sort((a,b)->a-b);
        System.out.println(al3);
    }
}
