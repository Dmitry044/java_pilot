package Homework1;

public class One {

    int a2=-44;
    int a3='a';
    int a4=-2147483648; //min
    int a5=2147483647; //max
    int a6; // не инициализировано еще


    //конструктор/метод создаем сode>generate Название этого конструктора всегда с большой буквы и соотвествует классу.
    //конструктор даже если мы не создаем он все равно есть - срабатывает конструктор по умолчанию
    public One(int a2, int a3, int a4, int a5) {
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
        this.a5 = a5;
    }

    public One(int a2, int a3, int a4) {
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
        this.a5 = a5;
    }

    // конструктор без явного массива
    public One(String... one) {
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
    }


}
