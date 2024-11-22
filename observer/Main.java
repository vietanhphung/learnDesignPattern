public class Main{
    public static void main(String[] args){
        WeatherData wd = new WeatherData();
        DualDisplay  d = new DualDisplay(wd);
        wd.setTemp(32);
        

    }
}