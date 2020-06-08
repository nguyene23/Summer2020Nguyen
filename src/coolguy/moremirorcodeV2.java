package coolguy;
// Emma Nguyen's project :-)
public class moremirorcodeV2 {
    public static void main(String[] args) {
        line();
        top();
        bottom();
        line();
    }
    public static void line(){
        System.out.print("#");
        //declare var   ctrl var  increment
        for(int dash=0; dash<16; dash++){
            System.out.print("=");
        }
        System.out.println("#");

    }
    public static void top(){
        System.out.print("|");
        for(int space=-1; space<6; space=space-2){
            System.out.print(" ");
        }
        System.out.print("<>");
        for(int dot=1; dot<4; dot=dot+4){
            System.out.print(".");
        }
        System.out.println("|");
    }
    public static void bottom(){
        System.out.println("|<>............<>|");
        System.out.println("|  <>........<>  |");
        System.out.println("|    <>....<>    |");
        System.out.println("|      <><>      |");
    }
}
