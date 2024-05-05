package Structural.Proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyDNS implements DNS{

    private DNS ActualDNS;
    private List<String> restrictedSites;

    public ProxyDNS(){
        ActualDNS = new ActualDNS();
        restrictedSites= new ArrayList<>();
        restrictedSites.add("restricted1.com");
        restrictedSites.add("restricyed2.com");
    }



    @Override
    public void connectTo(String server) {

        if(restrictedSites.contains(server)){
            System.out.println("Access to "+server+" is restricted");
        }else {
            ActualDNS.connectTo(server);
        }

    }
}
