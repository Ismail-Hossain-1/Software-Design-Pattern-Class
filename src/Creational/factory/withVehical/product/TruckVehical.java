package Creational.factory.withVehical.product;

import Creational.factory.withVehical.factory.Truck;
import Creational.factory.withVehical.factory.Vehical;

public class TruckVehical extends VehicalProduct{
    @Override
    public Vehical createVehical() {
        return new Truck();
    }
}
