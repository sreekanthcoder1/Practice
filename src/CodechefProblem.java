//https://www.codechef.com/practice/course/strings/STRINGS/problems/PALINDRCHECK
//  expected output : models AI amazing creates OpenAI
public class CodechefProblem {
    public static void main(String[] args) {
       String name ="OpenAI creates amazing AI models";
       char[]ch = name.toCharArray();
       int left =0;
        reverse(ch, 0, ch.length - 1);
        int start=0;
        for(int end =0;end< ch.length;end++){
            if((end== ch.length)||(ch[end]==' ')){
                reverse(ch, start, end - 1);
                start=end+1;
            }
            String result = new String(ch);
            System.out.println(result);
        }
    }
    static  void  reverse(char[]ch,int left,int right){
        char temp = ch[left];
        ch[left]=ch[right];
        ch[right]=temp;
        left++;
        right--;
    }
}
