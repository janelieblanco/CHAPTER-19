/*This program writes all the integers (inclusive) between those two values.
 * Written by: Janelie S. Blanco BSCS 1A */
import java.util.Scanner;

public class RunOfIntegers{
    public static void main(String[] args){
        int inputStart, inputEnd; //declaration of int variables
        Scanner scan = new Scanner (System.in);
    
        //prompts the user for starting and ending number
        System.out.print("Enter an integer starting number: ");
        inputStart = scan.nextInt();

        System.out.print("Enter an integer ending number: ");
        inputEnd = scan.nextInt();

        while (inputStart <= inputEnd){
            System.out.println( "" + inputStart );
            inputStart += 1;       
        }
    }
}