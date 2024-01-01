public class BinarySearch{
    public static int searching(int[] arr, int key){
        int low = 0;
        int high = arr.length-1;
        int mid=0;

        while(low<=high){
            mid=(low+high)/2;
            if(key==arr[mid]){
                return mid;
            }
            else if(key<=arr[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1; //if index not found
    }
    public static void main(String[] args){
        int[] arr = {3,5,6,8,12,15,16,19,21};
        Arrays.sort(a); //if arrays are not sorted
        int key = 15;
        System.out.println(searching(arr,key));
    }
}


// mid finds the middle point. therefore the search becomes half.
//therefore, time complexity is O(log n).

// sorting will take O(n log n) 

//so, total time complexity will be O(nlogn + logn) 