/*
In today's github post there are some of the pattern questions.
According to me if you are not able to build logic at problem solving in java, patterns are the easiest way to enhance,
& build your skill.

Here are some of the pattern questions:

Sample input :
N = 5  (For all the patterns).

Sample output :

1) * * * * *        2)            *        3)         1                     4) *                5) *     
     * * * *                    * *                 2   3                      * *                 * *
       * * *                  * * *               4   5   6                    * * *               *   *
         * *                * * * *            7    8    9   10                * * * *             *     *      
           *              * * * * *          11   12   13   14   15            * * * * *           * * * * *                    
                                                                               * * * * 
                                                                               * * *        
                                                                               * *
                                                                               *
*/



// Code for all the five patterns. 

1) package patternPractice;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = i; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

2) package patternPractice;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print("  ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

3) package patternPractice;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		int number = 1;
		for(int i = 1; i <= n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print("  ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print(number++ +"   ");
			}
			System.out.println();
		}

	}

}

4) package patternPractice;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		int row = n*2-1;
		for(int i = 1; i <= row; i++) {
			if(i <= n) {
				for(int j = 1; j <= i; j++) {
					System.out.print("* ");
				}
				System.out.println();
			} else {
				for(int k = 1; k <= n*2-i; k++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			
		}

	}

}

5) package patternPractice;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		System.out.println("*");
		for(int i = 1; i < n-1; i++) {
			System.out.print("* ");
			for(int j = 1; j < i; j++) {
				System.out.print("  ");
			}
			System.out.println("*");
		}
		for(int k = 1; k <= n; k++) {
			System.out.print("* ");
		}
		System.out.println();
	}

}
