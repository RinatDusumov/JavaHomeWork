public class Robot implements Action {
    public String jog() {
        return "Robot running";
    }

    @Override
    public String bounce() {
        return "robot jumping";
    }
}