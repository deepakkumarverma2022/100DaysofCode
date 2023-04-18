/*
In this question we are assembling given number in a circular manner & need to find the last kth number left after killing every 
kth integer which has been assembled in circular form.

Sample Input 1:

N = 8, k = 3 

     1
8        2
7           3
 6       4
     5   
     
Sample Output 1:
7

Sample Input 2:

N = 9, k = 4

       1
 10           2
                 3
6                     
                 9
   8          4
        5     
           
Sample Output 2:
1
*/



package josephus;
import java.io.*;
public class JosephuesTrapStati {

	public static void main(String[] args) {
		
		int n = 5, k = 2;
		  
		        System.out.println(Josephus(n, k));
		    }

		    public static int Josephus(int n, int k) {
		        k--;
		        int arr[] = new int[n];
		        for (int i = 0; i < n; i++) {
		            arr[i] = 1;
		        }
		        int count = 0, cut = 0, num = 1;
		        while (count < (n - 1)) {
		            while (num <= k) {
		                cut++;
		                cut = cut % n;
		                if (arr[cut] == 1) {
		                    num++;
		                }
		            }
		            num = 1;
		            arr[cut] = 0;
		            count++;
		            cut++;
		            cut = cut % n;
		            while(arr[cut]==0) {
		            	cut++;
		            	cut = cut % n;
		            }
		        }
		        return cut + 1;
	}

}
