package Day_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class p2 {
    public static void main(String[] args) {
        int []arr = {1,2,3,5,6};
        System.out.println(mn(arr));
    }

    static int mn(int arr[]){
        ArrayList<int[]> al = new ArrayList<>(Arrays.asList(arr));
        al.stream().sorted().map(i-> i )
        return 0;
    }

}
