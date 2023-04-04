/*
In this question you must format and print the input to complete the solution.

Input Format

Every line of input will contain a String followed by an integer.
Each String will have a maximum of 10 alphabetic characters, and each integer will be in the inclusive range from 0 to 999.

Output Format

In each line of output there should be two columns:
The first column contains the String and is left justified using exactly 15 characters.
The second column contains the integer, expressed in exactly 3 digits; if the original input has less than three digits,
you must pad your output's leading digits with zeroes.

Sample Input

java 100
cpp 65
python 50
Sample Output

================================
java           100 
cpp            065 
python         050 
================================
*/



import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                String s2 = s1;

        String tmp = Integer.toString(x);
        for(int j = s1.length(); j <= 14; j++) {
            s2 += " ";
        }


        if(tmp.length() == 3) {
            System.out.println(s2 + tmp);
        }else if(tmp.length() == 2){
            System.out.println(s2 +"0"+ tmp);
        }else if(tmp.length()== 1){
            System.out.println(s2 + "0" + "0" + tmp);
        }
        }
        sc.close();
            
            System.out.println("================================");
     }
    }
