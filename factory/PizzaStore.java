abstract class PizzaStore{

    abstract Pizza createPizza(String type);
    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        System.out.println("order and prepare " + pizza.getName() );
        return pizza;
    };
}