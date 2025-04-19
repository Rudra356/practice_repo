package Day_2;

import java.util.ArrayList;
import java.util.List;

public class p3 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(List.of("alice", "Bob", "charlie", "David", "eva", "zack"));

        List<String> list = names.stream().filter(x -> Character.isUpperCase(x.charAt(0))).map(String::toUpperCase).sorted().toList();
        System.out.println(list);
    }
}
