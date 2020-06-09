package coolguy;

public class mirrorV2 {
    public static final int SIZE=10; //declaring the global constant
    public static void main(String[] args) {
            Frame();
            topmirror();
            bottommirror();
            Frame();
            bottommirror();
            topmirror();
            Frame();
    }

    public static void Frame() {
        System.out.print("+");
        for (int dash = 0; dash < 2*SIZE-1; dash++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void topmirror() {
        for (int line = 1; line < SIZE+1; line++) {
            System.out.print("|");
            for (int space = 1; space <= SIZE-line; space++) {
                System.out.print(" ");
            }
            for (int slash = 1; slash <= line - 1; slash++) {
                System.out.print("/");
            }
            System.out.print("*");
            for (int slash = 1; slash <= line - 1; slash++) {
                System.out.print("\\");
            }
            for (int space = 1; space <= SIZE-line; space++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static void bottommirror() {
        for (int line = 1; line < SIZE+1; line++) {
            System.out.print("|");
            for (int space = 1; space <= line-1; space++) {
                System.out.print(" ");
            }
            for (int slash = 1; slash <= -line + SIZE; slash++) {
                System.out.print("\\");
            }
            System.out.print("*");
            for (int slash = 1; slash <= -line + SIZE; slash++) {
                System.out.print("/");
            }
            for (int space = 1; space <= line-1; space++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}

