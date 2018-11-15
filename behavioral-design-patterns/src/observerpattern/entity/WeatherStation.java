package observerpattern.entity;

import observerpattern.observer.Observer;
import observerpattern.subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject
{
    private int pressure;
    private int temperature;
    private int humidity;
    private List<Observer> observers;

    public WeatherStation()
    {
        this.observers = new ArrayList<>(); //avoids nullPointerException
    }

    public int getPressure()
    {
        return pressure;
    }

    public void setPressure(int pressure)
    {
        this.pressure = pressure;
        notifyAllObservers();
    }

    public int getTemperature()
    {
        return temperature;
    }

    public void setTemperature(int temperature)
    {
        this.temperature = temperature;
        notifyAllObservers();
    }

    public int getHumidity()
    {
        return humidity;
    }

    public void setHumidity(int humidity)
    {
        this.humidity = humidity;
        notifyAllObservers();
    }

    @Override
    public void addObserver(Observer o)
    {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o)
    {
        observers.remove(o);
    }

    @Override
    public void notifyAllObservers()
    {
        for (Observer o : observers)
        {
            o.update(pressure, temperature, humidity);
        }
    }
}
