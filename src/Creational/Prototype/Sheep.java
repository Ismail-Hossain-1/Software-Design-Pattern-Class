package Creational.Prototype;



class SheepNoClone{
        private  String color;
        private  double weight;
        public int age;
        public SheepNoClone(String color, double weight,int age){
            this.color= color;
            this.weight= weight;
            this.age= age;
        }
        public SheepNoClone(SheepNoClone sheep){

            this.color = sheep.color;
            this.weight= sheep.weight;
            this.age = sheep.age;
        }
        public void display(){
            System.out.println("Color: "+color+" Weight: "+weight+" Age: "+age);
        }
        public SheepNoClone CLONE(){
            return new SheepNoClone(this);

        }
    }
    class Main{
        public static void main(String[] args) {
            SheepNoClone first = new SheepNoClone("White", 4.5, 3);
            SheepNoClone second = first.CLONE();
            //second.age=5;
            first.display();
            second.display();
            System.out.println(first==second);
        }
    }
