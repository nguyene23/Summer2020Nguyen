package coolguy;
/*Emma Nguyen--Edited Pseudocode for the Challenge Strings Arrays
Import scanner
   Open main arguments bracket
   Declare and initialize scanner
   Declare and initialize variables
        Int T, representing # of strings
   println Ask for user input using scanner -- likely nextLine
   Declare and initialize array
        insert for loop set equal to string length; this will add it to the array
        close this for loop
        insert another for loop that will be the return answer
            insert print statements
        close for loop
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

import java.util.*;

public class ChallengeStringsArrays {
    public static void main(String[] args) {
        //making variables accessible thru entire thing
        int T;
        //declaring and initializing scanner + sys prints
        Scanner input = new Scanner(System.in);
        System.out.println("How many words are there in your phrase (between 1-10)?");
        T = input.nextInt();
        // this will loop the program until the user puts in the right number.
        //declare array to take the words
        String[] words = new String[T];
        System.out.println("Please print your phrase, press enter after each new word:");
        for (int i=0; i<words.length; i++){//variable i is the index of my array.
            words[i]=input.next();
        }
        String[] newWord= new String [words.length];
        for (int i=0; i<words.length; i++){
            newWord[i]=scramble(words[i]);
            System.out.println(newWord[i]);
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
/* brr */