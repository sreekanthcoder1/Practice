public class TwoPointerApproach {
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(palindromeString(str));
    }
    static int palindromeString(String str){
        int len = str.length();

        for (int i =0;i<len/2;i++){
            if (str.charAt(i) != str.charAt(len-i-1)){
                return  0;
            }
        }
        return 1;

    }
}
