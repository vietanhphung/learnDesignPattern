public class ChicagoPizzaStore extends PizzaStore{
    Pizza pizza;
    public Pizza createPizza(String type){
        if (type =="cheese"){
            pizza = new ChicagoCheesePizza();
        }
        else if (type == "pepperoni"){
            pizza = new ChicagoCheesePizza();
        }
        return pizza;
    }
}