
public class ReverseString {
   // public static void main(String[] args) {
   /*     String s = "hel";
        System.out.println(reverseString(s));
    }

    static String reverseString(String s) {
        int left = 0;
        int right = s.length() - 1;
        StringBuilder stringBuilder = new StringBuilder(s);

        while (left < right) {
            char temp = s.charAt(left);
            stringBuilder.setCharAt(left, stringBuilder.charAt(right));
            stringBuilder.setCharAt(right, temp);
            left++;
            right--;
        }
        return stringBuilder.toString();
    }
}*/
      //  class Solution {
            public String reverseWords(String s) {
                StringBuilder stringbuilder = new StringBuilder(s);
                int left=0;
                int right = s.length()-1;
                while(left<right){
                    char temp = s.charAt(left);
                    stringbuilder.setCharAt(left,stringbuilder.charAt(right));
                    stringbuilder.setCharAt(right,temp);
                    left++;
                    right--;
                }
                return stringbuilder.toString();

            }
            public static void main(String[]args){
                String s = "the sky is blue";
                ReverseString solution = new ReverseString();
                String ans = solution.reverseWords(s);
                System.out.println(ans);
            }
        }