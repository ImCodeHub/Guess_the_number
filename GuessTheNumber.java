import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
//        System.out.println(randomNumber);
        Scanner scanner = new Scanner(System.in);
        int guess = 0;

        int count = 0;

        char respond = 'y';

        do{
            int randomNumber = random.nextInt(100);
            while (guess != randomNumber) {
                System.out.println("Enter the number you guessed: ");
                guess = scanner.nextInt();

                if (guess == randomNumber) {
                    count++;
                    System.out.println("you have guessed the Correct number");
                    System.out.println("you guessed in " + count + " attempts");
                } else if (guess > randomNumber) {
                    System.out.println("Enter the lower number");
                } else {
                    System.out.println("Enter the higher number");
                }
                count++;
            }
            System.out.println("Do you want to play this game again? Enter (Y/N) for Yes - y & for No - n");
            respond = scanner.next().charAt(0);
        }while (respond == 'y');
        System.out.println("Thanks for this game");
    }
}
