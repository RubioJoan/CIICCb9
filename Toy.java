public class Toy {
    String name;
    String brand;
    double price;
    int quantity;

    void setPrice(double price2){
        this.price =price2;
    }
    /* THIS is a
     * multilinep
     * comment
     */

    public static void main(String[] args) {
        Toy toy1 = new Toy();
        toy1.name ="rare pink";
        toy1.brand ="Lab vuvu";
        toy1.price =4500;
        toy1.quantity =12;  
        toy1.setPrice((toy1.price*0.5));
        System.out.println(toy1.price);
        System.out.println(toy1.name);
    }

}
