/*
In this question you are given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array.

Example 1:

Input:
N = 6
A[] = {3, 2, 1, 56, 10000, 167}
Output:
min = 1, max =  10000
 

Example 2:

Input:
N = 5
A[]  = {1, 345, 234, 21, 56789}
Output:
min = 1, max = 56789
*/



/User function Template for Java

/*
 class pair  
{  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} */

class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
        //Write your code here
        long min = Integer.MAX_VALUE;
        long max = Integer.MIN_VALUE;
             Arrays.sort(a);
           for(int i = 0; i < n; i++) {
              min = Math.min(min,a[i]);
              max = Math.max(max,a[i]); 
           }
           return (new pair(min,max));
    }
}
