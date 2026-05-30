public class AverageUsersinThreeDays {
    public static void AverageUsers(int [] nums ,int k){
        int sum=0;
       //sum of first three days
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
        }
        System.out.println(sum/k);

    //sum of next days
    for(int i=1;i<=nums.length-k;i++){

        sum=sum-nums[i-1]+nums[i+k-1];
        double avg=(double)sum/k;
        System.out.println(avg);
    }
}
public static void main(String args[]){
        int []nums={23,34,56,76,12,45,98};
        int k=3;
        AverageUsers(nums,k);

}
}
