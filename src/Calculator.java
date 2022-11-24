import java.util.Scanner;

public class Calculator{
    private double a;
    private double b;

    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }
public double aAddb(){
        return a+b;
}
public double aSubtractb(){
        return a-b;
}
public double aMulitplyb(){
        return a*b;
}
public double aDivideb(){
        return a/b;
}
    }







