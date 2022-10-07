I simply have taken three integer input & printed it.
 Sample Input: 
42
100
125
Sample Output

42
100
125




import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

