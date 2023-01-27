package lesson11.animal.pet;

import lesson11.animal.Animal;

public class Cat extends Animal {

    public Cat(String eye) {
        super(eye);
    }

    @Override
    public void say() {
        System.out.println("Мяу");
    }
}
