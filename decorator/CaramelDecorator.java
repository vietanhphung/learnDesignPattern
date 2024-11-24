public class CaramelDecorator extends CondimentDecorator{
    Beverage beverage;
    public CaramelDecorator(Beverage b){
        this.beverage = b;
    }
    public double cost(){
        return this.beverage.cost() + 1;
    }
    public String desc(){
        return this.beverage.desc() + " caramel";
    }
}