import java.util.Scanner;

public class OneLetterPerLine {
    public static void main(String[] args){
        String inputWord;
        int times = 0, num;
        char letter;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a word: ");
        inputWord = scan.next();

        num = inputWord.length();
        
        while (times < num){
            letter = inputWord.charAt(times);
            System.out.println("" + letter);
            times++;
        }
    }
}
