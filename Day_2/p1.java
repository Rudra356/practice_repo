package Day_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p1 {

    public static void main(String[] args) {
        String  str = "India is ann ni";
        ArrayList<String> al  = new ArrayList<>(List.of(str.split(" ")));
        long a = al.stream().filter(x ->
                x.toLowerCase().startsWith("a")||x.toLowerCase().startsWith("e")||
                        x.toLowerCase().startsWith("i")||x.toLowerCase().toLowerCase().startsWith("o")||
                        x.toLowerCase().startsWith("u")).count();
        System.out.println(a);

        long b = al.stream().filter(x->{
            String wp = x.toLowerCase();
            return !(wp.endsWith("a")||wp.endsWith("e")||wp.endsWith("i")||wp.endsWith("o")||wp.endsWith("u"));
        }).count();
        System.out.println(b);
    }

}
