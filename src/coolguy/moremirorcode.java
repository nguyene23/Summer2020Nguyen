package coolguy;
// Emma Nguyen's project :-)
public class moremirorcode {
    public static void main(String[] args) {
        line();
        top();
        bottom();
        line();
    }
    public static void line(){
        //declare var   ctrl var  increment
        System.out.print("#");
        for(int dash=0; dash<20; dash++){
            System.out.print("=");
        }
        System.out.println("#");

    }
    public static void top(){
        System.out.println("|      <><>      |");
        System.out.println("|    <>....<>    |");
        System.out.println("|  <>........<>  |");
        System.out.println("|<>............<>|");
    }
    public static void bottom(){
        System.out.println("|<>............<>|");
        System.out.println("|  <>........<>  |");
        System.out.println("|    <>....<>    |");
        System.out.println("|      <><>      |");
    }
}
