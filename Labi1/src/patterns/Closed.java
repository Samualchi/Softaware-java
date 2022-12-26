package patterns;
import patterns.*;

public class Closed extends Pizzacreate {
    @Override
    public boolean isClosed() {return true;}
    @Override
    public void prepareIngredients() {
        System.out.println("Preparing tomatoes");
    }

    @Override
    public void addToppings() {
        System.out.println("Adding cheese");
    }
}
