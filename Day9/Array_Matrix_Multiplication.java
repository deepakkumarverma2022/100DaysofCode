/*
WAP to multiply two matrix taken as an array.
Taking input from the user for the dimension & also the element of both the matrix.
For this the column of the first matrix must be equal to rows of the second matrix.

Sample input :
3 2       3 2 1
2 3       2 3 2
1 1  

Sample output :
13 12 7
12 13 8
5  5  3

Explanation :
In this matrix 1 is having 3 rows & 2 columns, and that of matrix 2 is having 2 rows & 3 column.
So here, column of first matrix is equal to the rows of second one.
Now, matrix multiplication is possible.
*/



package array;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter dimensions for m1");
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		System.out.println("Enter dimensions for m2");
		int ROWS = sc.nextInt();
		int COLS = sc.nextInt();
		int m1[][] = new int[rows][cols];
		int m2[][] = new int[ROWS][COLS];
		
		if(cols == ROWS) {
			System.out.println("Enter array A");
			for(int i = 0; i < rows; i++) {
				for(int j = 0; j < cols; j++) {
					m1[i][j] = sc.nextInt();
				}
			}
			System.out.println("Enter array B");
			for(int i = 0; i < ROWS; i++) {
				for(int j = 0; j < COLS; j++) {
					m2[i][j] = sc.nextInt();
				}	
			}
			int result[][] = new int[rows][COLS];
			for(int i = 0; i < rows; i++) {
				for(int j = 0; j < COLS; j++) {
					 result[i][j] = 0;
					 for(int k = 0; k < cols; k++) {
						 result[i][j] += m1[i][k] * m2[k][j];
					 }
					 System.out.print(result[i][j]+ " ");
				}
				System.out.println();
			}
		} else {
			System.out.println("Matrix cannot be multiplied");
		}
		
	}
}
