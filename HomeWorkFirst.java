/**
 * Java Basic. Home work #1
 *
 * @author Rinat Dusumov
 * @version 9.9.2022
 */

public class HomeWorkFirst {
    public static void main(String[] args) {
        int x, y, P, S;
        x = 8; y = 12;
        P = 2 * (x + y);
        S = x * y;
        System.out.printf("Perimeter = %d, area = %d\n", P, S);

        int z, k;
        z = 5; k = 3;
        System.out.println((z + k) +" "+ (z - k) +" "+ (z * k) +" "+ (z / k));

        int [] num = {35, 6, 4, 87, 42};
        System.out.println(num[0] +" "+ num[1] +" "+ num[2] +" "+ num[3] +" "+ num[4]);

        int l = 25;
        double caloricity = (Math.PI * Math.pow(l/2, 2)) * 40;
        System.out.printf("The calorie content of pizza is equal to %.2f", caloricity);
    }
}