package objectExample_07;

import java.util.Objects;

public class Boo {
    private Integer i, j; //классы обертки(используют больше оперативной памяти, поэтому если можно использовать примитивный тип).
    // В Java у каждого примитивного типа есть свой брат-близнец — класс-обертка (Wrapper).
    //Переменной класса-обертки можно присваивать значение примитивного типа. Этот процесс называется автоупаковкой (autoboxing).
    //Точно так же переменной примитивного типа можно присваивать объект класса-обертки. Этот процесс называется автораспаковкой (autounboxing).

    private String s;

    public Boo(int i, int j, String s) {
        this.i = i;
        this.j = j;
        this.s = s;
    }

    @Override //для переопределения метода
    public String toString() { // Метод toString служит для получения представления данного объекта в виде строки.
        // При попытке вывести строковое представления какого-нибудь объекта, как правило, будет выводиться полное имя класса.

        return "Boo{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }

    //для сравнения объектов
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // проверяются ссылки сравниваемых объектов - this == o,
        if (o == null || getClass() != o.getClass()) return false; //Метод getClass позволяет получить тип данного объекта
        Boo boo = (Boo) o;

        //если хеш коды равны то и объекты равны
        if(this.hashCode() == boo.hashCode()) return true;

        return i == boo.i && j == boo.j;
    }

    @Override
    public int hashCode() { //Метод hashCode позволяет задать некоторое числовое значение, которое будет соответствовать
        // данному объекту или его хэш-код. По данному числу, например, можно сравнивать объекты.

        return i.hashCode() * 100 + j.hashCode() * 10 + 34343;
    }
}
