package Questions.functions;
//question - you have a number n and a digit d , you have to find the frequency of digit d in number n 
// suppose n = 4454674421;   d = 4         result (freq) = 5;
import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args){
        System.out.println("hello world");
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scn.nextInt();
        System.out.println("Enter the digit");
        int digit = scn.nextInt();
        int freq = 0;
        while(number != 0){
            int lastDigit = number % 10;
            if(lastDigit == digit){
                freq = freq + 1;
            }
            number = number / 10;
        }
        System.out.println("The frequency is " + freq);
        scn.close();

    }
    
}
