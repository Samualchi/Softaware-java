package patterns;
import patterns.*;

public class musaug_cl extends Pizzacreate{
    @Override
    public boolean isClosed() {return true;}
    @Override
    public void prepareIngredients() {
        System.out.println("Preparing tomatoes");
    }
    @Override
    public boolean isSaug(){return true;}
    @Override
    public boolean isMush() {return true;}

    @Override
    public void addToppings() {
        System.out.println("Adding cheese");
    }
}
