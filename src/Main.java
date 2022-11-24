import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner (System.in);
        System.out.println("Enter first number");
        double a= scanner.nextDouble();
        System.out.println("Enter second number");
        double b= scanner.nextDouble();

        System.out.println("What operation do you want to perform? 1.add, 2.subtract, 3.multiply, 4.divide");
        int operation= scanner.nextInt();
        Calculator numbers=new Calculator(a,b);
        numbers.setA(a);
        numbers.setB(b);
        switch (operation)
        {
            case 1:System.out.println(numbers.aAddb());
            break;
            case 2:System.out.println(numbers.aSubtractb());
            break;
            case 3:System.out.println(numbers.aMulitplyb());
            break;
            case 4:System.out.println(numbers.aDivideb());


        }
    }
}

