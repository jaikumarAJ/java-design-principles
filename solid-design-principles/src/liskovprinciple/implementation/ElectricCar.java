package liskovprinciple.implementation;

import liskovprinciple.template.ElectricVehicle;

public class ElectricCar implements ElectricVehicle
{
    @Override
    public void varySpeed()
    {
        System.out.println("Varying speed for an electric car.");
    }

    @Override
    public void chargeBattery()
    {
        System.out.println("Adding fuel in an electric car.");
    }
}
