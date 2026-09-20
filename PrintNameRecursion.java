public class PrintNameRecursion {
    public static void print(int n){
        //base condition
        if(n==0){
            return;
        }

        //recursive call
        print(n-1);
        System.out.println(n+" . "+"Aarohi");



    }
    public static void main(String args[]){
        int n=10;
        print(n);
    }
}
