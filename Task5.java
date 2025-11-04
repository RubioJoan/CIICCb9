import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        short num1;
        short num2;
        short num3;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = input.nextShort();

        System.out.print("Enter the second number: ");
        num2 = input.nextShort();

        System.out.print("Emter the third number: ");
        num3 = input.nextShort();

        if (num1 == num2 && num2 == num3) {
            System.out.println("\n All numbers are equal!");
            
        }else {
            short largest = num1;

            if (num2 > largest) {
                largest = num2;
                
            }
            if (num3 > largest) {
                largest = num3;
                
            }
            System.out.println("\n The largest number is: " + largest);
        }
        input.close();

    }
    
}
