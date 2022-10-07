public class Human implements Action {
    @Override
    public String jog() {
        return "Man running";
    }

    @Override
    public String bounce() {
        return "man jumping";
    }
}
