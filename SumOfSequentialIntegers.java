import java.util.Scanner;

public class SumOfSequentialIntegers {
    public static void main(String[] args){
        int inputN, formulaSum, count = 1, loopSum = 0;
        Scanner scan = new Scanner (System.in);

        System.out.print("Enter N (in an integer form): ");
        inputN = scan.nextInt();

        while (count <= inputN){
            loopSum += count;
            count++;
        }

        formulaSum = (inputN * (inputN + 1)) / 2;

        System.out.println("Loop Sum is " + loopSum);
        System.out.println("Formula Sum is " + formulaSum);
    }
}
