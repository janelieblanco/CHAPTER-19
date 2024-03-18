import java.util.Scanner;

public class RepeatedlyEchoWord {
    public static void main(String[] args){
        String inputString;
        int count = 0, times;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a word: ");
        inputString = scan.next();

        times = inputString.length();

        while (count < times){
            System.out.println("" + inputString);
            count++;
        }

    }
}
