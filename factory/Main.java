public class Main{
    public static void main(String[] args) {
        PizzaStore  newyork1 = new NYPizzaStore();
        Pizza pizza1 = newyork1.orderPizza("cheese");
        pizza1.pizzaInfo();
        
        PizzaStore chicago1 = new ChicagoPizzaStore();
        Pizza pizza2 = chicago1.orderPizza("pepperoni");
        pizza2.pizzaInfo();
    }
}