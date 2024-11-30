public abstract interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggie createVeggies();
    public Protein createProtein();
}