class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = nums[nums.length-k+i];
        }
        for (int i = 0; i < k; i++) {
            rotate(nums, i, k);
            nums[i] = temp[i];
        }
    }

    public void rotate(int[] nums, int cur, int k) {

        if (cur < nums.length) {
            int currentNum = nums[cur];
            rotate(nums, cur + k, k);
            int target = cur + k;
            if (cur + k < nums.length)
                nums[cur + k] = currentNum;
            
        }

    }
}