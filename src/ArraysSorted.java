import java.util.ArrayList;

public class ArraysSorted {
    public boolean isSorted(int []nums) {
        int values = nums.length - 1;
        for (int i = 1; i < values; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

        public static void main (String[]args){
            int[] nums = {1, 2, 1, 4, 5};
            ArraysSorted solution = new ArraysSorted();
            boolean ans = solution.isSorted(nums);
            System.out.println(ans);
        }
    }

