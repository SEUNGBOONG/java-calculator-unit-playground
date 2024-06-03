package View;
import java.util.Scanner;

public class InputView {

    private final Scanner scanner = new Scanner(System.in);


    public int xNum(){
        System.out.println();
        return scanner.nextInt();
    }
    public int yNum(){
        System.out.println();
        return scanner.nextInt();
    }
}


