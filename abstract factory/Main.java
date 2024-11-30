public class Main {
    public static void main(String[] args) {
        PizzaStore store1 = new NYPizzaStore();
        Pizza pizza1 = store1.orderPizza("cheese");
        System.out.println(pizza1.getPizza());
    }

}