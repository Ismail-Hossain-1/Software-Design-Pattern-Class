package Structural.Composite;

public class File implements FileSystem{

    String name;

    File(String name){
        this.name= name;
    }

    @Override
    public void displayDetails() {
        System.out.println("File name: "+this.name);
    }
}
