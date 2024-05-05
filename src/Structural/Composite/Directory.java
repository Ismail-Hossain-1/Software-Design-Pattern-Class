package Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements  FileSystem{

    public List<FileSystem> children;
    String dirName;

    public  Directory(String dirName){
        this.dirName= dirName;
        children= new ArrayList<>();
    }
    public  void addComponent(FileSystem component){
        children.add(component);
    }
    public  void removeComponent(FileSystem component){
        children.remove(component);
    }
    public void printSize(){
        System.out.println("File Size :"+ dirName+" "+children.size());
    }

    @Override
    public void displayDetails() {
        System.out.println("Directory Name :"+dirName);
        printSize();
        for (FileSystem components : children){
            components.displayDetails();
        }

    }
}
