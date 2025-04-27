package Day_4;

public class p1 {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6};
//        System.out.println();
        ra(arr);

    }

    static void  ra(int arr[]){
        int start = 0;
        int end = arr.length-1;
        int temp;
        while (start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
        for (int i :arr) {
            System.out.println(i);
        }
    }



}
