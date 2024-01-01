public class BitMasking{
    public static void main(String[] args){
        int n=36;
        int iPos=3;
        int i=5;

        int onMask=1<<iPos;
        int offMask= ~(1<<i); 
        //left shift will be done to the 3rd position

        System.out.println(n & onMask);
        System.out.println(n & offMask);
    }
}
