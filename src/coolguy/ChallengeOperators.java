package coolguy;
//Emma Nguyen 6/17/20
//Import scanner
//        Open main arguments bracket
//        Declare and initialize scanner
//        Declare and initialize variables
//        Double mealCost, int tipPercent, int taxPercent
//        Print out statements asking for such
//        Attach scanner (system.In)
//        Declare and initialize variable totalCost
//        Insert method solve
//Close main arguments bracket
//Open method called solve
//        Calculate new tip
//        Calculate new tax
//        Calculate totalCost
//        Round up
//        Return it to main argument (?)
//Close method
import java.util.Scanner;
public class ChallengeOperators {
    public static void main (String[] args){
        // initialize scanner and variables
        Scanner console = new Scanner(System.in);
        double mealCost;
        int tipPercent;
        int taxPercent;
        int totalCost = '0';

        //attach scanner to ask
        System.out.println("What was your meal's cost?");
        mealCost = console.nextDouble();
        System.out.println("What was your meal's tipping percent?");
        tipPercent = console.nextInt();
        System.out.println("What was your meal's tax percentage?");
        taxPercent = console.nextInt();

        //method
        solve(mealCost, taxPercent, tipPercent, totalCost);
    }
    public static void solve(double mealCost, int taxPercent, int tipPercent, int totalCost){
        //math calculations
        double tip = mealCost * (tipPercent/100.0);
        double tax = mealCost * (taxPercent/100.0);
        totalCost = (int) (mealCost + tip + tax);
        //rounding and printing function
        Math.round(totalCost);
        System.out.println("Your total cost is $"+ totalCost);
    }
}
