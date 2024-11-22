
public class RobotDuck extends Duck{
    public RobotDuck(){
        setFlyBehavior(new RocketFly());
        setQuackBehavior(new MuteQuack());
    }
    public void display(){
        System.out.println("I am a robot duck");
    }
}