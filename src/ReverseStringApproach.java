public class ReverseStringApproach {
    public static void main(String[] args) {
        String str = "hello sri";
        char[] ch = str.toCharArray();
        reverse(ch, 0, ch.length - 1);

        int start = 0;
        for (int end = 0; end <= ch.length; end++) {
            if (end == ch.length || ch[end] == ' ') {
                reverse(ch, start, end - 1);
                start = end + 1;
            }
        }
        //x  ReverseString reverseString = new ReverseString();
        String result = new String(ch);
        System.out.println(result);
    }

    static void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

    }
}
