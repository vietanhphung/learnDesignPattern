public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    public NYPizzaIngredientFactory(){};
    public Dough createDough(){
        return new NYDough();
    }
    public Sauce createSauce(){
        return new NYSauce();
    }
    public Veggie createVeggies(){
        return new NYVeggie();
    }
    public Cheese createCheese(){
        return new NYCheese();
    }
    public Protein createProtein() {
        return new NYProtein();
    }
}