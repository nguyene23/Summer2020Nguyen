package coolguy;
import java.util.Scanner;
public class TestingThings {
    public static void main (String[] args){
        int num = 7; // primitive data type
        // byte, int, short, long, char, boolean, float, double
        //object is an instance of a class
        System.out.print("Type your full name, please: ");
        Scanner keyboard = new Scanner (System.in);
        String fullName = keyboard.nextLine();
        int indexOf = fullName.indexOf(" ");
        System.out.println(indexOf);
        String lastName = fullName.substring(indexOf+1);
        //string is an array of characters
        //+1 to start after space
        String firstName= fullName.substring(0, indexOf);
        byMyself(firstName, keyboard);
        byMyself(lastName, keyboard);
        moremirorcodeV3.line();
        char letter = firstName.charAt(0);
        System.out.print(letter+".");
    }
    public static void byMyself(String name, Scanner keyboard){
        name = name.toUpperCase();
        String secondName = keyboard.next();
        System.out.println("Hello " + name.toLowerCase());
        System.out.println("Hello " + name.toUpperCase());
    }
}
