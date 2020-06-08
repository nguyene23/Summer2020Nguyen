package coolguy;

public class mirror {
    public static void main(String[] args) {
            Frame();
            topmirror();
            bottommirror();
            Frame();
            bottommirror();
            topmirror();
            Frame();
    }
   public static void Frame(){
        System.out.println("+-----------+");
   }
   public static void topmirror(){
        System.out.println("|     *     |");
        System.out.println("|   / * \\   |");
        System.out.println("|  // * \\\\  |");
        System.out.println("| /// * \\\\\\ |");
   }
   public static void bottommirror(){
        System.out.println("| \\\\\\ * /// |");
        System.out.println("|  \\\\ * //  |");
        System.out.println("|   \\ * /   |");
        System.out.println("|     *     |");
   }
}

