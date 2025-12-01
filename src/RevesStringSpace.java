public class RevesStringSpace {
    public static void main(String[] args) {
        String str =  "the sky is blue";
        System.out.println(findReverse(str));

    }
    static String findReverse(String str){
        String[] words = str.trim().split("\\s+");
        int left =0;
        int right = words.length-1;
        while (left<right){
            String temp =words[left];
            words[left]=words[right];
            words[right]=temp;
            left++;
            right--;
        }
        return  String.join(" ",words);
    }

}
