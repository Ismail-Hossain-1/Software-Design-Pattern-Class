package Creational;

class Singletone {
    private String db_url;
    private  static Singletone instance;
    public Singletone(String db_url){
        this.db_url = db_url;
    }

    public static Singletone getInstance(String db_url){
        if(instance ==null){
            instance = new Singletone(db_url);
        }
        return  instance;
    }
    public String getUrl(){
        return db_url;
    }
}

class EagerSingletone{

    public static String s;
    private static final EagerSingletone instanne= new EagerSingletone(s);
    EagerSingletone(String s){
        this.s=s;
    }
    public EagerSingletone getInstanne(String s){
        return instanne;
    }

}
class Main{
    public static void main(String[] args) {
        String url= "MYurl";
        Singletone first=Singletone.getInstance(url);
        System.out.println("First URL "+first.getUrl());

        Singletone second = Singletone.getInstance("Second");
        System.out.println("Second URL "+second.getUrl());

    }
}
