import java.util.Scanner;

public class Task7 {

    static int add (int a, int b){
        return a + b;
    }

    static int subtract (int a, int b){
        return a - b;
    }

    static int multiply (int a, int b){
        return a * b;
    }
    
    static double divide (int a, int b){
        return (double) a/b;
    }

    public static void main(String[] args) {

        int a;
        int b;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: " );
        a = input.nextInt();

        System.out.print("Enter second number: ");
        b = input.nextInt();

        System.out.println("\nPERFORMING 4 BASIC ARITHMETIC OPERATIONS");
        System.out.println("\nADDITION: " + add(a, b));
        System.out.println("SUBTRACTION: " + subtract(a, b));
        System.out.println("MULTIPLICATION: "+ multiply(a, b));

        if (b != 0) {
            System.out.println("DIVISION: " + divide(a, b));
        }

    input.close();
    
    }
    

}
