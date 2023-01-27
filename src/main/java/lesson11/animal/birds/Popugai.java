package lesson11.animal.birds;

import lesson11.animal.Animal;

public class Popugai extends Animal implements IBirds {

    public Popugai(String eye) {
        super(eye);
    }

    @Override
    public void say() {
        System.out.println("Привет мир");
    }

    @Override
    public void fly() {
        System.out.println("Лечууу");
    }
}
