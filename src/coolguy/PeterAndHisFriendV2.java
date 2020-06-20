package coolguy;
// emma nguyen
import java.util.Scanner;
public class PeterAndHisFriendV2 {
    public static String firstword;
    public static int count;
    public static int index;
    public static int loop = 0;

    public static void main(String[] args) {
        Scanner screen = new Scanner(System.in);
        System.out.println("Say something!");
        String phrase = screen.nextLine();
        int indexOf = phrase.indexOf(" ");
        firstword = phrase.substring(0, indexOf + 1);// "Peter "
        // phrase = phrase - firstword
        char letter = firstword.charAt(loop++);
        String finished = "";
        String output = "";
        solve(letter, phrase, finished, output, firstword);
    }
    public static void solve (char letter, String phrase, String finished, String output, String firstword) {
        while (letter != ' ') {
            count = 0;
            index = 0;
        do {
            if (letter == phrase.charAt(index) && !finished.contains(Character.toString(letter)))
                count++;

        }
        while (index++ < (phrase.length() - 1));
        if (loop<=firstword.length()){
            if (count>0)
                output = output + letter + " " + count+ "\r\n";
            finished = finished + Character.toString(letter);
            if(loop < firstword.length())
                letter = firstword.charAt(loop++);
            else
                break;
            }
        else
            break;
        }
    System.out.println(output);
    }
}
// since i missed office hours the day this was supposed to go up, i asked emma rikalo if she could explain it to me :)
