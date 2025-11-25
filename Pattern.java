public class Pattern {
    public static void main(String[] args) {
        int rows = 4;


        for (int i = 1; i <= rows; i++){

            for (int s = 1; s <= rows; s++){
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++){
            System.out.print(i);
        }

        System.out.println();

        }
    }
   
}
