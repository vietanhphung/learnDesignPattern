public class Main{
    public static void main(String[] args) {
        Beverage beverage1 = new Espresso() ;
        beverage1 = new CaramelDecorator(beverage1);
        beverage1 = new CaramelDecorator(beverage1);
        System.out.println(beverage1.desc());
        System.out.println(beverage1.cost());
    }
}