/*
In this program You are given n lines. In each line there are zero or more integers.
You need to answer a few queries where you need to tell the number located in y^th position of x^th line.
Take your input from System.in.

Input Format
The first line has an integer n.
In each of the next n lines there will be an integer d denoting number of integers on that line and then there will be d space-separated integers.
In the next line there will be an integer q denoting number of queries. Each query will consist of two integers x and y.

Output Format
In each line, output the number located in y^th position of x^th line. If there is no such position, just print "ERROR!"

Sample Input

5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5
Sample Output

74
52
37
ERROR!
ERROR!
*/



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> d[] = new ArrayList[n];
        for(int i = 0; i < n; i++) {
            int sizeOfTheLine = sc.nextInt();
            List<Integer> f = new ArrayList<>();
            f.add(sizeOfTheLine);
            for(int j = 0; j < sizeOfTheLine; j++) {
                f.add(sc.nextInt());
            }
            d[i] = f;
        }
        int q = sc.nextInt();
        for(int k = 0; k < q; k++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            try {
                System.out.println(d[x-1].get(y));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}
