package Day_1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class p1  {

    public static void main(String[] args) {
        String str = "gui";
        StringBuilder s = new StringBuilder(str);
        s.reverse();
        System.out.println(s);

        String str2 = "CLI";
        char [] ca = str2.toCharArray();
        StringBuilder s1 = new StringBuilder() ;
        for (int i = ca.length-1;i>=0;i--){
            char c = ca[i];
            s1.append(c);
        }
        System.out.println(s1);
    }


}
