public class ProductOfArray {

    public static int  product(int[] arr , int n){
            //base condition
            if(n==-1){
                return 1;
            }
            //procedure+recursive call
            int ans=arr[n]*product(arr,n-1);
            return ans;
        }
        public static void main(String[] args) {
            int [] arr={1,2,3,4,5,6};
            System.out.print(product(arr,arr.length-1));

    }

}
