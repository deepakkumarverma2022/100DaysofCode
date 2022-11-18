/*
Given a string,s, and an integer,k, complete the function so that it finds the lexicographically smallest and largest substrings of length k.

Sample Input :

welcometojava
3

Sample Output :

ava
wel

Explanation :

String s = "welcometojava" has the following lexicographically-ordered substrings of length k=3:
["ava", "com", "elc", "eto", "jav", "lco", "met", "oja",
We then return the first (lexicographically smallest) substring and the last (lexicographically largest) substring as two newline-separated values (i.e., ava\nwel).

The stub code in the editor then prints ava as our first line of output and wel as our second line of output.
*/


import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
         smallest = s.substring(0, k);
        for (int i = 1; i+k-1 < s.length(); i++) {
            if (s.substring(i, i+k).compareTo(smallest) < 0) 
                smallest = s.substring(i, i+k);
        }
        
        largest = s.substring(0, k);
        for (int i = 1; i+k-1 < s.length(); i++) {
            if (s.substring(i, i+k).compareTo(largest) > 0) 
                largest = s.substring(i, i+k);
        }
       
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
