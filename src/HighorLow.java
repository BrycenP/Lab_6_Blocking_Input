import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class HighorLow {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        Random ran = new Random();
        String trash = "";
        String cont = "";
        int trashInt = 0;
        int randNum = 0;
        int guess = 0;
        boolean valid = false;

        do{
            randNum = ran.nextInt(10)+1;
            do {
                System.out.print("Guess the number 1-10:");
                if (in.hasNextInt()) {
                    guess = in.nextInt();
                    valid = true;
                } else if (in.hasNext()) {
                    trash = in.next();
                    System.out.println("Your guess of " + trash + " is not valid please follow instructions");
                }
            }while (!valid);
            if (1 <= guess && guess <= 10) {
                if (guess == randNum){
                    System.out.println("You guessed right!!!");
                    valid = true;
                }
                else
                {
                    System.out.println("You guessed wrong, the number was " + randNum);
                    valid = false;
                }
            }
            else {
                System.out.println("Your guess of " + guess + " does not fall within the parameters, please follow directions");
                valid = false;
            }
        }while (!valid);
    }
}
