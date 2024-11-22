public class DualDisplay implements Observer, Display{
    
    private WeatherData  weatherData;
    private float  celsius;
    private float fahrenhieit;

    public  DualDisplay(WeatherData wd){
        this.weatherData = wd;
        weatherData.addObserver(this);
    }

    public void update(float temp){
        celsius = computeCelsius(temp);
        fahrenhieit = temp;
        display();
    }

    private float computeCelsius(float temp) {
        return (5.0f / 9.0f) * (temp - 32);
    }
    

    public void display(){
        System.out.println("Temp in F is: " +  this.fahrenhieit + ", in C is: " + celsius);
    }

}