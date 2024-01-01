public class AllocateBooks {
    static boolean isPossible(int[] arr, int b,int m){
        int students=1;
        int spc=0;

        for(int i=0;i<arr.length;i++){ //n
            if(arr[i]>m){
                return false;
            }
            if(spc+arr[i]<=m){
                spc=spc+arr[i];
            }
            else{
                students++;
                if(students>b){
                    return false;
                }
                spc = arr[i];
            }
        }
        return true;
    }
    static int maxPage(int[] arr, int b){
        if(b>arr.length){
            return -1;
        }
        int l=arr[0], h=0;
        for(int i=0;i<arr.length;i++){ //n
            if(arr[i]<l){
                l=arr[i];
            }
            h=h+arr[i];
        }
        int res = -1;
        while(l<=h){  //log(sum(a))
            int m=(l+h)/2;

            if(isPossible(arr,b,m)==true){
                res = m;
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return res;
    }

    public static void main(String[] args){
        int[] arr = {12,34,67,90};
        int b=2;
        System.out.println("The minimum number of max pages :");
        System.out.println(maxPage(arr,b));
    }
}

// Time complexity is n+log(sum(a))+n = O(n log(sum(a)))