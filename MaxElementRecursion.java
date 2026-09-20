
public class MaxElementRecursion {
//    static int max=Integer.MIN_VALUE;
//
//    public static int maxElement(int[] arr,int index){
//        //base condition
//        if(index==arr.length){
//            return max;
//        }                                                  NOT A RIGHT METHOD
//        if(arr[index]>max){
//            max=arr[index];
//        }
//      return maxElement(arr,index+1);
//    }

    public static void maxElement(int[] arr,int index,int max){
        if(index>=arr.length){
            System.out.println(max);
            return;
        }
        //procedure
        if(arr[index]>max){
            max=arr[index];
        }
        //recursive call
        maxElement(arr,index+1,max);
    }

    public static void minElement(int[] arr,int index,int min){
        if(index>=arr.length){
            System.out.println(min);
            return;
        }
        //procedure
        if(arr[index]<min){
            min=arr[index];
        }
        //recursive call
        minElement(arr,index+1,min);
    }
    public static void main(String[] args){
        int[] arr= {10,20,30,70,50};
        int max=Integer.MIN_VALUE;
        maxElement(arr,0,max);
        int min=Integer.MAX_VALUE;
        minElement(arr,0,min);
    }
}
