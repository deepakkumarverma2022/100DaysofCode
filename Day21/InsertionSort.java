/*
WAP to perform insertion sort, taking input from the user.

Sample input :
5
45 145 1 6 85

Sample output :
1 6 45 85 145
*/


package sorting;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the element in an array");
		for(int i = 0; i < n; i++) {
			 a[i] = sc.nextInt();
		}
		System.out.println("Array after sorting");
		for(int j = 1; j < n; j++) {
			int temp = a[j];
			int k = j-1;
			while(k >= 0 && a[k] > temp) {
				a[k+1] = a[k];
				k--;
			}
			a[k+1] = temp;
		}
		for(int e: a) {
			System.out.print(e + " ");
		}
	}

}
