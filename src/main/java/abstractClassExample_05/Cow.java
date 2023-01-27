package abstractClassExample_05;

public class Cow extends HomeAnimal{
    public Cow(String name, int age) {
        super(name, age); //super позволяет обратиться к классу родителя и выполнить такой же конструктор как у класса родителя
    }

    public void Say() {
        System.out.println("Му");
    }
}
