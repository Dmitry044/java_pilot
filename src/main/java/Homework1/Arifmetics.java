package Homework1;

public class Arifmetics {

    public static void main(String[] args) {
        int numOne = 9;
        int numTwo = 4;
        int numThree = 8;
        int numFour = 4;
        float numFloat = 12345f;
        boolean numBoolean = false;
        char numCharA = 'A';
        byte numByte = 127;
        short numShort = 50;
        long numlong = 10L;
        double numDouble = 0.7;
        int increment = numTwo++;
        int incrementBefore = ++numTwo;
        int decrement = numTwo--;
        int decrementBefore = --numTwo;


        int sumAddition = numOne + numTwo + numThree;
        int sumMultiply = numOne * numTwo;
        int sumDivision = numThree / numTwo;
        int sumSubstraction = numOne - numTwo;
        int sumNegative = numTwo - numOne;
        float sumDecimal = numOne / numTwo;
        float sumFloat = numFloat - numOne;
        boolean sumBoolean = false;
        char sumChar = numCharA;
        byte sumByte = numByte;
        short sumShort = numShort;
        long sumLong = numOne + numTwo;
        int sumIncrement = numOne + numOne++;
        int sumIncrementBefore = numOne + ++numOne;
        int sumDecrement = numOne + numOne--;
        int sumDecrementBefore = numOne + --numOne;


        System.out.println("Result addition:  " + sumAddition);
        System.out.println("Result addition2: " + (numOne + numTwo));
        System.out.println("Incorrect result: " + numOne + " " + numTwo);
        System.out.println("Result myltiply: " + sumMultiply);
        System.out.println("Result division: " + sumDivision);
        System.out.println("Result substraction: " + sumSubstraction);
        System.out.println("Result negative: " + sumNegative);
        System.out.println("Result decimal: " + sumDecimal); // округление неправильно работает? нет десятичных
        System.out.println("Result float: " + sumFloat);
        System.out.println("Result boolean: " + sumBoolean);
        System.out.println("Result char: " + numCharA);
        System.out.println("Result byte: " + numByte);
        System.out.println("Result short: " + sumShort);
        System.out.println("Result long: " + sumLong);
        System.out.println("Result increment : " + sumIncrement);
        System.out.println("Result increment before: " + sumIncrementBefore);
        System.out.println("Result decrement: " + sumDecrement);
        System.out.println("Result decrement before: " + sumDecrementBefore);

        if (numOne > numTwo) {
            System.out.println(" Результат nine > two");
        } else {
            System.out.println("Результат неправильный");
        }
        // сравниваем на неравенство

        if (numOne != numTwo) {
            System.out.println("Результат девять не равно два");
        } else {
            System.out.println("The result is not correct");
        }

        //сравниваем на равенство

        if (numFour == numTwo) {
            System.out.println("Результат правильный - равенство");
        }

        // сравниваем несколько условий И - &&
        if (numTwo == numFour && numOne > numThree) {
            System.out.println("Corerct: 4=4 and 9>8");
        }

        // сравниваем несколько условий ИЛИ - ||
        if (numOne == numThree || numOne > numThree) {
            System.out.println("Correct: с условием ИЛИ");
        }


        int little = 20;
        long big = 20;
        big = little;
        little = (int) big;


        }
    }
