public class CheesePizza extends Pizza{
    PizzaIngredientFactory factory;
    public CheesePizza(PizzaIngredientFactory factory){
        this.factory = factory;
    }
    void prepare(){
        System.out.println("Preparing Cheese pizza");
        dough = factory.createDough();
        cheese = factory.createCheese();
        sauce = factory.createSauce();
        veggie = factory.createVeggies();
        protein = factory.createProtein();
    }
}