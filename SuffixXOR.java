public class SuffixXOR {
    public static void main(String [] args){
        int [] arr= {1,4,5,2,3};
        int prefixXOR=0;
        for(int i=arr.length-1;i>=0;i--){
            prefixXOR=prefixXOR^arr[i];
            arr[i]=prefixXOR;
        }
        for(int no:arr){
            System.out.print(no +" ");
        }
    }
}
