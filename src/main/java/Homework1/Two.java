package Homework1;

public class Two {
    char с1='a';  // 0 to 65,535 (inclusive) https://www.javatpoint.com/char-keyword-in-java
    char c2='A';
    char c3=65; // char1: A
    char c4=97; // char2: a

    public Two(char с1) {
        this.с1 = с1;
    }

    public Two(char c2, char c3) {
        this.c2 = c2;
        this.c3 = c3;
    }

    public char getС1() {
        return с1;
    }

    public void setС1(char с1) {
        this.с1 = с1;
    }
}
