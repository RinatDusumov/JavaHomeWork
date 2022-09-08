/**
 * Java Basic. Home work #1
 *
 * @author Rinat Dusumov
 * @version 9.9.2022
 */

public class HomeWorkFirst {
    public static void main(String[] args) {
        int x, y, P, S;
        x = 8;
        y = 12;
        P = 2 * (x + y);
        S = x * y;
        System.out.printf("Rectangle perimeter = %d\n", P);
        System.out.printf("Rectangle area = %d\n", S);

        int z, k;
        z = 5;
        k = 3;
        System.out.println(z + k);
        System.out.println(z - k);
        System.out.println(z * k);
        System.out.println(z / k);

        int [] number = new int[5];
        number[0] = 35;
        number[1] = 6;
        number[2] = 4;
        number[3] = 87;
        number[4] = 42;
        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);
        System.out.println(number[3]);
        System.out.println(number[4]);

        int l = 25;
        double caloricity = (Math.PI * Math.pow(l/2, 2)) * 40;
        System.out.printf("The calorie content of pizza is equal to %.2f", caloricity);
    }
}