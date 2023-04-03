/* In this program You are given a class Solution with a main method.
Complete the given code so that it outputs the area of a parallelogram with breadth B and height H. You should read the variables from the standard input.

Input Format :
There are two lines of input. The first line contains B:the breadth of the parallelogram. 
The next line contains H:the height of the parallelogram.

Output Format
If both values are greater than zero, then the main method must output the area of the parallelogram.
Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.

Sample input 1 :
1
3
Sample output 1 :
3

Sample input 2 :
-1
2
Sample output 2 :
java.lang.Exception: Breadth and height must be positive
*/



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
static boolean flag;
static Scanner sc=new Scanner(System.in);
static int B=sc.nextInt();
static int H=sc.nextInt();
static{
    try{
        if(B<=0 || H<=0){
            flag=false;
        throw new Exception("Breadth and height must be positive");
        }
        else{
            flag=true;
        }
    }
    catch(Exception e){
        System.out.println(e);
    }
}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class
