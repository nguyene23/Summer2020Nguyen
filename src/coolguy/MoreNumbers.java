package coolguy;

public class MoreNumbers {
    public static void main (String[] args){
        // 3 double variables, 3 math calculations, and 3 print outs on 1 line
        double doubly1 = 9.64;
        double doubly2 = 8.40;
        double doubly3 = 6.67;
        // here are the math calculations
        double calc1 = doubly1*doubly2;
        double calc2 = Math.pow(doubly2, doubly3);
        double calc3 = doubly3+doubly1;
        // \n = break in the line
        // %(spaces) indicates how many spaces
        // .(number) is like how many decimal points ig
        // need to attach corresponding letter to value, i.e. .#!f!

        //print statement
        System.out.printf("My answers: \n %10.2f \n %15.2f \n %10.2f", calc1, calc2, calc3);
    }
}
