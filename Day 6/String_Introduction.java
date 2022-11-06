/*
This is a simple program on string introduction.

For the first line, sum the lengths of A and B.
For the second line, write Yes if A is lexicographically/alphabetically greater than B otherwise print No instead.
For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.
*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        System.out.println((A.compareTo(B) > 0) ? "Yes":"No");
        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1) + " " +         B.substring(0,1).toUpperCase() + B.substring(1) );      
            }
        }
