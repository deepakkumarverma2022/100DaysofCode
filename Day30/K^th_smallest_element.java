/*
In this program You are given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. 
It is given that all array elements are distinct.

Example 1:

Input:
N = 6
arr[] = 7 10 4 3 20 15
K = 3
Output : 7
Explanation :
3rd smallest element in the given 
array is 7.
Example 2:

Input:
N = 5
arr[] = 7 10 4 20 15
K = 4
Output : 15
Explanation :
4th smallest element in the given 
array is 15.

Your Task:
You don't have to read input or print anything. 
Your task is to complete the function kthSmallest() which takes the array arr[], integers l and r denoting the starting and ending index of the array
and an integer K as input and returns the Kth smallest element.
 */


// } Driver Code Ends

//User function Template for Java

class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        int n = arr.length;
        int w = 0;
        Arrays.sort(arr);
        for(int i=l; i <= r; i++) {
            if(i==k-1)
            {
               w = arr[i];
            }
        }
         return w;
    } 
}
