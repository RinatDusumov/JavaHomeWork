/**
 * Java Basic. Home work #9
 *
 * @author Rinat Dusumov
 * @todo 05.10.2022
 * @date 07.10.2022
 */
public class HomeWork {
    public static void main(String[] args) {
        //task 1
        CatTwo cat = new CatTwo("Barsik", "red", 2);
        Dog dog = new Dog("Polkan", "black", 5);
        IAnimal[] animals = {cat, dog};
        for (IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.voice());
        }
        //task 2
        Human human = new Human();
            System.out.println(human.jog().concat(", " + human.bounce()));
        CatThree catTwo = new CatThree();
            System.out.println(catTwo.jog().concat(", " + catTwo.bounce()));
        Robot robot = new Robot();
            System.out.println(robot.jog().concat(", " + robot.bounce()));
    }
}