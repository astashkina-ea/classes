package objectExample_07;

public class Main {
    public static void main(String[] args) {

        Boo foo = new Boo(1,2, "f");
        Boo foo2 = new Boo(1,2, "r");
        Boo foo3 = new Boo(2,2, "g");

        System.out.println(foo.toString());
        System.out.println(foo.equals(foo2)); //true но если бы мы не переопределили  бы equals вернулось бы false
        System.out.println(foo.equals(foo3)); //false

        Integer i = new Integer(3);
        Integer j = 3; //тоже самое ^
    }
}
