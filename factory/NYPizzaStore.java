public class NYPizzaStore extends PizzaStore{
    Pizza pizza;
    public Pizza createPizza(String type){
        if (type =="cheese"){
            pizza = new NYCheesePizza();
        }
        else if (type == "pepperoni"){
            pizza = new NYPepperoniPizza();
        }
        return pizza;
    }

}