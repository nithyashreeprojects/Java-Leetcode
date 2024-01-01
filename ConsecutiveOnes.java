import java.util.Scanner;

public class ConsecutiveOnes {
    static boolean isConsecutive(int n){
        if((n & n<<1)!= 0){
            return true;
        }
        else{
            return false;
        }
    }

    static int countOnes(int n){
        int count = 0;
        while (n>0){
            n = (n & (n<<1));
            count++;
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countOnes(n));
    }
    
}
