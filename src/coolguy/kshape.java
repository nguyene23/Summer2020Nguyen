package coolguy;

public class kshape {
    public static final int SIZE=6; //declaring the global constant
    public static void main (String[] args){
        topline();
        bottomline();

    }
    public static void topline(){
        char letter = 65;
        for (byte count = 0; count < SIZE; count++){
            System.out.print((char)(letter+count)+ " ");
        }
        pause();
        for (byte count2 = 0; count2 < SIZE-1; count2++){
            System.out.print((char)(letter+count2)+ " ");
        }
        pause();
        for (byte count2 = 0; count2 < SIZE-2; count2++){
            System.out.print((char)(letter+count2)+ " ");
        }
        pause();
        for (byte count2 = 0; count2 < SIZE-3; count2++){
            System.out.print((char)(letter+count2)+ " ");
        }
        pause();
        for (byte count2 = 0; count2 < SIZE-4; count2++){
            System.out.print((char)(letter+count2)+ " ");
        }
        pause();
        for (byte count = 0; count < SIZE-5; count++){
            System.out.print((char)(letter+count)+ " ");
        }
        pause();
    }
    public static void bottomline(){
        char letter = 65;
        for (byte count = 0; count < SIZE-5; count++){
            System.out.print((char)(letter+count)+ " ");
        }
        pause();
        for (byte count2 = 0; count2 < SIZE-4; count2++){
            System.out.print((char)(letter+count2)+ " ");
        }
        pause();
        for (byte count2 = 0; count2 < SIZE-3; count2++){
            System.out.print((char)(letter+count2)+ " ");
        }
        pause();
        for (byte count2 = 0; count2 < SIZE-2; count2++){
            System.out.print((char)(letter+count2)+ " ");
        }
        pause();
        for (byte count2 = 0; count2 < SIZE-1; count2++){
            System.out.print((char)(letter+count2)+ " ");
        }
        pause();
        for (byte count = 0; count < SIZE; count++){
            System.out.print((char)(letter+count)+ " ");
        }
    }
    public static void pause(){
        System.out.println();
    }
}
// what i have so far -- ask more in class tmw, confused on how to adjust size for this.