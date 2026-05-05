public class array_insertion_2 {

        public static void insert(int pos,int number,int[] arr)
        {

            int n=arr.length;
            int [] arr1 = new int[n+1];
            int n1=arr1.length;
            for(int i=0; i<pos;i++){
                arr1[i]=arr[i];
            }
            arr1[pos] = number;
            for(int i=pos;i<n;i++){
                arr1[i+1]=arr[i];
            }
            for(int i=0;i<n1;i++){
                System.out.println(arr1[i]);
            }
        }
        public static void main(String args[]){
            int [] arr={10, 20, 30, 40, 50};
            insert(2,111,arr);
        }
    }


