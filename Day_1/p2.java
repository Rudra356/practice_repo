package Day_1;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class p2 {
    public static void main(String[] args) {
        String str = "aello borld crom Rudra";
        System.out.println(str);
        ArrayList<String> al = new ArrayList<>();
        al.addAll(List.of(str.split(" ")));
        al.sort((b,a)->a.compareToIgnoreCase(b));
        System.out.println(al);
    }
}
