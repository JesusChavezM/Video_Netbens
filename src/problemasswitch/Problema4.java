package problemasswitch;
import java.util.*;

public class Problema4 {
    public static void main(String[]args){
        
        int top;
        String otronombre=null;
        System.out.println("Bienvenido a BurgerKing");
        System.out.println("para poder elegir su helado, puede elegir si lo quiere con un topping o no");
        System.out.println("1.- oreo \n2.- kitkat \n3.-brownie \n4.- lacasitos \n5 sin topping \nCualquier otro numero");
        Scanner h = new Scanner(System.in);
        top = h.nextInt();
            switch(top){
            case 1: oreo(); break;
            case 2: kit(); break;
            case 3: bro(); break;
            case 4: laca(); break;
            case 5: ning(); break;
            default: System.out.println("Lo sentimos, no tenemos esa topping");
                     System.out.println("El costo del helado sin topping es $1.90");
            }

    
    }

public static void oreo(){
    Scanner o = new Scanner(System.in);
    String  topp;
    System.out.println("El costo del helado es de $1.90");
    System.out.println("le quieres agregar el topping de OREO por $1?");
    topp = o.nextLine();
    if("si".equals(topp)){
    System.out.println("El precio final es de $2.90");
    }else if("no".equals(topp)){
        System.out.println("El costo del helado sin topping es: $1.90");
    }
  
}//oreo
public static void kit(){
    Scanner k = new Scanner(System.in);
    String  topp;
    System.out.println("El costo del helado es de $1.90");
    System.out.println("le quieres agregar el topping de KITKAT por $1.50?");
    topp = k.nextLine();
    if("si".equals(topp)){
    System.out.println("El precio final es de $3.40");
    }else if("no".equals(topp)){
        System.out.println("El costo del helado sin topping es: $1.90");
    }
  
}//kitkat
public static void bro(){
    Scanner b = new Scanner(System.in);
    String  topp;
    System.out.println("El costo del helado es de $1.90");
    System.out.println("le quieres agregar el topping de BROWNIE por $0.75?");
    topp = b.nextLine();
    if("si".equals(topp)){
    System.out.println("El precio final es de $2.65");
    }else if("no".equals(topp)){
        System.out.println("El costo del helado sin topping es: $1.90");
    }
  
}//brownie
public static void laca(){
    Scanner l = new Scanner(System.in);
    String  topp;
    System.out.println("El costo del helado es de $1.90");
    System.out.println("le quieres agregar el topping de LACASITOS por $0.95?");
    topp = l.nextLine();
    if("si".equals(topp)){
    System.out.println("El precio final es de $2.85");
    }else if("no".equals(topp)){
        System.out.println("El costo del helado sin topping es: $1.90");
    }
  
}//lacasitos
public static void ning(){
    System.out.println("El costo del helado sin topping es: $1.90");  
}//sin topping



}

