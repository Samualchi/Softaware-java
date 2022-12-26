package patterns;
import patterns.*;

public class musau_cl extends Pizzacreate{
    @Override
    public boolean isClosed() {return true;}
    @Override
    public void prepareIngredients() {
        System.out.println("Preparing tomatoes");
    }
    @Override
    public boolean isSp(){return true;}
    @Override
    public boolean isMush() {return true;}

    @Override
    public void addToppings() {
        System.out.println("Adding cheese");
    }
}
