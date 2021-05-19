
package problemasswitch;
import java.util.*;

public class Problema5 {
    public static void main(String[]args){
        int motor=3;
        Scanner m = new Scanner(System.in);
        System.out.println("Selecciona el tipo de bomba hidraulica");
        System.out.println("Seleccione un numero del uno al cuatro para ver el tipo de bomba");
        motor= m.nextInt();
        switch(motor){                 
            case 1: System.out.println("La bomba es una bomba de agua"); break;                   
            case 2: System.out.println ("La bomba es una bomba de gasolina"); break;                    
            case 3:  System.out.println ("La bomba es una bomba de hormigon"); break;                    
            case 4:  System.out.println("La bomba es una bomba de pasta alimenticia");break;                       
            default: System.out.println ("No existe un valor valido para ese tipo de bomba"); 
        }
        
    }
}


