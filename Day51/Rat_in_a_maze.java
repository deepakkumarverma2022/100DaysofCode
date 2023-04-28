/*
In the given question consider a rat placed at (0, 0) in a square matrix of order N * N. It has to reach the destination at (N - 1, N - 1).
Find all possible paths that the rat can take to reach from source to destination.
The directions in which the rat can move are 'U'(up), 'D'(down), 'L' (left), 'R' (right).
Value 0 at a cell in the matrix represents that it is blocked and rat cannot move to it while value 1
at a cell in the matrix represents that rat can be travel through it.
Note: In a path, no cell can be visited more than one time. If the source cell is 0, the rat cannot move to any other cell.

Example 1:

Input:
N = 4
m[][] = {{1, 0, 0, 0},
         {1, 1, 0, 1}, 
         {1, 1, 0, 0},
         {0, 1, 1, 1}}
Output:
DDRDRR DRDDRR

Explanation:
The rat can reach the destination at 
(3, 3) from (0, 0) by two paths - DRDDRR 
and DDRDRR, when printed in sorted order 
we get DDRDRR DRDDRR.

Example 2:
Input:
N = 2
m[][] = {{1, 0},
         {1, 0}}
         
Output:
-1

Explanation:
No path exists and destination cell is 
blocked.
Your Task:  
You don't need to read input or print anything. 
Complete the function printPath() which takes N and 2D array m[ ][ ] as input parameters and returns the list of paths in lexicographically increasing order. 
*/



package recursion;

public class Rat_in_a_maze {

	public static void main(String[] args) {
		int a[][] = {{1,0,1,1,1,0,0,1},
				{1,1,1,0,1,1,0,1},
				{1,0,1,0,0,0,9,0},
				{0,0,1,1,1,0,1,1},
				{1,0,1,0,1,0,0,1},
				{1,0,1,0,1,1,1,1},
				{1,0,0,0,0,1,0,0},
				{1,1,1,1,1,1,1,1}
				};
		boolean visited[][] = new boolean[a.length][a[0].length];
		if(maze(a,0,0,9,visited)) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}
	}
	static boolean maze(int a[][], int r, int c, int find, boolean visited[][]) {
		if(!isValid(a,r,c,visited)) {
			return false;
		}
		if(a[r][c] == find) {
			System.out.println(r +" "+ c);
			return true;
		}
		if(a[r][c] == 1) {
			visited[r][c] = true;
			boolean down = maze(a, r+1, c, find, visited);
			boolean right = maze(a, r, c+1, find, visited);
			boolean left = maze(a, r, c-1, find, visited);
			boolean up = maze(a, r-1, c, find, visited);
			visited[r][c] = false;
			return down || right || left || up;
		}
		return false;
	}
	static boolean isValid(int a[][], int r, int c, boolean visited[][]) {
		int rows = a.length;
		int cols = a[0].length;
		return r >= 0 && r < rows && c >= 0 && c < cols && !visited[r][c];
	}

}
