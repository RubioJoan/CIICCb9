import java.util.ArrayList;
import java.util.List;

public class LambdaL {

    static void print(){
        
    }
    public static void main(String[] args) {
        List <Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("Fish", false, true));
        animals.add(new Animal("Kangaroo", true, false));
    }
    
}

class Animal {
    private String species;
    private boolean canHop;
    private boolean canSwim;

    public static void main(String speciesName, boolean hopper, boolean swimmer) {
        species = speciesName;
        canHop = hopper;
        canSwim = swimmer;
    }
    public boolean canHop(){return canHop;}
    public boolean canSwim () {return canSwim;}
    public String toString(){return species;}

}
public interface  CheckTrait{
    boolean test(Animal a);
    
}
class CheckIfHopper implements CheckTrait{
    public boolean test (Animal a) {
        return a.canHop();
    }
}
