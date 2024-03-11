package Creational.factory.withButton;

public class Main {
    public static void main(String[] args) {
     Platform pl = new Platform();
     Button btn = pl.getPlatform("IOS");
     btn.button();
    }
}
