// check if a bit is ON or OFF

// all bits on performing AND operation must come as 0
//if (n & mask == 0) print("OFF") 

public class BitMasking{
    public static void main(String[] args) {
        int n = 36;
        int i = 3;
        int[] bitMask = new int[32];

        for(i=0;i<32;i++){
            bitMask[i]=1<<i;
        }
        int onMask = bitMask[i];
        System.out.println(n & onMask);

        int offMask = ~(bitMask[i]);
        System.out.println(n & offMask);
    }
}