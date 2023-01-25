/*
In this question given an unsorted array arr[] of size N having both negative and positive integers. 
The task is place all negative element at the end of array without changing the order of positive element and negative element.

Sample Input : 
N = 8
arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
Sample Output : 
1  3  2  11  6  -1  -7  -5

Your task is to complete the function segregateElements() which takes the array arr[] and its size N as inputs and store the answer in the array arr[] itself.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
*/



//User function Template for Java

class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        // Your code goes here
        ArrayList<Integer>numbers = new ArrayList<>();
        ArrayList<Integer>num = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if(arr[i] >= 0) {
                numbers.add(arr[i]);
            } else {
                num.add(arr[i]);
            }
        }
        numbers.addAll(num);
        for(int i = 0; i < n; i++) {
            arr[i] = numbers.get(i);
        }
    }
}
