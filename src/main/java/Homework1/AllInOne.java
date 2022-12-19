package Homework1;

public class AllInOne {
    //ПРИМИТИВНЫЕ ТИПЫ ДАННЫХ

    int a=44, aa_$=123; //Целочисленные цифры

    int a2=-44;
    int a3='a'; // num: 97 пока не понимаю почему такое значение получается
    int a4=-2147483648; //min
    int a5=2147483647; //max
    int a6; // не инициализировано еще

    float bb=0.12345f; //Для дробных чисел. По умолчанию значение 0.0f. Размер 4 байт
    float bb2=12345f;
    float bb3=1;
    float bb4=10;
    float bb5=65436543.555424f;  // float bb6=66.88;  джава не может конвертировать double целые числа во float
    float bb6=1.401298464707e-45f;
    float bb7=3.4028228860e+38f;
    float bb8; // не инициализировано еще

    boolean bbb1=true; // by default false
    boolean bbb2=false;
    boolean bbb3;

    char с1='a';  // 0 to 65,535 (inclusive) https://www.javatpoint.com/char-keyword-in-java
    char c2='A';
    char c3=65; // char1: A
    char c4=97; // char2: a
    int c5=97;
    char cc5 =(char)c5; // cc5: a

    char c6='\u0061'; //:a
    char c7='\u0041'; //:A

    char c8='A';
    //c8=(char)(c8+1); // увеличиваем значение на 1  c8: B

    String str="javatpoint";
    char[] c9=str.toCharArray();
        //System.out.println("String: "+str); //String: javatpoint
        //System.out.println("char: "+Arrays.toString(c9)); //char: [j, a, v, a, t, p, o, i, n, t]

    char c10;

    byte d1=127; //max
    byte d2=-128; //min
    byte d3;


    short dd1=50;  //The short contains minimum value of -32768 and a maximum value of 32767 (inclusive)
    short dd2=-32768;
    short dd3='a'; //97
    short dd4;

    long e1=10L; // L должна быть заглавная
    long e2=-10L;
    long e3='a'; //97
    long e4=-9223372036854775808L; //min
    long e5=9223372036854775807L; //max
    long e6;

    double ee1=0.7;  //Для дробных чисел The double covers a range
    // from 4.94065645841246544e-324d to 1.79769313486231570e+308d (positive or negative).
    double ee2=5; // 5.0
    double ee3=10; //10.0
    double ee4=581216732.323433; //5.81216732323433E8
    double ee5=7.83684987683688; //7.83684987683688
    double ee6=56.34f; //56.34000015258789
    double ee7=34f; //34.0
    double ee8=4.94065645841246544e-324d; //4.9E-324
    double ee9;

    String po;
    //String jk = new String(jk);


    public AllInOne(int a2, int a3, int a4) {
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
    }

    public AllInOne() {

    }
}
