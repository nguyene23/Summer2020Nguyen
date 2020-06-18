package coolguy;
// Emma Nguyen
// 6/16/20

//create and declare scanner
//        Open bracket for main args
//        create and initialize/declare variables
//        Int, double, string; ex. int integy1 = 9, double doubly1 = 3.2, String str1 = "Hornets"
//        declare and initialize int i, double d, String s in program
//using scanner
//        ask for input prompts for user utilizing scanner
//        print line prompts on new line
//        Repeat for string, integer, and double values
//        Enter in function for math operations
//        print the outcomes of the mouth using a function
//        Close brackets
//math operations function
//        Open up new bracket, initialize and declare
//        > attach to scanner potentially
//        Print sum of int variable on a new line (integy+i) using printf
//        Print sum + double variable to a scale of one decimal place on a new line (\n)
//        Concatenate input and string s
//        print the result on a new line (\n)
//        Print the sum of both integers on the first line
//        Print the sum of both doubles (scaled to decimal place) on the second line
//        Print the two concatenated strings on the third line

import java.util.Scanner;

public class ChallengeDataTypes {
    public static void main(String[] args){
        // declare and initialize variables
        int integy1;
        double doubly1;
        String str1;

        //declare other variables -- these are 'i', 'd', and 's'
        int i = 4;
        double d = 4.0;
        String s = "Greenhill";

        //ask for user input
        //print line prompts on new line
        //Repeat for string, integer, and double values
        Scanner console = new Scanner(System.in);
        System.out.println("Enter in an integer: ");
        integy1 = console.nextInt();
        System.out.println("Enter in a double: ");
        doubly1 = console.nextDouble();
        console = new Scanner(System.in);
        System.out.println("Enter in a string: ");
        str1 = console.nextLine();

        //(functions don't work) here are the math calculations
        int calc1=integy1+i;
        double calc2=doubly1+d;
        String calc3=(s + " " + str1);

        //print them out
        System.out.printf("Integer answer: \n%d", calc1);
        System.out.println();
        System.out.printf("Double answer: \n%.1f", calc2);
        System.out.println();
        System.out.println("String answer: \n" + calc3);
    }

}
