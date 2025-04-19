package Day_3;

import java.util.ArrayList;
import java.util.List;

public class p4 {
    public static void main(String[] args) {
        ArrayList<String> ls = new ArrayList<>(List.of("apple", "banana", "apple", "cherry", "banana"));
        List<String> list = ls.stream().distinct().toList();
        System.out.println(list);
    }
}
