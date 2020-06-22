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
    public static void main(String[] args) {
        //making variables accessible thru entire thing
        int T;
        String s = "";

        //declaring and initializing scanner + sys prints
        Scanner input = new Scanner(System.in);

        // this will loop the program until the user puts in the right number.
        do {
            System.out.println("How many words are there in your phrase (between 1-10)?");
            T = input.nextInt();
        }
        while (T < 1 || T > 10);

    // this is the loop asking for the user's phrase.
        for (int i = 0; i < T; i++) {
            do {
                input = new Scanner(System.in);
                System.out.println("Please print your phrase (one word at a time):");
                s = input.nextLine();
            }
            while (s.length() < 2 || s.length() > 10000);

            //printing answer
            String scramble = scramble(s);
            System.out.println(scramble);
        }
    }

    public static String scramble (String s){
        //making for loop to discover index of characters
        //declare and initialize strings
        String even = "";
        String odds = "";
        for (int index = 0; index < s.length(); index+=2) {
            char evenLetter = s.charAt(index);
            even = even+evenLetter;
        }
        for (int index = 1; index < s.length(); index+=2) {
            char oddLetter = s.charAt(index);
            odds = odds+oddLetter;
        }
        //return method
        String answer;
        answer = even+" "+odds;
        return answer;
    }
}
/* RESUBMITTED! TY to Lily to helping me understand why I needed the for and do while loops :) */