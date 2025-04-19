package Day_3;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class p1 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        integers.removeIf(x->x%2==0);
        System.out.println(integers);
    }
}
