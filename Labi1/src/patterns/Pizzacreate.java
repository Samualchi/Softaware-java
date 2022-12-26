package patterns;

public abstract class Pizzacreate {
    final void preparePizzaDough() {
        System.out.println("Preparing pizza dough with plain flour, dried yeast, caster sugar, salt, olive oil, and warm water.");
    }
    public abstract void  prepareIngredients();
    public abstract void  addToppings();
    void heating() {
        System.out.println("Heating for 10 minutes!");
    }
    public boolean isSaug(){
        return false;
    }
    public boolean isMush() {return false;}
    public boolean isBoth() {return false;}
    public boolean isClosed() {return false;}
    public boolean isclsp() {return false;}
    public boolean isSp(){return false;}
    public void Closingsp() {System.out.println("using more basic ingridients for closed pizza with pepper");}
    public void Closing() {System.out.println("using more basic ingridients for closed pizza");}
    public void addSp() {System.out.println("add pepper");}
    public void addSaug() {System.out.println("add sausage");}
    public void addMu() {System.out.println("add mushrooms");}
    public void addBoth() {System.out.println("add mushrooms and sausage");}




    public void preparePizza() {
        preparePizzaDough();
        if (isClosed()){
            Closing();
        }
        if (isclsp()){
            Closingsp();
        }
        prepareIngredients();
        addToppings();
        if(isSaug()){
            addSaug();
        }
        if(isMush()){
            addMu();
        }
        if(isBoth()){
            addBoth();
        }
        if(isSp()){
            addSp();
        }
        heating();
    }
}

