package liskovprinciple;

import liskovprinciple.implementation.ElectricCar;
import liskovprinciple.implementation.PetrolCar;
import liskovprinciple.template.ElectricVehicle;
import liskovprinciple.template.FuelBasedVehicle;


public class Runner
{
    public static void main(String[] args)
    {
        ElectricVehicle electricCar = new ElectricCar();

        electricCar.varySpeed();
        electricCar.chargeBattery();

        FuelBasedVehicle petrolCar = new PetrolCar();

        petrolCar.varySpeed();
        petrolCar.addFuel();
    }
}
