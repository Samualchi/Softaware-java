package patterns;
import patterns.*;

public class Spmar extends Pizzacreate {
    @Override
    public void prepareIngredients() {
        System.out.println("Preparing tomatoes");
    }

    @Override
    public boolean isSp() {
        return true;
    }

    @Override
    public boolean isSaug() {
        return true;
    }

    @Override
    public void addToppings() {
        System.out.println("Adding cheese");
    }
}
