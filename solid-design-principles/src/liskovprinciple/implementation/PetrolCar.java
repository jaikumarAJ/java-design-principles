package liskovprinciple.implementation;

import liskovprinciple.template.FuelBasedVehicle;

public class PetrolCar implements FuelBasedVehicle
{
    @Override
    public void varySpeed()
    {
        System.out.println("Varying speed for a petrol car.");
    }

    @Override
    public void addFuel()
    {
        System.out.println("Adding fuel in a petrol car.");
    }
}
