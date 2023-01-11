/*
In this program Given an unsorted array A of size N that contains only non-negative integers,
find a continuous sub-array which adds to a given number S and return the left and right index(1-based indexing) of that subarray.

In case of multiple subarrays, return the subarray indexes which comes first on moving from left to right.

Note:- Both the indexes in the array should be according to 1-based indexing. You have to return an arraylist consisting of two elements left and right.
In case no such subarray exists return an array consisting of element -1.

Sample input:
Example 1:

Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements 
from 2nd position to 4th position 
is 12.

Example 2:

Input:
N = 10, S = 15
A[] = {1,2,3,4,5,6,7,8,9,10}
Output: 1 5
Explanation: The sum of elements 
from 1st position to 5th position
is 15.
*/



class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
       ArrayList <Integer> position = new ArrayList<Integer>();
       int sum = 0, start = 0, end = 0;
       for(int i = 0; i < n; i++) {
           sum += arr[i];
           end = i;
           
           while(sum > s) {
               sum -= arr[start];
               start++;
           }
           if(sum == s)  break;
       }
       if(sum != s || start > end) {
           position.add(-1);
           return position;
       } else {
           position.add(start+1);
           position.add(end+1);
           return position;
       }
    }
}
