package Day_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class p3 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(List.of("Learning", "Java", "with", "Rudra", "is", "absolutely", "fun"));
        Collections.reverse(words);
//        words.sort(null);
        System.out.println(words);
    }
}
