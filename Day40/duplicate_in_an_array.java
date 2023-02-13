/*
In this questions you are given an array a[] of size N which contains elements from 0 to N-1,
you need to find all the elements occurring more than once in the given array.

Note: The extra space is only for the array to be returned.
Try and perform all operations within the provided array. 

Example 1:

Input:
N = 4
a[] = {0,3,1,2}
Output: -1
Explanation: N=4 and all elements from 0
to (N-1 = 3) are present in the given
array. Therefore output is -1.
Example 2:

Input:
N = 5
a[] = {2,3,1,2,3}

Output: 2 3 

Explanation: 2 and 3 occur more than once
in the given array.

Your Task:
Complete the function duplicates() which takes array a[] and n as input as parameters and returns a list of elements
that occur more than once in the given array in a sorted manner. If no such element is found, return list containing [-1]. 

Expected Time Complexity: O(n).
Expected Auxiliary Space: O(n).
*/



class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        HashSet <Integer> numbers = new HashSet<>();
        for(int i = 0; i < n-1; i++) {
           if(arr[i] == arr[i+1]) {
               numbers.add(arr[i]);
           }
       }
       if(numbers.size() == 0) {
           numbers.add(-1);
       }
        ArrayList<Integer> duplicate = new ArrayList<>(numbers);
        Collections.sort(duplicate);
        return duplicate;
       }
    }
