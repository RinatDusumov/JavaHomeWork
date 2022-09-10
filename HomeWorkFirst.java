/**
 * Java Basic. Home work #1
 *
 * @author Rinat Dusumov
 * @todo 05.09.2022
 * @date 09.09.2022
 */

class HomeWorkFirst {
    public static void main(String[] args) {
        int x, y, p, s;
        x = 8; y = 12;
        P = 2 * (x + y);
        S = x * y;
        System.out.printf("Perimeter = %d, area = %d\n", P, S);

        int z, k;
        z = 5; k = 3;
        double h = z * 1.0/ k;
        System.out.printf((z + k) +" "+ (z - k) +" "+ (z * k) +" "+ "%.2f\n", h);

        int[] num = {35, 6, 4, 87, 42};
        System.out.println(num[0] +" "+ num[1] +" "+ num[2] +" "+ num[3] +" "+ num[4]);

        int d = 25;
        int r = d / 2;
        double caloricity = (Math.PI * Math.pow(r, 2)) * 40;
        System.out.printf("The calorie content of pizza is equal to %.2f\n", caloricity);
    }
}