package Day_3;

import java.util.ArrayList;
import java.util.List;

public class p6 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>(List.of("madam", "racecar", "apple", "noon", "hello"));
        List<String> list =
                al.stream()
                        .filter(x -> new StringBuilder(x)
                                .reverse().toString()
                                        .equals(x)).toList();
        System.out.println(list);
    }
}
