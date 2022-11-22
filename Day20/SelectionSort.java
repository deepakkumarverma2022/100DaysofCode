/*
WAP to perform Selection Sort and take input from the user

Sample Input :
5
15 45 76 2 6

Sample output :
2 6 15 45 76
*/


package sorting;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a[] = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for(int j = 0; j < n-1; j++) {
			int minInd = j;
			for(int k = j; k < n; k++) {
				if(a[k] < a[minInd]) {
					minInd = k;
				}
			}
			int temp = a[j];
			a[j] = a[minInd];
			a[minInd] = temp;
		}
		for(int e: a) {
			System.out.print(e + " ");
		}

	}

}
