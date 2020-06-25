package coolguy;
/*Import scanner
Import java.io.file
Open main arg brackets, throws exception
New scanner, attach to file
Declare and initialize file path
Do while loop which asks user for input (System.in) if they want to play a game
> if Yes, then execute loop
ask user if they’d like to guess words,doubles,or int .
If answer contains “words”, execute words method
If answer contains “doubles”, execute doubles method
If answer contains “int”, execute int method
If not any of these, go back to if they want to play
> if else, exit program
Close scanner
close main arg brackets

Open words method
Define str1 and str2, both as “”
If input has next line
Str1 = input.nextline,
Declare and initialize boolean variable as FALSE
While input next line
If input has next line, Str 2 = input nextline, Flag boolean is true
Else Create string trash = input next
Boolean is false
If flag=true, Print out they guessed the correct answer
Else Print out they correct the wrong answer
Ask if they want to play again -- if yes, then go back to top of method
Return method to main arg (the loop)
Close words method

same for other two, but the pseudocode is ridiculously long*/
import java.util.*;
import java.io.*;
public class FinalProject {
    public static void main(String[] args) throws FileNotFoundException {
        //declaring file and scanner
        File file = new File("C:\\Users\\color\\IdeaProjects\\Summer2020Nguyen\\src\\coolguy\\finalprocessing.txt");
        Scanner console = new Scanner(file);
        Scanner verv = new Scanner(System.in);

        //declaring string input for user input
        String input = "";
        userInput(console, verv, input);
        console.close();
        verv.close();
    }

    //methods
    public static void userInput(Scanner console, Scanner verv, String input){
        //do while loop for user input
        do {
            System.out.println("Do you want to play a guessing game?");
            input = verv.nextLine();

            //asking for user input on wanting to play the game
            if (input.toUpperCase().contains("Y")) {
                System.out.println("Do you want to guess words, doubles, or integers?");
                input = verv.nextLine();
                if (input.toLowerCase().contains("words")) {
                    words(); //goes to method
                }
                if (input.toLowerCase().contains("doubles")) {
                    doubles(console, verv, input); //goes to method
                }
                if (input.toLowerCase().contains("int")) {
                    integers(); //goes to method
                }
            } else System.out.println("Goodbye!");
        }
        while (input.equals(""));
    }
    public static void words() {
        //void
    }
    public static void doubles(Scanner console, Scanner verv, String input) {
        System.out.println("What is the double?");
        //declaring and initializing both double values
        double doubly2 = 0.0;
        double doubly1 = 0.0;
        if (console.hasNextDouble()) {
            doubly1 = verv.nextDouble();
        }
        //declaring boolean flag as false
        boolean flag = false;

        //while loop
        while (console.hasNextLine()) {
            //declaring if doubly1=doubly2, then flag is true and will run answer is correct
            if (console.hasNextDouble()) {
                doubly2 = console.nextDouble();
                doubly1 = doubly2;
                flag = true;
            } else {
                String trash = console.next();
                flag = false;
            }
            if (flag) {
                System.out.println(doubly1 + " = " + doubly2 + ", so your answer is correct!");
            } else System.out.println("Your answer is wrong :-(");
        }
        //looping game again
        System.out.println("Would you like to guess a double again?");
        String wordsInput = verv.nextLine();
        if (wordsInput.toUpperCase().contains("Y")) {
            doubles(console, verv, input);
        }
        else userInput(console, verv, input);
    }

    public static void integers() {
        //void
    }
}
/*
declare file inside method, put print statements in main instead
remember to close scanners :-)

maybe make arrays for the double method -- doubles are put in there, disregard everything else;
then perform a search function to see if user input = value in array. if yes, then print correct, if
not, then don't, rip?
 */