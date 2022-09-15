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
        int[] array = {56, 43, 89, 3, 43, 7};
        printArray(array);
            //task 2
        int[] maxArray = {34, 2, 45, 6, 71, 52};
        System.out.println(getMax(maxArray));
            //task 3
        int[] numbers = {0, 1, 1, 0, 1, 0, 0};
        System.out.println(invertArray(numbers));
    }
    
            //task 1
    static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
            //task 2
    static int getMax(int[] maxArray) {
        int max = maxArray[0];
        for (int i = 1; i < maxArray.length; i++) {
            if (maxArray[i] > max) {
                max = maxArray[i];
            }
        }
        return max;
    }
            //task 3
    static int[] invertArray(int[] numbers) {
        int[] replacementOfDigits = new int[numbers.length];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                replacementOfDigits[i] = 0;
            } else {
                replacementOfDigits[i] = 1;
            }
        }
        return replacementOfDigits;
    }
}