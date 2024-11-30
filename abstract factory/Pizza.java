public abstract class Pizza {
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Veggie veggie;
    Protein protein;
    public String getPizza(){
        return (dough.getDough() + sauce.getSauce() + cheese.getCheese() + veggie.getVeggies() + protein.getProtein());
    }
    abstract void prepare();

    
}