package Homework1;

public class Obertka {
    // класс обертка

    Integer a;
    //Класс Integer — это класс-обертка примитивного типа int.
    // Внутри данного класса содержится единственное поле типа int.
    Integer aa=1;

    int i=5;
    Integer x = i; //инициализация

    Integer u = new Integer(30);

    Integer aaaa=4;
    Integer bbbb=7;
    Integer cccc=aaaa+bbbb;


    //Byte b = new Byte("New byte");
    Byte bb=1;

    Short c = 4;

    Short cc=2;

    public Long d = 6L;
    Long dd=3L;

    Float f;
    Float ff=4f;

    Double e;
    Double eee=6.0;

    Boolean bt;
    Boolean btt=true;

    Character rr;
    Character rrr=65;


    String hjk;
    //String jkl = new String(jkl);





    public Obertka(Integer a, Integer aa, int i, Integer x) {
        this.a = a;
        this.aa = aa;
        this.i = i;
        this.x = x;
    }

    public Obertka(Long d, Long dd, Float f, Float ff, Double e) {
        this.d = d;
        this.dd = dd;
        this.f = f;
        this.ff = ff;
        this.e = e;
    }

    public Obertka(Integer a) {
        this.a = a;
    }



    public Obertka(){};

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getAa() {
        return aa;
    }

    public void setAa(Integer aa) {
        this.aa = aa;
    }

    public int getI() {
        return i;
    }

    public void setI(int number) {
        i = number;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getU() {
        return u;
    }

    public void setU(Integer u) {
        this.u = u;
    }

    public Integer getAaaa() {
        return aaaa;
    }

    public void setAaaa(Integer aaaa) {
        this.aaaa = aaaa;
    }

    public Integer getBbbb() {
        return bbbb;
    }

    public void setBbbb(Integer bbbb) {
        this.bbbb = bbbb;
    }

    public Integer getCccc() {
        return cccc;
    }

    public void setCccc(Integer cccc) {
        this.cccc = cccc;
    }

    @Override
    public String toString() {
        return "Obertka{" +
                "a=" + a +
                ", aa=" + aa +
                ", i=" + i +
                ", x=" + x +
                ", u=" + u +
                ", aaaa=" + aaaa +
                ", bbbb=" + bbbb +
                ", cccc=" + cccc +
                ", bb=" + bb +
                ", c=" + c +
                ", cc=" + cc +
                ", d=" + d +
                ", dd=" + dd +
                ", f=" + f +
                ", ff=" + ff +
                ", e=" + e +
                ", eee=" + eee +
                ", bt=" + bt +
                ", btt=" + btt +
                ", rr=" + rr +
                ", rrr=" + rrr +
                ", hjk='" + hjk + '\'' +
                '}';
    }

    // public идентификатор доступа, void -  , qwer - название метода должно быть уникальным,
    // в скобочках какой тип данных будет возвращать
    public void qwer(int cccc){
        this.a = cccc;
    }

    //public идентификатор доступа, qwer - название метода должно быть уникальным за искл перегрузки
    //когда принимает в себя разные типы данных/параметры
    public String wert(int г){
        return "sa";
    }

    public String wert(String yy){
        yy = "stringData";
        return "sa";
    }

    public static String f(String y){
        return "gh";
    }

    public static int f(int y){
        return y;
    }


}
