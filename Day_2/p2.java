package Day_2;

import java.util.ArrayList;
import java.util.List;

public class p2 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(List.of(2, 5, 8, 11, 6, 9, 7, 12));
        List<Integer> list = al.stream().filter(x -> x % 2 != 0).map(x -> x * x).sorted((a,b)->b-a).toList();
        System.out.println(list);
    }
}
