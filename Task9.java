import static java.lang.Math.*;

import java.util.Scanner;

public class Task9 {

    public static int add(int a, int b){
        return addExact(a, b);
    }

    public static int subtract(int a, int b){
        return subtractExact(a, b);
    }

    public static int multiply (int a, int b){
        return multiplyExact(a, b);
    }

    public static float divide(int a, int b){
        return floorDiv(a,b);
    }

    public static void main(String[] args) {

        int a;
        int b;


        Scanner input = new Scanner (System.in);

        System.out.print("Enter first number: ");
        a = input.nextInt();

        System.out.print("Enter second number: ");
        b = input.nextInt();


        System.out.println("Addition: " + add(a, b));
        System.out.println("Subtraction: " + subtract(a, b));
        System.out.println("Multiplication: " + multiply(a, b));
        System.out.println("Division: " + divide(a, b));

        input.close();
    }
    
}
