/*
WAP to print the number of subarray of 'A' having negative sums.

An array's sum is negative if the total sum of its elements is negative.

Sample input : 
5
1 -2 4 -5 1

Sample Output :
9
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int count = 0;
       int a[] = new int[n];
       for(int i = 0; i < n; i++) {
           a[i] = sc.nextInt();
       }
       for(int j = 0; j < n; j++) {
          int sum = 0;
          for(int k = j; k < n; k++) {
              sum += a[k];
              if(sum < 0) {
                  count++;
              }
          } 
       }
       System.out.println(count);
    }
}
