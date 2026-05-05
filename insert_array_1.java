public class insert_array_1 {
    public static void insert(int pos,int number,int[] arr){
       int n=arr.length;
       for(int i=n-1; i>pos;i--){
           arr[i]=arr[i-1];
       }
       arr[pos] = number;

       for(int i=0;i<n;i++){
           System.out.println(arr[i]);
       }
    }
    public static void main(String args[]){
        int [] arr={10, 20, 30, 40, 50};
        insert(2,111,arr);
    }
}
