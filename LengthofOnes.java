import java.util.Scanner;

public class LengthofOnes {
    static boolean isConsecutive(int n){
        if((n&(n<<1)) != 0){
            return true;
        }
        else{
            return false;
        }
    }

    static int countConsecutive(int n){
        int count = 0;

        while(n>0){ //the moment it becomes zero it stops
            n = (n & (n<<1));
            count++; 
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //System.out.println(isConsecutive(n));
        System.out.println(countConsecutive(n));
    }
}
