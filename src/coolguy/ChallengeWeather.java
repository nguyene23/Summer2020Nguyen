package coolguy;
/* Emma Nguyen, Lily Thieberg, Valerie Xu
Pseudocode:

Import random class
Open main brackets
    declare variable 'days' (7)
    make array
    print random
    for loop to fill up values
        add values together
        divide by days. nice
    close for loop
    find average by dividing sum/days
    open new for loop
        loop for finding average, increase the days over average by 1 everytime 1 is found
    close for loop
    print statements
close main brackets
 */

import java.util.*;
public class ChallengeWeather {
    public static void main (String[] main){

        //declare variable
        Scanner console = new Scanner(System.in);
        System.out.println("How many days' temperature?");
        int days = console.nextInt();

        // making array
        int [] temp = new int[days];
        int sum = 0;
        //add random
        Random randy = new Random();

        //for loop
        for (int index = 0; index < days; index++) {
            temp[index] = randy.nextInt(86) + 25;
            System.out.println("Day " + (index + 1) + "'s high temperature: " + temp[index]);
            //equation: name.nextInt(size of range) + min, where (size of range) is (max - min + 1)

            //getting sum
            sum += temp[index];
        }
            //getting average
            double average = (double) sum/days;

            //finding out how many days are above average
            int count = 0;
            for (int i=0; i<days; i++){
                if (temp[i]>average){
                    count++;
                }
            }
            //prints out the lines we need.
            System.out.printf("The average temperature = %.1f\n", average);
            System.out.println("There were "+ count +" days above average.");
    }
}
