class Solution {
    public int removeDuplicates(int[] nums) {
        int arrIdx=0;
        int idx=0;
        while(idx<nums.length){
            int cursor = idx;
            int currentNum = nums[cursor];
            nums[arrIdx]=currentNum;
            arrIdx++;
            idx++;
            while(idx<nums.length&&nums[idx]==currentNum){
                if(idx-cursor==1){
                    nums[arrIdx] = currentNum;
                    arrIdx++;
                }
                idx++;
            }
        }
        return arrIdx;
        
    }
}