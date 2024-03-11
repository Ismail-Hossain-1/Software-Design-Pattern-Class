package SOLID.srp;

public class Main {
    public static void main(String[] args) {
        Book book= new Book("Essence of Chaos", "Edward Lorenx"
        , "1993", 10000);
        Device device = new Window();
        book.show(device);
    }
}