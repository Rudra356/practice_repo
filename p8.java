import java.util.ArrayList;
import java.util.Scanner;

public class p8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> stack = new ArrayList<>();

        ArrayList<String> que = new ArrayList<>();

        for(int i= 0;i<4;i++){
            stack.addLast(sc.nextLine()); // n o o n
        }
        for(int i= 0;i<4;i++){
            que.addLast(sc.nextLine()); // n o o n
        }
        System.out.println(stack);
        System.out.println(que);

        while (!que.isEmpty()) {
            if (!que.removeFirst().equals(stack.removeLast())) {
                System.out.println("Not a palindrome string");
                return;
            }
        }
        System.out.println("Palindrome string");

    }
}
