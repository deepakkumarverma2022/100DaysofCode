/*
In this question you have to find the RootMeanSquare of the number taken as an input in an array,
where a is the name of the array & n is the number of element in an array.

Sample Input :

N = 5
67
45
67
89
43

Sample Output :

64.45618742724588

Explanation :

N is the number of element in an array, then accordingly input has been taken & then after calculating the correct output has been displayed.
*/


package array;

import java.util.Scanner;

public class RootMeanSquare {

	public static void main(String[] args) {
		float sum = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0;i < n;i++) {
			a[i] = sc.nextInt();
			double square = Math.pow(a[i], 2);
			sum += square;
		}
		float mean = sum/n;
        double squareRoot = Math.sqrt(mean);
        System.out.println(squareRoot + " ");
	}
}
