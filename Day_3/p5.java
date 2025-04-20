package Day_3;

import java.util.LinkedList;


public class p5 {
    public static void main(String[] args) {
        LinkedList<String> que = new LinkedList<>();
        que.addLast("a");
        que.addLast("b");
        que.addLast("c");
        que.removeFirst();
        que.removeFirst();
        System.out.println(que.getLast());
    }
}
