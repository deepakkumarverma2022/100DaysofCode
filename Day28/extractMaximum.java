/*
In this question you will be given a alphanumeric string S, from which you have to extract maximum numeric value from S.

Example 1:

Input:
S = 100klh564abc365bg
Output: 564
Explanation: Maximum numeric value 
among 100, 564 and 365 is 564.

Example 2:

Input:
S = abcdefg
Output: -1
Explanation: Return -1 if no numeric 
value is present. 
*/



//User function Template for Java

class Solution 
{ 
    static int extractMaximum(String S) 
    { 
        // code here
        int n = S.length();
        int num = 0;
        int maxNum = Integer.MIN_VALUE;
        boolean flag = false;
        for(int i = 0; i < n; i++) {
            if(S.charAt(i) >= '0' && S.charAt(i) <= '9') {
                num = num * 10 + (S.charAt(i) - '0');
                flag = true;
            }
            else
            {
                maxNum = Math.max(maxNum,num);
                num = 0;
            }
        }
         maxNum = Math.max(maxNum, num);
         if (flag == false) return -1;
         else
         {
             return maxNum;
         }
    }    
} 
