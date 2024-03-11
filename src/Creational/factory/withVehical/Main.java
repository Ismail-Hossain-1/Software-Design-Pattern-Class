package Creational.factory.withVehical;

import Creational.factory.withVehical.factory.Truck;
import Creational.factory.withVehical.factory.Vehical;
import Creational.factory.withVehical.product.CarVehical;
import Creational.factory.withVehical.product.VehicalProduct;

public class Main {
    public static void main(String[] args) {
        VehicalProduct v1= new CarVehical();
        Vehical vehical1= v1.createVehical();
        System.out.println(vehical1.Type());
    }
}
