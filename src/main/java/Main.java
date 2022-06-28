import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LexicalAnalyser s = new LexicalAnalyser();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word or sentence ");
        String words = scan.nextLine();

        System.out.println("Your word or sentence has " + s.letterCount(words) + " Characters" );
        System.out.println("Your word or sentence has " + s.wordCount(words) + " word(s)");
        System.out.println("Character Frequencies: " + s.letterFrequency(words));

    }
}
