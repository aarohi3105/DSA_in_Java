public class BinarySearchRecursion {
    public static void  binarySearch(int low,int high,int target,int[]arr){
        if(low>high){

            return ;
        }
        int  mid=(low+high)/2;
        if(arr[mid]==target){
            System.out.print(mid);
            return;
        }
        if(arr[mid]>target){
            high=mid-1;
        }
        else{

            low=mid+1;
        }
        binarySearch(low,high,target,arr);


    }
    public static void main(String[] args) {
        int []arr={12,23,54,67,89,100};
        int n=arr.length-1;
        binarySearch(0,n,89,arr);
    }
}
