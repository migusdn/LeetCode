import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        String subStr="";
        int maxLen = 0;
        for(int i=0; i<s.length(); i++){
            if(subStr.indexOf(s.charAt(i))!=-1){
                subStr = subStr.substring(subStr.indexOf(s.charAt(i))+1);
            }
            subStr+=s.charAt(i);
            maxLen = Math.max(maxLen, subStr.length());
        }
        return maxLen;
    }
}