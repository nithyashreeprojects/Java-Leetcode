import java.util.Scanner;

public class D2B{
    static String decimalToBinary(int n){
        String b ="";
      while(n>=1){
        int x = n%2;
        n = n/2;
        b = x + b;
      }   //store the remainder as string
      //when n becomes 1 stop
      return b;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        String b = decimalToBinary(n);
        System.out.println(b);
    }
}