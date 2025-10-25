public class WaterBottle {
    private String brand;
    private boolean empty;
    public static void main(String[] args) {
        WaterBottle wb = new WaterBottle();
        System.out.println("Empty =" +wb.empty);
        System.out.println(",Brand ="+wb.empty);
    }

    public class Rabbit {
     public static void main(String[] args) {
          Rabbit one = new Rabbit();
          Rabbit two = new Rabbit();
           Rabbit three = one;
          one = null;
           Rabbit four = one;
            three = null;
          two = null;
         two = new Rabbit();
        System.gc();
} }
}
