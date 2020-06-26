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
    public static int total = 0;
    public static int win = 0;

    public static void main(String[] args) throws FileNotFoundException {
        welcome();
        //declaring file and scanner
        Scanner verv = new Scanner(System.in);
        //declaring string input for user input
        String input = "";
        userInput(verv, input);
    }

    //methods
    public static void userInput(Scanner verv, String input) throws FileNotFoundException {
        //do while loop for user input
        do {
            File file = new File("C:\\Users\\color\\IdeaProjects\\Summer2020Nguyen\\src\\coolguy\\finalprocessing.txt");
            Scanner console = new Scanner(file);
            System.out.println("Do you want to play a guessing game?");
            input = verv.next();
            //asking for user input on wanting to play the game
            if (input.toUpperCase().contains("Y")) {
                System.out.println("Do you want to guess words, doubles, or integers?");
                input = verv.next();
                if (input.toLowerCase().contains("wo")) {
                    win = words(console, verv, win); //goes to method
                }
                else if (input.toLowerCase().contains("dou")) {
                    win=doubles(console, verv, win); //goes to method
                }
                else if (input.toLowerCase().contains("i")) {
                    win = integers(console, verv, win); //goes to method
                }
            }
            console.close();
            System.out.println("Do you want to play again?");
            input = verv.next();
        }
        while (input.toUpperCase().contains("Y"));
        System.out.println("Goodbye! You played " + total + " times and won " + win + " times.");
    }

    public static int words(Scanner console, Scanner verv, int win) throws FileNotFoundException {
        total++;
        String line;
        String trash;
        //print statements
        System.out.println("Guess the name of a country!");
        String wordInput = verv.next();
        while (console.hasNextLine()) {
            if (console.hasNext()){
                if (console.nextLine().contains(wordInput)) {
                    win++;
                    System.out.println(wordInput + " is in the file, so your answer is correct!");
                    break;
                }
            }
        }
        return win;
    }

    public static int doubles(Scanner console, Scanner verv, int win) {
        String wordsInput = "";
        total++;
            System.out.println("What is a double between 1 and 23?");
            //declaring and initializing both double values
            double doubly1 = verv.nextDouble();
            doubly1 = (((int) (doubly1 * 100)) / 100.0);
            String trash;
            //while loop
            while (console.hasNextLine()) {
                //declaring if doubly1=doubly2, then flag is true and will run answer is correct
                if (console.hasNextDouble()) { // if there is a match
                    if (console.nextDouble() == doubly1) {
                        win++;
                        System.out.println(doubly1 + " is in the file, so your answer is correct!");
                        break;
                    }
                } else { //if number wasn't found
                    trash = console.next();
                }
            }
        return win;
    }
    public static int integers(Scanner console, Scanner verv, int win) {
        String wordsInput = "";
        total++;
        System.out.println("What is an integer between 0 - 350?");
        //declaring and initializing both double values
        int integy1 = verv.nextInt();
        String trash;
        //while loop
        while (console.hasNextLine()) {
            //declaring if doubly1=doubly2, then flag is true and will run answer is correct
            if (console.hasNextInt()) { // if there is a match
                if (console.nextInt() == integy1) {
                    win++;
                    System.out.println(integy1 + " is in the file, so your answer is correct!");
                    break;
                }
            } else { //if number wasn't found
                trash = console.next();
            }
        }
        return win;
    }
    public static void welcome(){
        System.out.println("<>-------------<>");
        System.out.println("|  ❇ welcome ❇ |");
        System.out.println("<>-------------<>");
    }
}