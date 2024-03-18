import java.util.Scanner;

public class WordSeparatedByDots {
    public static void main(String[] args){
        String firstWord, secondWord;
        int dots, times = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first word: ");
        firstWord = scan.next();
        System.out.print("Enter second word: ");
        secondWord = scan.next();

        dots = 30 - (firstWord.length() + secondWord.length());

        System.out.print("" + firstWord);

        while (times < dots){
            System.out.print(".");
            times++;
        }
        
        System.out.print("" + secondWord);
    }
}
