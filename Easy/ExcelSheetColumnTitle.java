/*Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

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

Input: columnNumber = 1
Output: "A"


Example 2:

Input: columnNumber = 28
Output: "AB"


Example 3:

Input: columnNumber = 701
Output: "ZY"
 

Constraints:

1 <= columnNumber <= 231 - 1 */

class Solution {
    public String convertToTitle(int columnNumber) {
        String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if(columnNumber < 27){
            return alphabets.substring(columnNumber-1,columnNumber);
        }
        String column = "";
        while(columnNumber > 26){
            int temp = columnNumber%26;
            if(temp > 0){
                column = alphabets.charAt(temp-1)+column;
                columnNumber /= 26;   
            }
            else{
                column = "Z"+column;
                columnNumber /= 26;
                columnNumber--;
            }
        }
        return alphabets.charAt(columnNumber-1)+column;
    }
}