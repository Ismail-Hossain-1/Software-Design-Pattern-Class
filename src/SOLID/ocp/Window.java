package SOLID.ocp;

import SOLID.srp.Device;

public class Window implements Device {

    public void  show(String s){
        System.out.println(s);
    }
}
