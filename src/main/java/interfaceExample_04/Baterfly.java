package interfaceExample_04;

public class Baterfly extends Bugs implements Flying {
    @Override
    public void fly() {
        System.out.println("Я бабочка и я лечу");
    }
}
