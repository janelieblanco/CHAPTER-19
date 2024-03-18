import java.util.Scanner;

public class RangeOfSequentialIntegers {
    public static void main(String[] args){
        int inputLow, inputHigh, sumToHigh, sumToLow, sum = 0;
        Scanner scan = new Scanner (System.in);

        System.out.print("Enter low (integer form): ");
        inputLow = scan.nextInt();
        System.out.print("Enter high (integer form): ");
        inputHigh = scan.nextInt();

        sumToHigh = (inputHigh * (inputHigh + 1)) / 2;   

        if (inputLow > inputHigh)
            System.out.println("Try again. Low number must be less than to high number!");
        else{
            sumToLow = (inputLow * (inputLow - 1) / 2);
            sum = sumToHigh - sumToLow;
            System.out.println("Sum is " + sum);
        }
    }
}
