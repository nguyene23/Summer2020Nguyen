package coolguy;
import java.util.Scanner;
public class PeterAndHisFriend {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        // ask for phrase; 'Peter and his friend" -- find how many instances P/E appear
        System.out.print("Type in a phrase: ");
        String fullPhrase = console.nextLine();
//next only takes ONE WORD--so need nextLine
// split phrase into four words?
        peter(fullPhrase, console);
    }
// create a scanner -- DONE
    // find first word -- indexOf("")(code for indexOf in own function?)
    //                     substring (0 to index)--(0, name.indexOf (" "));
    public static void peter (String firstWord, Scanner console){
        String name= firstWord.substring(0, firstWord.indexOf (" "));
        for (byte count = 0; count <= 1; count++){
            char letter = firstWord.charAt(0);
            System.out.print(letter);
        }
        int indexOf = firstWord.indexOf(" ");
    }
}
