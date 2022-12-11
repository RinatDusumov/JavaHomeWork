public class Animal {
    protected String name;
    protected String color;
    protected int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String toString() {
        return "Name = " + name +
                ", color = " + color +
                ", age = " + age;
    }
}