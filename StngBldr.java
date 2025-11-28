import java.util.Scanner;

public class StngBldr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string of at least 10 characters: ");
        StringBuilder input = new StringBuilder (scanner.nextLine());

        if (input.length() >= 10) {
            System.out.println("You entered: " + input);
        } else {
            System.out.println("Sorry, the inputted string is less than 10");
        return;

    }

    //Print the length of the string
    System.out.println("\n1. The length of the string is : " + input.length());

    //First Character
    System.out.println("\n2. The First character of the string is :" + input.charAt(0));

    //Last Character
    System.out.println("\n3. The last character of the string is : " + input.charAt(input.length()-1));

    //first occurence of a
    //System.out.println("\n4. The Index of first 'a' is : " + input.indexOf("a"));

    //or
    int index = input.indexOf("a");
    if (index != -1) {
        System.out.println("\n4. The index of first 'a' in the string is : " + index);
    } else{
        System.out.println("\n4. No 'a' in the string.");
    }

    //substring from index 3 to 6
    System.out.println("\n5. The substring from index 3 to 6 is : " + input.substring(3, 6));

    //append the string 123 to the end
    //System.out.println("\n6. Appending string 123 to end: " + input.append("123"));

    input.append("123");
    System.out.println("\n6. Appending string 123 to end "+ input);

    //inserting xyz at index 4
    System.out.println("\n7. Inserting xyz at index 4 : "+ input.insert(4, "xyz"));

    //delete substring from index 2 to 4
    System.out.println("\n8. Deleting substring from index 2 to 4: " + input.delete(2, 4));

    //delete the character at index 8
    System.out.println("\n9. Deleting character at index 8: "+ input.deleteCharAt(8));

    //reverse the string
    System.out.println("\n10. Reversing the inputted string : " + input.reverse());
    }

}
