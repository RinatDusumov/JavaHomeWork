import java.util.Random;
import java.util.Scanner;
/**
 * Java Basic. Home work #5
 *
 * @author Rinat Dusumov
 * @todo 19.09.2022
 * @date 21.09.2022
 */
public class HomeWorkFifth {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String[] words = {"door", "week", "food"};
        String word = words[random.nextInt(words.length)];
        char[] mask = {'#', '#', '#', '#'};
        int counter = 0;
        do {
            counter++;
            System.out.println("Guess the word: [" + new String(mask) + "]: ");
            char letter = scanner.next().charAt(0);
            for (int i = 0; i < word.length(); i++) {
                if (letter == word.charAt(i) && mask[i] == '#') {
                    mask[i] = letter;
                }
            }
        } while (counter < 5);
        System.out.println("You guess the word [" + word + "], attempts: " + counter);
    }
}