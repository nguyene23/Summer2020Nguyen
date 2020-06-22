package coolguy;
//Emma Nguyen
import java.util.Scanner;
public class PeterAndHisFriendV3 {
    public static int indexOf;
    public static String firstword;
    public static char letter;
    public static String phrase;
    public static void main(String[] args) {
        Scanner screen = new Scanner(System.in);
        System.out.println("Say something!");
        phrase = screen.nextLine();
        indexOf = phrase.indexOf(" ");
        firstword = phrase.substring(0, phrase.indexOf(' '));// "Peter "
        // phrase = phrase - firstword
        int count = 0;
        countingLettersFW(letter, count);
    }

        public static void countingLettersFW(char letter, int count){
        for (int index = 0; index < firstword.length(); index++) {
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
                // find the rest of the letter of your message maybe use a method??

                //  replace the letter you just finished in the firstword with a ' '
                firstword = firstword.replace(letter, ' ');
                System.out.println(letter + " " + count);
                count = 0;
            }
        }
    }
}
// i am just losing my mind i do not understand how to do this and unfortunately i could not go to
// the office hours and in conclusion i am really sorry but i am giving up on this program