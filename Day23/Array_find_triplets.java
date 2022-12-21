/*
WAP to check whether the given array arr[] of n integers contains a triplets that sums up to zero.

Example 1:

Input: n = 5, arr[] = {0, -1, 2, -3, 1}
Output: 1
Explanation: 0, -1 and 1 forms a triplet
with sum equal to 0.

Example 2:

Input: n = 3, arr[] = {1, 2, 3}
Output: 0
Explanation: No triplet with zero sum exists.
*/


import java.util.*;
class Triplets {
public static void main (String[]args) {
Scanner sc = new Scanner (System.in);
int t = sc.nextInt();
while(t-- > 0) {
   int n = sc.nextInt();
   int a[] = new int[n];
   for(int i = 0; i < n; i++) {
       a[i] = sc.nextInt();
       }
       Solution g = new Solution();
       if(g.findTriplets(a,n)) 
           System.out.println("1");
       else
           System.out.println("0");
       }
     }  
   }
      
//complete the function below.

class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        Arrays.sort(arr);
        for(int i = 0; i < n-2; i++) {
          if(twoSum(arr, -arr[i], i+1)) return true;  
        }
        return false;
    }
    public boolean twoSum(int a[], int x, int i) {
         int j = a.length-1;
        
        while(i < j) {
            
        if(a[i] + a[j] < x) {
            i++;
        } else if(a[i] + a[j] > x) {
            j--;
        } else {
            return true;
        }
    }
    return false;
}
}
