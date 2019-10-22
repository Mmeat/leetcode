package LongestSubstringWithoutRepeatingCharacters;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLongestSubstring("pwwkew"));
    }


}

class Solution {

    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        if(chars.length == 1){
            return 1;
        }
        int maxLength = 0;
        int begin = 0;
        int end = 1;
        while(end < chars.length){
            for(int i=begin;i<end;i++){
                if(chars[i] == chars[end]){
                    begin = i+1;
                    break;
                }
            }
            int length = end - begin + 1;
            if(maxLength < length){
                maxLength = length;
            }
            end++;
        }
        return maxLength;
    }
}