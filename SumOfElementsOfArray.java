public class SumOfElementsOfArray {

        public static int  sum(int[] arr , int n){
            //base condition
            if(n==-1){
                return 0;
            }
            //procedure+recursive call
            int ans=arr[n]+sum(arr,n-1);
            return ans;
        }
        public static void main(String[] args) {
            int [] arr={1,2,3,4,5,6};
            System.out.print(sum(arr,arr.length-1));
        }
    }

