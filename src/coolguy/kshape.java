package coolguy;
//Emma Nguyen
public class kshape {
    public static final int SIZE=6; //declaring the global constant
    public static final char letter = 65;
    public static void main (String[] args){
        topline();
        bottomline();

    }
    public static void topline() {
        int line = 1;
        for (line = 1; line <= SIZE; line++);{
            for(byte count = 0; count<= SIZE-line; count++){
                System.out.print((char) (letter+count)+ " ");
            }
            System.out.println();
        }
    }

    public static void bottomline(){
        for (int line = SIZE; line >= 1; line--){
            for (byte count = 0; count <= SIZE - line; count++){
                System.out.print((char) (letter+count)+" ");
            }
            System.out.println();
        }
    }
}
