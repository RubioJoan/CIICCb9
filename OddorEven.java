import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input = scanner.nextInt();

        System.out.println("You entered : " + input);

        if (input == 0) {
            System.out.println("The number you entered is ZERO!");
            
        } else {
            if (input > 0 ) {
                System.out.println("The number you entered is POSITIVE");
            }else {
                System.out.println("The number you entered is NEGATIVE!");
            }
            if (input % 2 == 0) {
                System.out.println("The number you entered is " + input + " : an EVEN number!");
            }else {
                System.out.println("The number you entered is " + input + " : an ODD number!");
            }

        } 
        scanner.close();;
        
    }
    
}
