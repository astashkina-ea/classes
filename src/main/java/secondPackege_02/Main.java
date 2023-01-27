package secondPackege_02;

import firstPackage_01.SomeClass;

public class Main {
    public static void main(String[] args) {
        SomeClass foo = new SomeClass();
        //foo.k = 10; не видно из текущего класса тк переменная является protected
        foo.i = 11;
        //foo.j = 11; не видно из текущего класса тк переменная является private
    }
}
