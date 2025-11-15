import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        StringBuilder pal = new StringBuilder(input);
        String reversed = pal.reverse().toString();

        if (input.equals(reversed)) {
             System.out.println("The input string is palindrome");
        }else{
        System.out.println("The input string is not palindrome");
        }
        scanner.close();
    }
}
