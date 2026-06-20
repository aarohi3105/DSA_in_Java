public class PrefixProduct {
    public static void main(String[] args){
        int[] arr={3,1,5,2,4};
        int n=arr.length;
        int [] prefix = new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]*arr[i];
        }
        for(int num:prefix){
            System.out.print(num+" ");
        }
    }
}
