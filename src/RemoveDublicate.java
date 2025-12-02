public class RemoveDublicate {
    public static void main(String[] args) {
        int nums[]={-2, 2, 4, 4, 4, 4, 5, 5};
        RemoveDublicate solution = new RemoveDublicate();
        int ans = solution.removeDuplicates(nums);
        System.out.println(ans);
    }
    public  int removeDuplicates(int[] nums) {
        int n  =  nums.length-1;
        int value = nums[0];
        for(int i =0;i<n;i++){
            if(nums[i]!=value){
                return nums[i];
            }

        }
        return -1;

    }
}
