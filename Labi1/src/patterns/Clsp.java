package patterns;
import  patterns.*;

public class Clsp extends Pizzacreate{
    @Override
    public boolean isclsp() {return true;}
    @Override
    public void prepareIngredients() {
        System.out.println("Preparing tomatoes");
    }
    @Override
    public boolean isSp(){return true;}

    @Override
    public void addToppings() {
        System.out.println("Adding cheese");
    }

}
