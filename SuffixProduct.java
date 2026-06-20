public class SuffixProduct {
    public static void main(String []args){
        int[] arr={3,1,5,2,4};
        int n=arr.length;
        int []suffix=new int[n];
        suffix[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            suffix[i]=suffix[i+1]*arr[i];
        }
        for(int num:suffix){
            System.out.print(num+" ");
        }
    }
}
