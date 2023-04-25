/*
In this question we have simply solved three questions using recursion inside same MainClass.
(i) Find the sum of n natural number
(ii) Calculate power using recursion a^b in O(log n) time complexity
(iii) Find all the paths in a (n x m) grid

Sample Input 1:
N = 5

Sample Output 1:
1+2+3+4+5 = 15

Sample Input 2:
a = 3, b = 6

Sample output 2:
729

Sample Input 3:
n = 4, m = 4

Sample Output 3:
20
*/



package recursion;

public class MainClass {
	
	static int stepCount = 0;
	
	public static void main(String[] args) {
		
				System.out.println("Sum of the first n natural number is " + sum(15));
				System.out.println("Power " + fastpow(3,6));
				System.out.println("Steps " + stepCount);
				System.out.println("Possible path in a n*m grid " + path(4,4));

			}
			static int sum(int n) {
				if(n == 1) {
					return 1;
				}
				return n + sum(n-1);
			}
			static int fastpow(int a, int b) {
				stepCount++;
				if(b == 0) {
					return 1;
				}
				if(b % 2 ==0) {
					return fastpow(a*a,b/2); 
				} else {
					return a*fastpow(a,b-1);
				}
			}
			static int path(int n, int m) {
				if(n == 1 || m == 1) return 1;
				
				return path(n-1, m)+path(n, m-1);
			}

		}
