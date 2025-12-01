public class UsingRecursionApproach {
    public static void main(String[] args) {
        String str = "abca";
        System.out.println(isPalindrome(str));
    }

    static int isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        return isPlaindromeUtils(str, right, left);
    }

    static int isPlaindromeUtils(String str, int left, int right) {
        if (left >= right) {
            return 1;
        }
        if (str.charAt(left) != str.charAt(right)) {
            return 0;
        }
        return isPlaindromeUtils(str, left + 1, right - 1);
    }
}
