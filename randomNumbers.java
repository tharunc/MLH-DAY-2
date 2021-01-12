  
import java.util.Scanner;

// Autumn Capasso
// UMUC
// CMIS141
// Random Numbers Generate


class RandomNumbers {
    public static void main (String[] args) {

        //Declared vales
        int x =0;
        int y =0;

        //scanner to take in user input and prompt user input
        Scanner scan = new Scanner(System.in);

        //Prompt user for user input of Y and make value (range is 0-y)
        System.out.print("Enter Y (max value) : ");
        y = scan.nextInt();

        //Print out range and random numbers
        System.out.println(" x= " + x + " random numbers from 0 to y " + y);
        for(int i = 0; i < y; i++) {
            System.out.println((int)(Math.random()*(y+0)));


        }
        //Print out thank you before exiting code.
        System.out.println("Thank You.");
    }
    }
