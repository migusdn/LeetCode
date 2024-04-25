import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int start = 0;
        int max = 0;
        int majorElem = -1;
        int i = 0;
        while (i < nums.length) {
            start = i;
            i++;
            while (i < nums.length && nums[i - 1] == nums[i])
                i++;
            int diff = i - start;
            if (diff > max) {
                max = diff;
                majorElem = nums[start];
            }
        }
        return majorElem;
    }
}