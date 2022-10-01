public class Car {
    boolean isGasoline, batteryIsCharged, ignition;
    boolean gasPedal, brakePedal, toBrake, clutch;
    public Car(boolean isGasoline, boolean batteryIsCharged, boolean gasPedal,
               boolean brakePedal, boolean toBrake, boolean ignition, boolean clutch) {
        this.isGasoline = isGasoline;
        this.batteryIsCharged = batteryIsCharged;
        this.gasPedal = gasPedal;
        this.brakePedal = brakePedal;
        this.toBrake = toBrake;
        this.ignition = ignition;
        this.clutch = clutch;
    }
    public void clampingTheClutch() {
        if (ignitionOn()) {
            clutch = true;
            System.out.println("Сцепление зажато");
        }
    }
    public boolean ignitionOn() {
        if (isGasoline && batteryIsCharged) {
            ignition = true;
            System.out.println("Включено зажигание");
            return true;
        } else {
            System.out.println("Машина не готова к эксплуатации");
            return false;
        }
    }
    public boolean giveGas() {
        gasPedal = true;
        return true;
    }
    public void clutchRelease() {
        clutch = false;
        System.out.println("Сцепление отжато");
    }
    public boolean braking() {
        gasPedal = false;
        brakePedal = true;
        return true;
    }
    public void ignitionOff() {
        ignition = false;
        System.out.println("Зажигание выключено");
    }
}