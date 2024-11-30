public abstract class PizzaStore{
    abstract Pizza createPizza(String type);
    public Pizza orderPizza(String type){
        Pizza pizza = createPizza( type);
        pizza.prepare();
        return pizza;
    }
}