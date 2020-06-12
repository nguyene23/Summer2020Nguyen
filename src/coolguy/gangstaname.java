package coolguy;
import java.util.Scanner;
public class gangstaname {
    public static void main (String[] args){
// to make a scanner console, give it a name -- need the new LINE
        Scanner console = new Scanner(System.in);
        System.out.print("Type your name, playa: ");
        String name = console.nextLine(); //next only takes ONE WORD--so need nextLine
// split name into first/last name + initials
//print out gangsta name output
        fullPhrase(name, console);
    }
    public static void fullPhrase(String name, Scanner console){
        String first = name.substring(0, name.indexOf (" "));
        String last = name.substring(name.indexOf (" ") + 1);
        last = last.toUpperCase();
        String fInitial = first.substring(0, 1);
        System.out.println
                ("Your gangsta name is \"" + fInitial + ". Diddy " + last + " " + first + "-izzle\"");
    }
}
// object is an instance of a class