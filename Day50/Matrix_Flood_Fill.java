/*
In this question you are given a recursion based problem name Matrix Flood Fill. 
Given a 2D screen arr[][] where each arr[i][j] is an integer representing the color of that pixel,
also given the location of a pixel (X, Y) and a color C, the task is to replace the color of the given pixel and all the adjacent same-colored pixels with the given color.

Sample Input :
arr[][] = { 
{1, 1, 1, 1, 1, 1, 1, 1}, 
{1, 1, 1, 1, 1, 1, 0, 0}, 
{1, 0, 0, 1, 1, 0, 1, 1}, 
{1, 2, 2, 2, 2, 0, 1, 0}, 
{1, 1, 1, 2, 2, 0, 1, 0}, 
{1, 1, 1, 2, 2, 2, 2, 0}, 
{1, 1, 1, 1, 1, 2, 1, 1}, 
{1, 1, 1, 1, 1, 2, 2, 1}} 
X = 4, Y = 4, C = 3 

Sample Output :
1 1 1 1 1 1 1 1 
1 1 1 1 1 1 0 0 
1 0 0 1 1 0 1 1 
1 3 3 3 3 0 1 0 
1 1 1 3 3 0 1 0 
1 1 1 3 3 3 3 0 
1 1 1 1 1 3 1 1 
1 1 1 1 1 3 3 1 
*/



package recursion;

public class Matrix_Flood_Fill {
	
	public static void main(String[] args) {
		int a[][] = {{1,1,1,2,1,1,1},
				{2,2,1,2,2,1,1},
				{0,2,2,2,1,1,1},
				{1,1,0,2,1,2,2},
				{1,1,2,2,1,0,0},
				};
		
		floodFill(a, 2, 3, 3, 2);
		printMatrix(a);

	}
	static void floodFill(int a[][], int r, int c, int toFill, int prevFill) {
		int rows = a.length;
		int cols = a[0].length;
		//base case condition
		if(r < 0 || r >= rows || c < 0 || c >= cols)
			return;
		if(a[r][c] != prevFill ) {
			return;
		}
		
		a[r][c] = toFill;
		floodFill(a, r-1, c, toFill, prevFill);
		floodFill(a, r, c-1, toFill, prevFill);
		floodFill(a, r+1, c, toFill, prevFill);
		floodFill(a, r, c+1, toFill, prevFill);
	
	}
	static void printMatrix(int a[][]) {
		int row = a.length;
		int col = a[0].length;
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(a[i][j]+" ");
			}
		System.out.println();
		}
	}

}
