public class ReverseWordsinString {
    public static String reverseWords(String s){
        char[] str= s.toCharArray();
        int left=0;
        for(int right=0;right<=str.length;right++){
            if(right==str.length || str[right]==' '){
                int l=left;
                int r=right-1;
                while(l<r){
                    char temp = str[l];
                    str[l]=str[r];
                    str[r]=temp;
                    l++;
                    r--;
                }
              left=right+1;
            }

        }
        return new String(str);
    }

    public static void main(String args[]){
        String s="she is a very good girl";
        String resultString =reverseWords(s);
        char[] str=resultString.toCharArray();
        for(int i=0;i<str.length;i++){
            System.out.print(str[i]);
        }

    }
}
