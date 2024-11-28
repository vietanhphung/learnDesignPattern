import java.util.ArrayList;

abstract public class Pizza{
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<String>();

    public String getName(){
        return name;
    }
    public void prepare(){
        System.out.println("Preparing " + name);
    }
    public void pizzaInfo(){
        StringBuffer toppingList = new StringBuffer();
        for (String topping : toppings){
            toppingList.append(topping);
        }
        System.out.println(name+": " + dough + " " + sauce + " " + toppingList.toString());
    }
}