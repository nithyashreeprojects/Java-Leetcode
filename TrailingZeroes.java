import java.util.Scanner;

class TrailingZeroes{
   static int trailingZeroes(int n){
      int result =0;
      int pow = 5;
      while(n>=pow){ //if n =200, and pow=625, it becomes false
         result=result+(n/pow); 
         pow=pow*5;
      }
      return result;
   }

   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      System.out.println("The number of trailing zeroes ");
      System.out.println(trailingZeroes(n));
   }
}
