class FindPlaindrome{
 public static int  StringPalindrome(String s) {
     int left = 0;
     int right = s.length() - 1;

     while (left < right) {
         if (s.charAt(left) != s.charAt(right)) {
             return 0;
         }
         left++;
         right--;
     }
     return 1;
 }

        public static void main(String[] args) {
            FindPlaindrome solution = new FindPlaindrome();
            String s = "A man, a plan, a canal: Panama";
          //  boolean str = solution.StringPalindrome(s);
            int ans = StringPalindrome(s);
            System.out.println(ans);
        }
    }