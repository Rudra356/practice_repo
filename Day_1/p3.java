package Day_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class p3 {
    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(7);
        ls.add(51);
        List<Integer> list = ls.stream().filter(x -> x % 2 == 0).map(x -> x * x).sorted((a,b)->b-a).toList();
        System.out.println(list);
        List<Integer> list1 = ls.stream().filter(x -> x % 2 != 0).max((a, b) -> a - b).stream().toList();
        System.out.println(list1);
        List<Integer> list2 = Collections.singletonList(ls.stream().filter(x -> x % 2 != 0).map(x->x*x).reduce(0, (a, b) -> a + b));
        List<Integer> list3 = Collections.singletonList(ls.stream().filter(x -> x % 2 != 0).reduce(1, (a, b) -> a * b));
        List<Boolean> list4 = ls.stream().map(x->x>5).toList();
        System.out.println(list4);
    }
}
