/**
 * Java Basic. Home work #9
 *
 * @author Rinat Dusumov
 * @todo 05.10.2022
 * @date 08.10.2022
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
        //task 3
        Treadmill treadmill = new Treadmill(false, true, true);
        Wall wall = new Wall(true,true,true);
            System.out.println("First member: " + treadmill.firstMember() + ", second participant: " + treadmill.secondParticipant()
                + ", third party: " + treadmill.thirdParty());
            System.out.println("First member: " + wall.firstMember() + ", second participant: " + wall.secondParticipant()
                + ", third party: " + wall.thirdParty());
    }
}