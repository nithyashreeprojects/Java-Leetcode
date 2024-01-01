import java.util.Scanner;

public class CheckPrimeNum{
    static boolean checkPrime(int n){
        if(n==1){
            return false;
        }
        if(n==2 || n==3){
            return true;
        }
        if(n%2==0 || n%3==0){
            return false;
        }
// since 1,2,3 is covered and 4 is a factor of 2 we start from 5
        for(int i=5;i<=Math.sqrt(n);i=i+6){
            if (n%i == 0 || n%(i+2) == 0) {
                return false;
                }
        }
        return true;
    } 

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(checkPrime(n));
    }
}