package observerpattern;

import observerpattern.entity.WeatherObserver;
import observerpattern.entity.WeatherStation;

public class Runner
{
    public static void main(String[] args)
    {
        WeatherStation weatherStation = new WeatherStation();
        WeatherObserver weatherObserver = new WeatherObserver(weatherStation);

        weatherStation.setHumidity(100);
        weatherStation.setPressure(200);
        weatherStation.setTemperature(300);
    }
}
