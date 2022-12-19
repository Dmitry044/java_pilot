package Homework1;

public class Runner {
    //инициализируем объекты/классы
    One one;
    //AllInOne allInOne;  // экземпляры класса AllInOne - класс/объект allInOne - экземпляр

    AllInOne allInOne = new AllInOne();
    // инициализируем объект/клас и сразу определяем переменные
    //new - создан новый экземпляр класса AllInOne
    // в скобочках обращаемся к конструктору




    public static void main(String[] args) {
        Obertka obertkaInstance = new Obertka(1,2,3,5);
        obertkaInstance.d = 77L;

        Obertka obertkaInstance2 = new Obertka(2,4,6,8);
        obertkaInstance2.d = 88L;
        System.out.println("Result of A " + obertkaInstance2.getA() );
        System.out.println("Result String: " + obertkaInstance2.getA()+ " , " + obertkaInstance2.getAa());

        Obertka obertkaInstance3 = new Obertka();
        obertkaInstance3.setAaaa(7);
        System.out.println(obertkaInstance3.getAaaa());

        Obertka obertkaInstance4 = new Obertka(obertkaInstance.a);
        obertkaInstance4.setAaaa(44);
        System.out.println("SetAaaa 44 result" + obertkaInstance4.getAaaa());


        }

        EnumExample en = EnumExample.april; // использование Enam




    }





