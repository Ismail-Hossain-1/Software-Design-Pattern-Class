package Structural.Composite;

public class Client {
    public static void main(String[] args) {
        File file1= new File("nature.jpg");
        File file2= new File("record.mp3");
        File file3 = new File("commands.txt");

        Directory directory1= new Directory("Downloads");
        directory1.addComponent(file1);
        directory1.addComponent(file2);

        Directory directory2= new Directory("Documents");
        directory2.addComponent(file3);

        Directory rootDir = new Directory("Root");

        rootDir.addComponent(directory1);
        rootDir.addComponent(directory2);

//        directory1.printSize();
//        directory2.printSize();
//
//        rootDir.printSize();

        rootDir.displayDetails();

    }
}
