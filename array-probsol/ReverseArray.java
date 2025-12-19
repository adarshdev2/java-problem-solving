import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements one by one:");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.print("The reverse of the array: ");
        for (int rev : arr) {
            System.out.print(rev + " ");
        }
    }
}
