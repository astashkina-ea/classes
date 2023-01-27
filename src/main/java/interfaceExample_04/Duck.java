package interfaceExample_04;

public class Duck extends Animal implements Flying{ //класс Duck расширяет Animal, реализует интерфейс Flying{
    public void fly() {
        System.out.println("Я утка и я лечу");
    }

}
