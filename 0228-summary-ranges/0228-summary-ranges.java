import java.util.ArrayList;
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            int cnt=0;
            for(int j=i+1; j<nums.length; j++){
                if(nums[j]-nums[j-1]==1){
                    cnt++;
                }else {
                    break;
                }
            }
            if(cnt == 0){
                ans.add(String.valueOf(nums[i]));
            }else{
                ans.add(nums[i]+"->"+nums[i+cnt]);
            }
            // System.out.println(nums[i]+","+nums[i+cnt]);
            i+=cnt;
        }
        return ans;
    }
}