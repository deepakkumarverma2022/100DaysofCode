/*
In this question given an array A of n positive numbers. The task is to find the first Equilibrium Point in an array. 
Equilibrium Point in an array is a position such that the sum of elements before it is equal to the sum of elements after it.

Example 1:

Input: 
n = 5 
A[] = {1,3,5,2,2} 

Output: 3 

Explanation:  
equilibrium point is at position 3 
as elements before it (1+3) = 
elements after it (2+2). 
 

Example 2:

Input:
n = 1
A[] = {1}

Output: 1

Explanation:
Since its the only element hence
its the only equilibrium point.
 

Your Task:
The task is to complete the function equilibriumPoint() which takes the array and n as input parameters and returns the point of equilibrium.
Return -1 if no such point exists.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)
*/



class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
       if(n <= 1) {
           return 1;
       }
       long sum = 0;
       for(int i = 0; i < n; i++) {
           sum += arr[i];
       }
       
       long ls = 0;
       for(int i = 0; i < n; i++) {
           sum -= arr[i];
           if(sum == ls) {
               return i + 1;
           }
           ls = ls + arr[i];
       }
       return -1;
    }
}
