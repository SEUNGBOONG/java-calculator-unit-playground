package Model;

public class Calculate {

    public Calculate(int x,int y) {
        int plus1 = plusMethod(x, y);
    }

    public int plusMethod(int x, int y){
        return x+y;
    }

    public int minus(int x, int y) {
        return x - y;
    }

    public int multiple(int x, int y) {
        return x * y;
    }

    public int divide(int x, int y) {
        return x / y;
    }

    String a ="3";
}
