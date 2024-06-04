/*Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...
 

Example 1:
Input: columnTitle = "A"
Output: 1


Example 2:
Input: columnTitle = "AB"
Output: 28
Example 3:

Input: columnTitle = "ZY"
Output: 701
 

Constraints:

1 <= columnTitle.length <= 7
columnTitle consists only of uppercase English letters.
columnTitle is in the range ["A", "FXSHRXW"]. */




class Solution {
    public int titleToNumber(String columnTitle) {
        int columnNumber = 0;
        int length = columnTitle.length();
        // for(int i=0;i<length/2;i++) {
        //     columnTitle = columnTitle.substring(0,i)+columnTitle.charAt(length-i-1)+columnTitle.substring(i+1,length-i-1)+columnTitle.charAt(i)+columnTitle.substring(length-i,length);
        // }
        // int pos = 0;
        // for(char ch:columnTitle.toCharArray()) {
        //     columnNumber += (ch-'A'+1)*(Math.pow(26,pos));
        //     pos++;
        // }
        for(int i=0;i<length;i++) {
            columnNumber = columnNumber*26+columnTitle.charAt(i)-'A'+1;
        }
        return columnNumber;
    }
}