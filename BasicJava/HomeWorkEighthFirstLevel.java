import java.util.*;

/**
 * Java Basic. Home work #8
 *
 * @author Rinat Dusumov
 * @todo 28.09.2022
 * @date 01.10.2022
 */
public class HomeWork1 {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "red", 2, 1, false);
        System.out.println(cat);
        System.out.println("Try to play: " + cat.play());
        cat.feed();
        System.out.println("Try to play: " + cat.play());
        System.out.println("Try to play: " + cat.play());
        cat.feed();
        System.out.println("Try to jump: " + cat.jump(1));
        cat.feed();
        System.out.println(("Try to jump: " + cat.jump(2)));
    }
}