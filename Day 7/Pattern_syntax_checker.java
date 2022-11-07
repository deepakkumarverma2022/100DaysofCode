/*
In this program you are given a pattern. You have to check whether the syntax of the given pattern is valid.
A regex is only valid if you can compile it using the Pattern.compile method.
Pattern is of regular expression stored in string datatype.


Sample Input

3
([A-Z])(.+)
[AZ[a-z](a-z)
batcatpat(nat
Sample Output

Valid
Invalid
Invalid
*/



import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
        String VALID = "Valid";
        String INVALID = "Invalid";
        Pattern pat;
		while(testCases>0){
			String pattern = in.nextLine().trim();
          	if(!pattern.isEmpty()) {
                  try {
                       pat = Pattern.compile(pattern);
                  System.out.println(VALID);
              } catch (PatternSyntaxException e){
                  System.out.println(INVALID);
              }
            }   
            testCases--;           
        }
                  }
              
		}
