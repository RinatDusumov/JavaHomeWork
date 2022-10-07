/**
 * Java Basic. Home work #9
 *
 * @author Rinat Dusumov
 * @todo 05.10.2022
 * @date 07.10.2022
 */
public class HomeWork {
    public static void main(String[] args) {
        CatTwo cat = new CatTwo("Barsik", "red", 2);
        Dog dog = new Dog("Polkan", "black", 5);
        IAnimal[] animals = {cat, dog};
        for (IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.voice());
        }
    }
}