/*
Given a double-precision number,payment, denoting an amount of money, use the NumberFormat class'
getCurrencyInstance method to convert payment into the US, Indian, Chinese, and French currency formats.
Then print the formatted values as follows:

US: formattedPayment
India: formattedPayment
China: formattedPayment
France: formattedPayment
*/



import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        NumberFormat f1 = NumberFormat.getCurrencyInstance(Locale.US);
         Locale l = new Locale ("en","in");
        Currency c = Currency.getInstance(l);
        NumberFormat f2 = NumberFormat.getCurrencyInstance(l);
         NumberFormat f3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat f4 = NumberFormat.getCurrencyInstance(Locale.FRANCE); 
       
       
        System.out.println("US: " + f1.format(payment));
        System.out.println("India: " + f2.format(payment));
        System.out.println("China: " + f3.format(payment));
        System.out.println("France: " + f4.format(payment));
    }
}
