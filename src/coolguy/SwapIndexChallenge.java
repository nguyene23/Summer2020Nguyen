package coolguy;
import java.util.*;
public class SwapIndexChallenge {
    public static void main (String[] main){

        //scanner for how many #s there should be in the string
        Scanner console = new Scanner(System.in);
        System.out.println("How many numbers should there be (5-10 please!)");
        int numbers = console.nextInt(); //numbers is the amount they give us

        //random value
        Random randy = new Random();
        int n = randy.nextInt();

        int[] myArray = new int [numbers];

        //for loop to insert randy values into the array
        for (int i=0; i<numbers; i++) {//variable i is the index of my array
            myArray[i] = randy.nextInt((100)+1);//this should put the numbers into our array but doesn't
        }
        System.out.println(Arrays.toString(myArray));

        // create your 2 random indexes and replace 1 & 2.
        int x;
        int y;
        do {
            x = randy.nextInt(numbers);
            y = randy.nextInt(numbers);
        }
        while (x==y);

        myArray = swap(myArray, x, y);
        System.out.println ("Swapped: "+Arrays.toString(myArray));
    }

    public static int[] swap (int [] a1, int a, int b){
        int temp = a1[a];
        a1[a] = a1[b];
        a1[b] = temp;
        return a1;
    }
}
/*THE GAMEPLAN: define the last two integers as 2 separate variables, and then swap them in
* the swap method.
*
* so update maybe we r lost*/