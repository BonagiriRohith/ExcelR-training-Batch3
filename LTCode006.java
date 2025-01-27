import java.util.Arrays;
class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index++;
            }
        }
        for(int i = index; i < nums.length; i++){
            nums[i] = 0;
        }
        return index;
    }
}
class LTCode006 {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,4,4,5,5,5,6,7,7};
        Solution sol = new Solution();
        int result = sol.removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(result+" is the length of the array after removing duplicates.");
    }
}