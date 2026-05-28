//brute force
        public class UnionofTwoArrays {

    public static void union(int [] num1,int[]num2) {
        int[] num3 = new int[num1.length + num2.length];
        int pos = 0;
        for (int i = 0; i < num1.length; i++) {
            num3[i] = num1[i];
            pos++;
        }
        for (int i = 0; i < num2.length; i++) {
            boolean is_duplicate = false;
            for (int j = 0; j < num1.length; j++) {
                if (num2[i] == num1[j]) {
                    is_duplicate = true;
                    break;
                }
            }
            if (!is_duplicate) {
                num3[pos] = num2[i];
                pos++;
            }
        }
        for (int i = 0; i < num3.length; i++) {
            System.out.print(num3[i]+" ");
        }
    }
    public static void main(String[] args) {
        int [] num1={10,20,30,40,50};
        int []num2 ={30,40,50,60};
        union(num1,num2);
    }
}
