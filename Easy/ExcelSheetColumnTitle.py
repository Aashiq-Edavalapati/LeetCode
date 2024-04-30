'''Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

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

1 <= columnNumber <= 231 - 1'''

class Solution:
    def convertToTitle(self, columnNumber: int) -> str:
        alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        columnTitle = ""
        if columnNumber < 27:
            return alphabets[columnNumber-1]
        while columnNumber > 26:
            alpha = columnNumber%26
            if alpha > 0:
                columnTitle = alphabets[alpha-1]+columnTitle
                columnNumber //= 26
            else:
                columnTitle = 'Z'+columnTitle
                columnNumber //= 26
                columnNumber -= 1
        return alphabets[columnNumber-1]+columnTitle