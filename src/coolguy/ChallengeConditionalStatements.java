package coolguy;
//Emma Nguyen
//Import scanner
//Open main arguments bracket
//    Declare and initialize scanner
//    Declare and initialize variables
//        Int n = random number between 1-137
//    Insert method
//Close main arguments bracket
//
//Open method bracket
//    Create if loop
//        If/else statements
//        If is odd, print Weird
//        If I s even and in the inclusive range of to , print Not Weird
//        If is even and in the inclusive range of to , print Weird
//        If is even and greater than , print Not Weird
//    Close if loop
//Close method bracket
import java.util.Random;
import java.util.Scanner;
public class ChallengeConditionalStatements {
    public static void main (String[]args){
        Scanner console = new Scanner(System.in);
        Random rand = new Random();
        asking(console, rand);
    }
    public static void asking(Scanner console, Random rand){
        int n = rand.nextInt(137)+1;
        System.out.println("Do you want to play? (Yes or No)");
        String input = console.nextLine();
        if (input.toUpperCase().contains("Y")) {
            System.out.println(n);
            loop(n, console, rand);
        }
        else System.out.println("Goodbye!");
    }
    public static void loop(int n, Scanner console, Random rand){
        if (n%2==1){
            System.out.println("Weird.");
        }
        if (n%2==0) {
            System.out.println("Not weird.");
        }
        if (n>=2 && n<=5){
            System.out.println("Not weird.");
        }
        else if (n>=6 && n<=20){
            System.out.println("Weird.");
        }
        if (n%2==0 && n<20){
            System.out.println("Not weird.");
        }
        asking(console, rand);
    }
}
