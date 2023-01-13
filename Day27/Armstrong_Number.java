/*
WAP to check whether the given number is armstrong or not ?

Armstrong number :- A number is said to be armstrong if the sum of it's own digits raised to the power of the number of digits 
gives the number itself.

Sample Input :
1634

Sample output :
Armstrong Number

Explanation :
Number of digits = 4
1^4 + 6^4 + 3^4 + 4^4 = 1634.
*/


package whileLoop;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		
		while(temp > 0) {
			int numberOfDigits = (int)Math.log10(n) + 1;
			int var = temp % 10;
			sum += (int)Math.pow(var, numberOfDigits);
			 temp /= 10;
		}
		if(sum == n ) {
			System.out.println("Number is armstrong");
		}	else {
			System.out.println("Number is not armstrong");
			}
		}
	}
