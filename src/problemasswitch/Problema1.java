
package problemasswitch;
import java.util.*;
public class Problema1 {
public static void main(String[] args) {
        int mes;
        System.out.println("ingresa el NUMERO del mes que quieras saber su nombre");
        System.out.println("solo el numero xd");
        Scanner m = new Scanner(System.in);
        mes = m.nextInt();
        
        switch(mes){
            case 1: ene(); break;
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
            default: System.out.println("Solo numeros del 1 al 12"); break;
            
        }
}
public static void ene(){
    System.out.println("El mes que elegiste es: \n Enero"); 
}
public static void feb(){
    System.out.println("El mes que elegiste es: \n Febrero"); 
}
public static void mar(){
    System.out.println("El mes que elegiste es: \n Marzo"); 
}
public static void abr(){
    System.out.println("El mes que elegiste es: \n Abril"); 
}
public static void may(){
    System.out.println("El mes que elegiste es: \n Mayo"); 
}
public static void jun(){
    System.out.println("El mes que elegiste es: \n Junio"); 
}
public static void jul(){
    System.out.println("El mes que elegiste es: \n Julio"); 
}
public static void ago(){
    System.out.println("El mes que elegiste es: \n Agosto"); 
}
public static void sep(){
    System.out.println("El mes que elegiste es: \n Septiembre"); 
}
public static void oct(){
    System.out.println("El mes que elegiste es: \n Octubre"); 
}
public static void nov(){
    System.out.println("El mes que elegiste es: \n Noviembre"); 
}
public static void dic(){
    System.out.println("El mes que elegiste es: \n Diciembre"); 
}

}