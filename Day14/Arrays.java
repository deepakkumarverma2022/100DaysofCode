/*
WAP to check whether the two arrays are equal or not.
Two arrays are said to be equal if both of them contain same set of elements, arrangements (or permutation) of elements may be different though.
Note : If there are repetitions, then counts of repeated elements must also be same for two array to be equal.
*/


import java.io.*;
import java.util.*;
class GFG {
  public static void main (String[]args) {
    Scanner sc = new Scanner (System.in);
    
    long t = sc.nextLong();
    while (t > 0) {
      int n = sc.nextInt();
      long arr[] = new long[n];
      long brr[] = new long[n];
      for(int i = 0; i < n; i++) {
        arr[i] = sc.nextLong();
      }
       for(int i = 0; i < n; i++) {
        brr[i] = sc.nextLong();
      }
      Solution ob = new Solution();
      System.out.println("ob.check(arr,brr,n) == true ? "1":"0");
      }
     }
   }
    class Solution {
      public static boolean check(long A[], long B[], int N) {
        Arrays.sort(A);
        Arrays.sort(B);
        return Arrays.equals(A,B);
      }
    }
