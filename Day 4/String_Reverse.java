/*
It is just a simple program of reversing a string.
I have taken a string as an input & reversed it & then checked whether the reversed string is equal to the string which i have taken as an input,
Then the input string is palindrome otherwise it is not.

Sample Input:
madam

Sample Output:
Palindrome String

Sample Input:
maDaM

Sample Output:
Palindrome String

Sample Input:
Java

Sample Output:
Not Palindrome
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=A.toLowerCase();
        String rev = "";
        for(int i = B.length()-1;i >= 0; i--) {
            rev += B.charAt(i);
        }
        if(B.equals(rev)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
