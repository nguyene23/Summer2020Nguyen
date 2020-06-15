package coolguy;
import java.util.Scanner;
public class PeterAndHisFriendV2 {
    public static int indexOf;
    public static String firstword;
    public static char letter = ' ';
    public static String phrase;

    public static void main(String[] args) {
        Scanner screen = new Scanner(System.in);
        System.out.println("Say something!");
        phrase = screen.nextLine();
        int indexOf = phrase.indexOf(" ");
        firstword = phrase.substring(0, indexOf + 1);// "Peter "
        // phrase = phrase - firstword
        int count = 0;
        countinglettersFW(letter, count);
        System.out.println(phrase);
    }

    public static void countinglettersFW(char letter, int count) {
        for (int index = 0; index < phrase.length(); index++) {
            letter = firstword.charAt(index);
            if (letter != ' ') {
                count++;
                String temp = firstword.substring(index + 1);

                indexOf = temp.indexOf(letter);
                while (indexOf >= 0) {
                    count++;
                    temp = temp.substring(indexOf + 1);
                    indexOf = temp.indexOf(letter);
                }
                //  replace the letter you just finished in the firstword with a ' '
                firstword = firstword.replace(letter, ' ');
                System.out.println(letter + " " + count);
                count = 0;
            }

        }
    }
}

