import java.util.Random;
import java.util.Scanner;
/**
 * Java Basic. Home work #4
 *
 * @author Rinat Dusumov
 * @todo 14.09.2022
 * @date 16.09.2022
 */
public class HomeWorkFourth {
    //task 1,2
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        Random random = new Random();
        int count = 0;
        int number = 0;
        int guess = -1;
        number = random.nextInt(10);
        System.out.print("Play? Yes - Enter yes, No - Enter no: ");
        String str = SCANNER.nextLine();
        if(str.equalsIgnoreCase("Yes")) {
            while (count < 3 && guess != number) {
                System.out.println("Guess the number [0-9]: ");
                guess = SCANNER.nextInt();
                if (guess < number) {
                    System.out.println("Your number is less");
                } else if (guess > number) {
                    System.out.println("Your number is bigger");
                } else {
                    System.out.println("You WIN, you guess my number");
                    break;
                }

                if (number != guess) {
                    System.out.println("You lose");
                    count++;
                }
                if (count == 3) {
                    System.out.print("Repeat game? Yes - Enter yes, No - Enter no: ");
                    if (SCANNER.next().equalsIgnoreCase("yes")) {
                        count = 0;
                    }
                }
            }
        } else if (str.equalsIgnoreCase("No")) {
            System.out.println("Thanks for playing");
        }
    }
}