public class SearchElementRecursion {
    public static int searchElement(int []arr,int index,int target){
        //base condition
        if(index>=arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        int ans=searchElement(arr,index+1,target);
        return ans;
    }
    public static void main(String args[]){
        int [] arr={10,20,40,60,70};

        System.out.println(searchElement(arr,0,40));
    }
}
