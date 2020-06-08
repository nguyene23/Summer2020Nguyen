package coolguy;
// Emma Nguyen's project :-) BLAHHH

public class moremirorcodeV3 {
    public static final int SIZE=5; //declaring the global constant
    public static void main(String[] args) {
        line();
        top();
        bottom();
        line();
    }

    public static void line() {
        System.out.print("#");
        //declare var   ctrl var  increment
        for (int dash = 0; dash < 4*SIZE; dash++) {
            System.out.print("=");
        }
        System.out.println("#");

    }

    public static void top() {
        for (int line = 1; line < SIZE+1; line++) {
            System.out.print("|");
            //this for loop makes the spaces before <>
            for (int space = 1; space <= -2 * line + 2*SIZE; space++) {
                System.out.print(" ");
            }
            System.out.print("<>");
            //this for loop makes the dots between <>
            for (int dot = 1; dot <= 4 * line - SIZE+1; dot++) {
                System.out.print(".");
            }
            System.out.print("<>");
            //this for loop makes the spaces after <>
            for (int space = 1; space <= -2 * line + 2*SIZE; space++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static void bottom() {
        for (int line = 1; line < SIZE+1; line++) {
            System.out.print("|");
            for (int space = 1; space <= 2 * line - SIZE/2; space++) {
                System.out.print(" ");
            }
            System.out.print("<>");
            for (int dot = 1; dot <= -4 * line + 4*SIZE; dot++) {
                System.out.print(".");
            }
            System.out.print("<>");
            for (int space = 1; space <= 2 * line - SIZE/2 ; space++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}
