package Day_3;

import java.util.ArrayList;
import java.util.List;

public class p2 {
    public static void main(String[] args) {
       ArrayList<String> al = new ArrayList<>(List.of("Alice", "Bob", "Charlie", "Eve", "Zack", "Ian", "Dave"));
        List<String> list = al.stream().filter(x -> x.length() > 4)
                .map(x -> x.toUpperCase())
                .sorted((a, b) -> a.compareToIgnoreCase(b))
                .toList();
        System.out.println(list);
    }
}
