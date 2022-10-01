/**
 * Java Basic. Home work #8
 *
 * @author Rinat Dusumov
 * @todo 28.09.2022
 * @date 01.10.2022
 */
public class HomeWork {
    public static void main(String[] args) {
        Car car = new Car(true, true, false,
                 false, false, false, false);
        car.clampingTheClutch();
        System.out.println("педаль газа зажата: " + car.giveGas());
        car.clutchRelease();
        System.out.println("Газ отпущен, педаль тормоза зажата: " + car.braking());
        car.ignitionOff();
    }
}