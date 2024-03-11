package Creational.factory.withVehical.product;

import Creational.factory.withVehical.factory.Car;
import Creational.factory.withVehical.factory.Vehical;

public class CarVehical extends VehicalProduct{
    @Override
    public Vehical createVehical() {
        return new Car();
    }
}
