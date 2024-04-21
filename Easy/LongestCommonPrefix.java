/*Write a function to find the longest common prefix string amongst an array of strings.

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
strs[i] consists of only lowercase English letters. */

import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {    
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        String prefix = "";
        for(int i=-0;i<first.length();i++){
            if(!first.substring(i,i+1).equals(last.substring(i,i+1))){
                return prefix;
            }
            prefix += first.substring(i,i+1);
        }
        return prefix;
    }
}