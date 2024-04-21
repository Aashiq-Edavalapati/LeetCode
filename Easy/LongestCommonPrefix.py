'''Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".
 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"


Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.'''

from typing import List


class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        s, l = "", len(min(strs,key = len))
        strs.sort()
        for i in range(l):
            if strs[0][i] == strs[len(strs)-1][i]:
                s += strs[0][i]
            else:
                break
        return s