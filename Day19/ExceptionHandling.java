/*
Create a class MyCalculator which consists of a single method long power(int, int).
This method takes two integers,n and p, as parameters and finds n^p. 
If either n or p is negative, then the method must throw an exception which says "n or p should not be negative". 
Also, if both n and p are zero, then the method must throw an exception which says "n and p should not be zero."


Sample Input :

3 5
2 4
0 0
-1 -2
-1 3
Sample Output :

243
16
java.lang.Exception: n and p should not be zero.
java.lang.Exception: n or p should not be negative.
java.lang.Exception: n or p should not be negative.
*/



import java.util.Scanner;
class MyCalculator {
   
  public static String power (int n, int p) {
     try {
        if (n == 0 && p == 0) {
        throw new Exception ("java.lang.Exception: n and p should not be zero.");
        } else if (n < 0 || p < 0) {
            throw new Exception ("java.lang.Exception: n or p should not be negative.");
        } else {
            return ""+(long)Math.pow(n,p); 
        }
     } catch(Exception e) {
         return e.getMessage();
     }
   
   }
    
}

public class Solution {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
