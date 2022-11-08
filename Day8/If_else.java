/*
This is a simple program of if else in which taken a ingteger value as input.
And been checked whether the given input is Weird or Not Weird.
if input number is even & lies in the range of 2 to 5 & also is greater than 20, then only number is Not Weird.
Otherwise if number is even & lies in the range of 6 to 20 & also it is odd number.
Then number is Weird.



Sample Input 0

3
Sample Output 0

Weird
Sample Input 1

24
Sample Output 1

Not Weird
*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N % 2 == 0) {
            if(N >= 2 && N <=5 || N > 20) {
                System.out.println("Not Weird");
            } 
            if(N >= 6 && N <= 20) {
                System.out.println("Weird");
            }
        } else {
            System.out.println("Weird");
        }
        scanner.close();
    }
}
