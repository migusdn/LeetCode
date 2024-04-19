import java.util.*;
class Solution {
    public int removeElement(int[] nums, int val) {
        int cnt = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==val){
                cnt++;
                nums[i] = -1;
            }
        }
        System.out.println(cnt);
        Arrays.sort(nums);
        for(int i=0; i<nums.length-cnt; i++){
            nums[i] = nums[i+cnt];
        }

        return nums.length-cnt;
    }
}