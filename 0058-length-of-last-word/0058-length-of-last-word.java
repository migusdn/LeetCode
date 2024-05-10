class Solution {
    public int lengthOfLastWord(String s) {
        s.trim();
        String[] temp = s.split(" ");
        return temp[temp.length-1].length();
    }
}