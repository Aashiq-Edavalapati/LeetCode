/* Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3


Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 

Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109 */

import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> count = new HashMap<Integer,Integer>();
        for(int i:nums){
            if(count.containsKey(i)){
                count.put(i,count.get(i)+1);
            }
            else{
                count.put(i,1);
            }
        }
        int max_count = 0;
        int ans = 0;
        for(int i:count.keySet()){
            int curr = count.get(i);
            if(curr>max_count){
                max_count = curr;
                ans = i;
            }
        }
        return ans;
    }
}