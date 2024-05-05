package Structural.Proxy;

public class Client {
    public static void main(String[] args) {
        DNS dns= new ProxyDNS();
        dns.connectTo("google.com");
        dns.connectTo("restricted1.com");
        dns.connectTo("restricted2.com");
    }
}
