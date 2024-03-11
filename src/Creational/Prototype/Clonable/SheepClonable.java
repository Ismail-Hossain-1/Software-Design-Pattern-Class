package Creational.Prototype.Clonable;

public class SheepClonable  implements Cloneable{

    private  String color;
    private  double weight;
    public int age;

    SheepClonable(){

    }
    public SheepClonable(String color, double weight,int age){
        this.color= color;
        this.weight= weight;
        this.age= age;
    }

    @Override
    public SheepClonable clone() {
        try {
            return (SheepClonable) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
    public void display(){
        System.out.println("Color: "+color+" Weight: "+weight+" Age "+age);
    }
}

class Main{
    public static void main(String[] args) {

        SheepClonable first = new SheepClonable("White", 4.6, 4);
        SheepClonable sec = first.clone();
        sec.age=20;
        first.display();

        sec.display();

    }
}
