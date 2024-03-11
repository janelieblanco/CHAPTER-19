import java.util.Scanner;

public class RangeOfSequentialIntegers {
    public static void main(String[] args){
        int inputLow, inputHigh, highSum, lowSum ;
        Scanner scan = new Scanner (System.in);

        System.out.print("Enter low (integer form): ");
        inputLow = scan.nextInt();
        System.out.print("Enter high (integer form): ");
        inputHigh = scan.nextInt();

        while (inputLow < inputHigh){
            inputHigh += 1;
        }
        sum = (N * ( N + 1)) / 2;

        System.out.println("Sum is " + sum);
    }
} //wala pa nahuman then butngi pud ug comments 
