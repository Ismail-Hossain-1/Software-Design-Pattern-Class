package Creational.factory.withButton;

class Platform {

   public Button getPlatform(String s){
       if(s=="IOS"){
         return  new IOSButton();
       }
       else  return new AndroidButton();
   }

}
