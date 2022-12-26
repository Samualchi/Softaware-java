package patterns;
import patterns.*;

public class Pizza_saug extends Pizzacreate{
    @Override
    public void prepareIngredients() {
        System.out.println("Preparing tomatoes");
    }
    @Override
    public boolean isSaug() {return true;}

    @Override
    public void addToppings() {
        System.out.println("Adding cheese");
    }

}
