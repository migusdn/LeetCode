class Solution {
    public int removeDuplicates(int[] nums) {
        int cursor=0;
        int lastCursor=0;
        while(cursor<nums.length){
            if(nums[cursor]==nums[lastCursor]){
                cursor++;
            }else{
                nums[++lastCursor]=nums[cursor];
                cursor++;
            }
        }
        if(nums[lastCursor]==nums[cursor-1]){
            lastCursor++;
        }
        return lastCursor;
    }
}