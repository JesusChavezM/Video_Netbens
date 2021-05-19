package problemasswitch;
import java.util.*;
public class Problema3 {
    public static void main(String[] args){
        Scanner d = new Scanner(System.in);
        Scanner n = new Scanner(System.in);
        int dia;
        String nombre;
        System.out.println("Bienvenido estudiante");
        System.out.println("¿Cúal es tu nombre?");
        nombre = n.nextLine();
        System.out.println("De cual dia de la semana quieres saber tu horario: ");
        System.out.println("Numero del 1 al 7");
        dia = d.nextInt();
        switch(dia){
            case 1: lun();    System.out.println("Que tengas un buen dia "+nombre); break;
            case 2: mar();    System.out.println("Que tengas un buen dia "+nombre);break;
            case 3: mie();    System.out.println("Que tengas un buen dia "+nombre); break;
            case 4: jue();    System.out.println("Que tengas un buen dia "+nombre); break;
            case 5: vie();    System.out.println("Que tengas un buen dia "+nombre); break;
            case 6: sab();    System.out.println("Que tengas un buen dia "+nombre); break;
            case 7: dom();    System.out.println("Que tengas un buen dia "+nombre); break;
            
        }
    }
public static void lun(){
    System.out.println("El dia ingresado es el lunes");
    System.out.println("Tu horario para el dia de hoy es:");
    System.out.println("Calculo, Fundamentos de investigacion y Matematicas discretas");
       
}
public static void mar(){
    System.out.println("El dia ingresado es el Martes");
    System.out.println("Tu horario para el dia de hoy es:");
    System.out.println("Calculo, Fundamentos de investigacion, Matematicas discretas y Programación");
       
} 
public static void mie(){
    System.out.println("El dia ingresado es el Miercoles");
    System.out.println("Tu horario para el dia de hoy es:");
    System.out.println("Fundamentos de investigacion y Matematicas discretas");
       
} 
public static void jue(){
    System.out.println("El dia ingresado es el Jueves");
    System.out.println("Tu horario para el dia de hoy es:");
    System.out.println("Calculo, Fundamentos de investigacion y Matematicas discretas");
       
} 
public static void vie(){
    System.out.println("El dia ingresado es el Viernes");
    System.out.println("Tu horario para el dia de hoy es:");
    System.out.println("Programacion, Administracion y Matematicas discretas");
       
} 
public static void sab(){
    System.out.println("El dia ingresado es el Sabado");
    System.out.println("Tu horario para el dia de hoy es:");
    System.out.println("Actividad Extraescolar: Ajedrez");
       
} 
public static void dom(){
    System.out.println("El dia ingresado es el Domingo");
    System.out.println("Tu horario para el dia de hoy es:");
    System.out.println("No hay clases");
       
} 
    
}
