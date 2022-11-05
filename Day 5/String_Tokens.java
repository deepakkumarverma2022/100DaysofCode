/*
In this program i have taken a string as an input & then printed the number of tokens present in it.
And also the splitted token around the regular expression.
Token are those to be one or more consecutive English alphabetic letters.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String b[] = s.trim().split("[ !,?_.'@]+");
        if(s.trim().isEmpty()) {
            System.out.println("0");
        } else {
            System.out.println(b.length);
            for(String a:b) {
                System.out.println(a);
            }
        scan.close();
    }
}
}
