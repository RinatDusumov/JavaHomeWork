public class CatTwo extends Animal implements IAnimal {
    public CatTwo(String name, String color, int age) {
        super(name, color, age);
    }
    public String voice() {
        return "meow";
    }
}