package Task13;
 
class Afritada {
  public void showIngredients() {
    String[] Ingredients = {"Tomato Sauce","Meat"};
    System.out.println("\nAfritada = "+java.util.Arrays.toString(Ingredients)+"🍲 \n");
  }
}
class Mechado extends Afritada{
  public void showIngredients(){
    String[] Ingredients = {"Tomato Sauce", "Meat", "Potatoes & Carrots", "Tomato Paste"};
    System.out.println("Mechado = " +java.util.Arrays.toString(Ingredients)+ "🍲 \n");
  }
}
class Menudo extends Afritada {
  public void showIngredients(){
    String[] Ingredients = 
    {"Tomato Sauce", "Meat", "Potatoes & Carrots", "Liver Spread", "Raisins", "Hotdog"};
    System.out.println("Menudo =" +java.util.Arrays.toString(Ingredients)+ "🍲 \n");
  }
}

class Caldereta extends Afritada {
  public void showIngredients() {
    String[] Ingredients = 
      {"Tomato Sauce",
       "Meat",
       "Potatoes & Carrots",
       "Tomato Paste",
       "Liver Spread",
       "Raisins",
       "Hotdog",
       "Siling Labuyo",
       "Cheese"};
    System.out.println("Caldereta = "+java.util.Arrays.toString(Ingredients)+"🍲 \n");
  }
}

public class Task131 {
    public static void main(String[] args) {
        Afritada meal1 = new Afritada();
        Mechado meal2 = new Mechado();
        Menudo meal3 = new Menudo();
        Caldereta meal4 = new Caldereta();

        meal1.showIngredients();
        meal2.showIngredients();
        meal3.showIngredients();
        meal4.showIngredients();

    }
}
