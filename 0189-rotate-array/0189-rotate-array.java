class Solution {
    public void rotate(int[] nums, int k) {
        if (k % (nums.length) == 0)
            return;
        int[] temp = new int[k];
        for (int i = 0; i < nums.length && i < k; i++) {
            rotate(nums, i, k, temp);
        }
        for (int i = 0; i < nums.length && i < k; i++) {
            nums[i] = temp[i];
        }
    }

    public void rotate(int[] nums, int cur, int k, int[] temp) {

        if (cur < nums.length) {
            int currentNum = nums[cur];
            rotate(nums, cur + k, k, temp);
            int target = cur + k;
            if (cur + k < nums.length)
                nums[cur + k] = currentNum;
            else
                temp[(cur + k) % nums.length] = currentNum;
        }

    }
}