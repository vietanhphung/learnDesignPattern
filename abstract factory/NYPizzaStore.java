public class NYPizzaStore extends PizzaStore{
    Pizza pizza;
    PizzaIngredientFactory factory = new NYPizzaIngredientFactory();
 
    public Pizza createPizza(String type) {
        if (type =="cheese"){
            pizza = new CheesePizza(factory);
        }
    return pizza;
    }
    
}