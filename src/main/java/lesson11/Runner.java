package lesson11;

import lesson11.animal.Animal;
import lesson11.animal.birds.IBirds;
import lesson11.animal.birds.Popugai;
import lesson11.animal.pet.Cat;

public class Runner {

    public static void main(String[] args) {
        Animal cat = new Cat("blue");

        System.out.println(String.format("Я кошка. У меня цвет глаз %s", cat.getEye()));

        IBirds popugaj = new Popugai("black");
        popugaj.fly();
        ((Animal)popugaj).say();
        System.out.println(String.format("Я попугай. У меня цвет глаз %s", ((Animal)popugaj).getEye()));
    }
}