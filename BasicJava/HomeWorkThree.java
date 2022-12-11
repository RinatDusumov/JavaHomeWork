/**
 * Java Basic. Home work #3
 *
 * @author Rinat Dusumov
 * @todo 12.09.2022
 * @date 16.09.2022
 */

class HomeWorkThree {
    public static void main(String[] args) {
        //task 1
        int[] arrayNumbers = {56, 43, 89, 3, 43, 7};
        printArray(arrayNumbers);
        //task 2
        int[] maxArray = {34, 2, 45, 6, 71, 52};
        System.out.println(getMax(maxArray));
        //task 3
        int[] numbers = {0, 1, 1, 0, 1, 0, 0};
        int[] array = invertArray(numbers);
        for (int i = 0; i < invertArray(array).length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //task 1
    static void printArray(int[] arrayNambers) {
        System.out.print("[");
        for (int i = 0; i < arrayNambers.length; i++) {
            System.out.print(arrayNambers[i]);
            if (i < arrayNambers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    //task 2
    static int getMax(int[] maxArray) {
        int max = maxArray[0];
        for (int i = 0; i < maxArray.length; i++) {
            if (maxArray[i] > max) {
                max = maxArray[i];
            }
        }
        return max;
    }
    //task 3
    static int[] invertArray(int[] numbers) {
        int[] array = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
        return array;
    }
}