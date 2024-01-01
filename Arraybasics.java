import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println("Enter the marks for 5 students: ");

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
}
