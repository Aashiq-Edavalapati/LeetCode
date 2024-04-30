/* Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


 

Example 1:

Input: rowIndex = 3
Output: [1,3,3,1]


Example 2:

Input: rowIndex = 0
Output: [1]


Example 3:

Input: rowIndex = 1
Output: [1,1]
 

Constraints:

0 <= rowIndex <= 33 */

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        int[] prev = new int[rowIndex + 1];
        int[] res = new int[rowIndex + 1];
        prev[0] = 1; res[0] = 1;
        for(int i = 1, m; i <= rowIndex ; i++){
            m = i / 2 + 1;
            res[i] = 1;
            for(int j = 1; j < m; j++){
                res[j] = prev[j] + prev[j - 1];
                res[i - j] = res[j];
            }
            int[] temp = res;
            res = prev;
            prev = temp;
        }
        List<Integer> Res = new ArrayList<>();
        for(int r : prev) Res.add(r);
        return Res;
    }
    }