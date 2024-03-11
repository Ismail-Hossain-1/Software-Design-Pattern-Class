package SOLID.srp;

import SOLID.ocp.Device;

public class DispBooks {
    public  void show(Book book, Device device){
        String text = String.format("Name: %s Writer: %s pubDate: %s sold copies: %d", book.getName(), book.getWriter(), book.getPubDate(), book.getSoldCopies());
        device.show(text);
    }
}
