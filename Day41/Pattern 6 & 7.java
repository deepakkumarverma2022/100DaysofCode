/*
In this questions you have to write code for the following two programs

Sample Input :
N = 5 (For 1st example)  N = 6 (For 2nd example)

Sample Output :
1) * * * * *          2) **
   * * * *               * *
   * * *                 ***
   * *                   * *
   *                     * *
   *                     * *
   * *
   * * *
   * * * * 
   * * * * *
*/

1)
package patternPractice;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		int row = 2*n;
		for(int i = 1; i <= row; i++) {
			if(i <= n) {
				for(int j = i; j <= n; j++) {
					System.out.print("* ");
				}
			} 
			else {
				for(int k = n; k < i; k++) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}

	}

}


2)
  package patternPractice;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		System.out.println("**");
		for(int i = 2; i <= n; i++) {
			if(i == n/2) {
				System.out.print("***");
			} else {
				System.out.print("* *");
			}
			System.out.println();
		}
	}

}

