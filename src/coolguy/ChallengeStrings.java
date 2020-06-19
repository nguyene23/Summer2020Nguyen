//package coolguy;
////Emma Nguyen
////Import scanner
////   Open main arguments bracket
////   Declare and initialize scanner
////   Declare and initialize variables
////        Int T, representing # of strings
////        S, representing strings
////        println Ask for user input using scanner -- likely nextLine
////   Insert method
////Close main arguments bracket
////Open method bracket
////   Create a for loop for the phrase using name index
////        Put char letter as 1st index
////        indexOf string -- print index?
////        Use charAt to discover whether index is even/odd
////        Loop for how many times there is t
////   Close for loop
////Close method bracket
//
//import java.util.Scanner;
//public class ChallengeStrings {
//    public static String s;
//    public static char letter;
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please print one word: ");
//        s = input.nextLine();
//        String even = " ";
//        String odds = " ";
//        for (int index = 0; index <= s.length(); index+=2) {
//            even = s.charAt(index);
//        }
//        for (int index = 1; index<= s.length(); index+=2){
//            odds = s.charAt(index);
//    }
//        String answer = even+" "+odds;
//        System.out.println(answer);
//    }
//}