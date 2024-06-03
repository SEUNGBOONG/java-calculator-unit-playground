package Controller;

import Model.Calculate;
import View.InputView;

public class CalculateController {




    public static void run(){
        InputView inputView = new InputView();
        int firstNum = inputView.xNum();
        int secondNum = inputView.yNum();
        Calculate calculate = new Calculate(firstNum,secondNum);

        int result = calculate.multiple(firstNum,secondNum);
        System.out.println(result);
        int result2 = calculate.minus(firstNum,secondNum);
        int result3 = calculate.divide(firstNum,secondNum);
        System.out.println(result2);
        System.out.println(result3);
        int result4 = calculate.plusMethod(firstNum,secondNum);
        System.out.println(result4);
    }

    public static void main(String[] args) {
        CalculateController.run();
    }
}
