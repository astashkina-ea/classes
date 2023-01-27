package classesExample_03;

public class ClassExample {

    //Класс — в объектно-ориентированном программировании, представляет собой шаблон для создания объектов,
    // обеспечивающий начальные значения состояний: инициализация полей-переменных и реализация поведения функций или методов.

    //у класса есть поля - переменные, обычно их делают приватными
    private int i;
    private int j;
    private String s;

    //контсрукторы - нужен для первичного обогощения данными класса, имеет тоже название что и названиекласса,
    // позволяет объявить первичное состояние объекта
    public ClassExample(int i1, int j, String s) {
        i = i1; //this - говорит обратись к экземпляру класса с которым ты работаешь
        this.j = j;
        this.s = s;
    }
    public ClassExample(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public ClassExample() {
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}
