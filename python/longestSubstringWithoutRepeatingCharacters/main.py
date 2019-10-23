class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        chars = list(s)
        if len(chars) == 1:
            return 1
        maxLength = 0
        begin = 0
        end = 1
        while end < len(chars):
            for x in range(begin,end):
                if chars[x] == chars[end]:
                    length = end - begin
                    if length > maxLength:
                        maxLength = length
                    begin = x + 1
                    break
            end = end + 1
        return maxLength

print(Solution().lengthOfLongestSubstring("pwwkew"))
