import java.util.Random;
import java.util.Scanner;

public class Numbergame {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scn = new Scanner(System.in);
        int randomnumber = rand.nextInt(100) + 1;
        System.out.println("Enter Your Randomm Number is : " + randomnumber);
        while (true) {
            System.out.println("Hey User Enter Your Guess Number(1-100) : ");

            int nameGuess = scn.nextInt();
            if (nameGuess == randomnumber) {
                System.out.println(" CORRECT YOU ARE WIN !");
                break;

            } else if (randomnumber > nameGuess) {
                System.out.println("NOPE THE NUMBER IS HIGHER . PLESE GUESS AGAIN NOW ");
            } else {
                System.out.println("THE NUMBER IS LOWER GUESS AGAIN");
            }
        }

    }

    Scanner close;

}
