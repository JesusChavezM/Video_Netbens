package problemasswitch;
import java.util.*;
public class Problema2 {
    public static void main(String[] args){
        int mes;
        System.out.println("ingresa el numero del mes que quieres saber su numero de dias ");
        System.out.println("solo el numero xd");
        Scanner m = new Scanner(System.in);
        mes = m.nextInt();
        
        switch(mes){
            case 1: ene1(); break;
            case 2: feb(); break;
            case 3: mar(); break;
            case 4: abr(); break;
            case 5: may(); break;
            case 6: jun(); break;
            case 7: jul(); break;
            case 8: ago(); break;
            case 9: sep(); break;
            case 10: oct(); break;
            case 11: nov(); break;
            case 12: dic(); break;
            
        }
}
public static void ene1(){
    System.out.println("El mes que elegiste es: \n Enero");
    System.out.println("Tiene 31 dias");
}
public static void feb(){
    System.out.println("El mes que elegiste es: \n Febrero"); 
    System.out.println("Tiene 28 dias, exepto cuando es año viciesto que tiene 29");
}
public static void mar(){
    System.out.println("El mes que elegiste es: \n Marzo"); 
    System.out.println("Tiene 31 dias");
}
public static void abr(){
    System.out.println("El mes que elegiste es: \n Abril");
    System.out.println("Tiene 30 dias");
}
public static void may(){
    System.out.println("El mes que elegiste es: \n Mayo"); 
    System.out.println("Tiene 31 dias");        
}
public static void jun(){
    System.out.println("El mes que elegiste es: \n Junio"); 
    System.out.println("Tiene 30 dias");
}
public static void jul(){
    System.out.println("El mes que elegiste es: \n Julio");
    System.out.println("Tiene 31 dias");
}
public static void ago(){
    System.out.println("El mes que elegiste es: \n Agosto"); 
    System.out.println("Tiene 31 dias");
}
public static void sep(){
    System.out.println("El mes que elegiste es: \n Septiembre");
    System.out.println("Tiene 30 dias ");
}
public static void oct(){
    System.out.println("El mes que elegiste es: \n Octubre"); 
    System.out.println("Tiene 31 dias ");
}
public static void nov(){
    System.out.println("El mes que elegiste es: \n Noviembre");
    System.out.println("Tiene 30 dias ");
}
public static void dic(){
    System.out.println("El mes que elegiste es: \n Diciembre"); 
    System.out.println("Tiene 31 dias ");
}

}    
    

