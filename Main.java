package Ejercicio4;

public class Main {
     public static void main(String[] args) {

         SmartDevice.SmarthPhone oppo = new SmartDevice.SmarthPhone("oppo","realme","android", true,true,true);
         SmartDevice.SmartWatch samsung = new SmartDevice.SmartWatch("samsung" ,"samsung" , "android", 1650 ,true, true,true);
         //SmartPhoneee
         System.out.println(oppo.calling);
         System.out.println(oppo.fabricante);
         System.out.println(oppo.memory);
         System.out.println(oppo.modelo);
         System.out.println(oppo.SistemaOperativo);
         System.out.println(oppo.ringTone);
         System.out.println(oppo.multiTask);
         //Reloj inteligente
         System.out.println(samsung.alamrs);
         System.out.println(samsung.fabricante);
         System.out.println(samsung.memory);
         System.out.println(samsung.modelo);
         System.out.println(samsung.SistemaOperativo);
         System.out.println(samsung.waterResist);
         System.out.println(samsung.hora);
         System.out.println(samsung.screens);
     }

}
