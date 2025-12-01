public class ReveseStringValues {
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        System.out.println(findStringvalues(s, k));

    }

    static String findStringvalues(String s, int k) {
        char[] first = s.toCharArray();
        int len = first.length;
        for (int i = 0; i < len; i += 2 * k) {
            int left = i;
            int right = Math.min(i + k - 1, len - 1);
            while (left < right) {
                char temp = first[left];
                first[left] = first[right];
                first[right] = temp;
                left++;
                right--;
            }
        }
        return new String(first);
    }
}
