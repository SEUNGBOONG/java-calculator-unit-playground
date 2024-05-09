package domain;

import java.util.ArrayList;

public class ArithmeticCalculator {

    private static final int INITIAL_RESULT_NUM = 0;
    private static final int INITIAL_NUMBER = 1;

    private final ArrayList<Integer> numbers;
    private int result;

    public ArithmeticCalculator(ArrayList<Integer> numbers) {
        this.numbers = numbers;
        this.result = INITIAL_RESULT_NUM;
    }

    private int plusCalculate() {
        for (Integer number : numbers) {
            result += number;
        }
        return result;
    }

    private int minusCalculate() {
        for (Integer number : numbers) {
            result -= number;
        }
        return result;
    }

    private int divideCalculate() {
        result = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            result /= numbers.get(i);
        }
        return result;
    }

    private int multipleCalculate() {
        result = INITIAL_NUMBER;
        for (Integer number : numbers) {
            result *= number;
        }
        return result;
    }

    public int getPlusResult() {
        return plusCalculate();
    }

    public int getMinusResult() {
        return minusCalculate();
    }

    public int getDivideResult() {
        return divideCalculate();
    }

    public int getMultipleResult() {
        return multipleCalculate();
    }
}
