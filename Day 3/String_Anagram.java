/*
In this program i have taken two string & checked whether the given string is anagram or not & took input from the user.
Two string are anagram of each other when there will be same number of character present in them & also they are repeating for the same number of time.
Ande also both the string should be in same upper or lower case.

Sample input:
Test case 1
anagram
margana

Sample output:
Anagrams

Sample input:
Test case 2
anagramm
marganaa

Sample output:
Not Anagrams

Sample input:
Test case 3
Hello
hello

Sample output:
Anagrams
*/


import java.util.Scanner;

public class Solution {
    static boolean isAnagram(String a, String b) {
        
        boolean isAnagram = true;
        int al[] = new int[256];
        String d = a.toLowerCase();
        String e = b.toLowerCase();
        for(char c: d.toCharArray()) {
            int index = (int) c;
            al[index]++;
        }
        for(char c: e.toCharArray()) {
            int index = (int) c;
            al[index]--;
        }
        for(int i = 0; i < 256; i++) {
            if(al[i] != 0) {
                isAnagram = false;
                break;
            }
        }
        return isAnagram;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
