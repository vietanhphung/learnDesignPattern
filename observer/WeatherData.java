import java.util.ArrayList;

public class WeatherData implements Subject{
    private ArrayList<Observer> observers;
    private float temp;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        for(Observer observer : observers) {
            observer.update(temp);
        }
    }

    public float getTemp(){
        return temp;
    }

    public void setTemp(float temp){
        this.temp = temp;
        notifyObservers();
    }


   

}