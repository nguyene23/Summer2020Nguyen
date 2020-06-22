package coolguy;
/*Emma Nguyen
Import scanner
   Open main arguments bracket
   Declare and initialize scanner
   Declare and initialize variables
        Int T, representing # of strings
        S, representing strings
        println Ask for user input using scanner -- likely nextLine
   Insert method
Close main arguments bracket
Open method bracket
   Create a for loop for the phrase using name index
        Put char letter as 1st index
        indexOf string -- print index?
        Use charAt to discover whether index is even/odd
        Loop for how many times there is t
   Close for loop
Close method bracket*/

import java.util.Scanner;
public class ChallengeStrings {
    //making variables accessible thru entire thing
    public static int T;
    public static String s;

    public static void main(String[] args) {
        //declaring and initializing scanner + sys prints
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of test cases: ");
        T = input.nextInt();
        input = new Scanner(System.in);
        System.out.println("Please print your phrase: ");
        s = input.nextLine();
        //declare and initialize strings
        String even = "";
        String odds = "";

        //making for loop to discover index of characters
        for (int index = 0; index < s.length(); index+=2) {
            even += s.charAt(index);
        }
        for (int index = 1; index < s.length(); index+=2) {
            odds += odds + s.charAt(index);
        }
        //return method
        String answer = even+" "+odds;
        System.out.println(answer);
    }
}
/* unfortunately i was unable to go to any office hours provided b/c of road tripping and lack of
accessibility to wifi... i'll need to ask why my program keeps on doing... That.
 */