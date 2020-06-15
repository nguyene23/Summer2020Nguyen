package coolguy;

public class NumbersandMore {
    public static void main (String[] args) {
    double doubly1 = 4.65;
    int integy1 = 9;
    String stringy = "Greenhill";
    System.out.printf("Printing a string: %s\n", stringy);
    double doubly2 = Math.sqrt(doubly1*integy1);
    double doubly3 = doubly2*doubly1;
    double doubly4 = Math.pow(doubly3,4.0);
    System.out.printf("This is my calculation \n %20.3f \n %20.3f", doubly2, doubly3);
    }
}
