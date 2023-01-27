package abstractClassExample_05;

public class Dog extends HomeAnimal{
    public Dog(String name, int age) {
        super(name, age); //super позволяет обратиться к классу родителя и выполнить такой же конструктор как у класса родителя
    }

    public void Say() {
        System.out.println("Гав");
    }
}
