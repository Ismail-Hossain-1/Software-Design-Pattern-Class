package Structural.Proxy;

public class ActualDNS implements DNS{


    @Override
    public void connectTo(String server) {
        System.out.println("Connecting to :"+server);
    }
}
