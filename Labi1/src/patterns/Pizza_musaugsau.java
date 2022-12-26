package patterns;
import patterns.*;

public class Pizza_musaugsau extends Pizzacreate{
    @Override
    public void prepareIngredients() {
        System.out.println("Preparing tomatoes");
    }
    @Override
    public boolean isSp(){return true;}
    @Override
    public boolean isSaug(){return true;}
    @Override
    public boolean isMush() {return true;}

    @Override
    public void addToppings() {
        System.out.println("Adding cheese");
    }
}
