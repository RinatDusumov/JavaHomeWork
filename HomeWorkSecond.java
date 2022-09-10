/**
 * Java Basic. Home work #2
 *
 * @author Rinat Dusumov
 * @todo 07.09.2022
 * @date 09.09.2022
 */

import javax.swing.text.StyledEditorKit;
import java.util.Scanner;
class HomeWorkSecond {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        // task 1
        System.out.println(checkWeather());
        
        // task 2
        Boolean isWeekend = true;
        Boolean isRain = true;
        System.out.println(canWalk(isWeekend, isRain));
        
        // task 3
        System.out.println("Enter an integer");
        System.out.println("Enter an integer");
        int x = SCANNER.nextInt();
        int y = SCANNER.nextInt();
        System.out.println(getAddition(x, y));
        System.out.println(getSubtraction(x, y));
        System.out.println(getMultiplication(x, y));
        System.out.println(getDivision(x, y));
        
        //task 4
        System.out.println("Enter the number of the day of the week");
        int number = SCANNER.nextInt();
        System.out.println(dayOfWeek(number));
        
        //task 5
        boolean isLidlOpen = false;
        boolean isTescoOpen = true;
        System.out.println(canBuyFood(isLidlOpen, isTescoOpen));
        
        //task 6
        System.out.println("enter the number 'a'");
        double a = SCANNER.nextDouble();
        System.out.println("enter the number 'b'");
        double b = SCANNER.nextDouble();
        System.out.println("enter the number 'c'");
        double c = SCANNER.nextDouble();
        quadraticEquation(a, b, c);
    }
    
        //task 1
    static String checkWeather() {
        System.out.println("Enter the air temperature");
        int temperature = SCANNER.nextInt();
        if(temperature <= 0) {
            return "It's frost";
        } else if (temperature <= 18) {
            return "It's cold";
        } else if (temperature <= 28) {
            return "It's warm";
        } else {
            if (temperature >= 29){
                return "It's hot";
            }
        }
    }
    
        //task 2
    static Boolean canWalk(Boolean isWeekend, Boolean isRain) {
        boolean b = isWeekend ^ !isRain;
            return b;
    }
    
        //task 3
    static int getAddition(int x, int y) {
        int zet = x + y;
        return zet;
    }
    static int getSubtraction(int x, int y) {
        int key = x - y;
        return key;
    }
    static int getMultiplication(int x, int y) {
        int jey = x * y;
        return jey;
    }
    static double getDivision(int x, int y) {
        double si = x / y * 1.0;
        return si;
    }
    
        //task 4
    static String dayOfWeek(int number) {
        switch (number) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Error";
        }
    }
    
        //task 5
    static boolean canBuyFood(boolean isLidlOpen, boolean isTescoOpen) {
        boolean b = (isLidlOpen || isTescoOpen);
            if(isLidlOpen == true) {
                System.out.println("I can buy food in is Lidl open");
            } else if(isTescoOpen == true) {
                System.out.println("I can buy food in is Tesco open");
            } else {
                System.out.println("I can’t buy food");
            }
            return b;
        }
    
        //task 6
    static double quadraticEquation(double a, double b, double c) {
        double d = Math.pow(b, 2) - 4 * a * c;
            if (d >= 0) {
                System.out.println("Discriminant is = " + d);
                double x1 = (-b + Math.sqrt(d)) / 2 * a;
                double x2 = (-b - Math.sqrt(d)) / 2 * a;
                    if((x1 + x2 == -b) && (x1 * x2 == c)) {
                        System.out.println("Number " + x1 + " and "
                            + x2 + " are the roots of the equation");
                }
            } else {
                System.out.println("no roots");
            }
        return 0;
    }
}