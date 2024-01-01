import java.util.Scanner;

public class Missingnum{
    public static int findMissingNum(int[] arr){
        int n=arr.length+1;
        int sum=0;
        int sumOfNnums = n*(n+1)/2;
        
        for(i=0;i<n;i++){
            sum = sum + arr[i];
        } 
        return total-sum ;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array : ");
        int n = sc.nextInt();
        int [] arr = new int[n]; //initialize size

        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int missingNumber = findMissingNum(arr);
        System.out.println("The missing number is "+missingNumber);

    }

}