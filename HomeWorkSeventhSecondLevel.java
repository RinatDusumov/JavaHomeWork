import java.util.*;
/**
 * Java Basic. Home work #7
 *
 * @author Rinat Dusumov
 * @todo 26.09.2022
 * @date 29.09.2022
 */
public class HomeWorkSeventhSecondLevel {
    public static void main(String[] args) {
        //перебирая элементы по одному
        long startTimeWithoutMethod = System.currentTimeMillis();
        int[] array = new int[500_000];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            if (array[i] == 7) {
                count++;
            }
        }
        System.out.println(count);
        int time1 = (int) (System.currentTimeMillis() - startTimeWithoutMethod);
        //с помощью метода binarySearch()
        System.out.println(time1);
        long startTimeFromTheMethod = System.currentTimeMillis();
        int number = Arrays.binarySearch(array, 7);
        System.out.println((number + ": " + array[number]));
        int time2 = (int) (System.currentTimeMillis() - startTimeFromTheMethod);
        System.out.println(time2);
        if (time1 < time2) {
            System.out.println("Первым способом быстрее");
        } else {
            System.out.println("Вторым способом быстрее");
        }
    }
}