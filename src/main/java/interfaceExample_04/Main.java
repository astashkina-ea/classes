package interfaceExample_04;

public class Main {
    public static void main(String[] args) {
        Flying v1 = new Baterfly(); //мы объявляем переменную типа Flying, которая  является интерфейсом,
        // но создать экземпляр не можем, тк нет реализации Flying
        //поэтому мы можем ему присвоить люб др класс который реализуют данный метод
        Flying v2 = new Duck();
        v1.fly();
        v2.fly();

        Baterfly b1 = new Baterfly();
        b1.fly();
        b1.eat();
    }
}
