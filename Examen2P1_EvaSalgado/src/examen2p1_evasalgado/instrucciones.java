
package examen2p1_evasalgado;

import java.util.*;
import javax.swing.*;


public class instrucciones {
    static Scanner leer = new Scanner(System.in);
    static Libreria library = new Libreria();
    static Gusanito worm = new Gusanito();  
    
    public void ejercicio1(){
        JOptionPane.showMessageDialog(null, "Usted está entrando al ejercicio: Libros y más libros");
         char resp = 's';
       while(resp=='s'||resp=='S'){
       System.out.println("1. Agregar libro\n" +
                          "2. Eliminar libro\n" +
                          "3. Listar\n" +
                          "4. Buscar por titulo\n" +
                          "5. Regresar al menu");
       System.out.println("Ingrese una opcion"); 
       int opcion = leer.nextInt();
       switch (opcion){
           case 1: 
               agregarlibro();
               break;
           case 2: 
               eliminarlibro();
               break;
           case 3:
               enlistarlibros();
       }
       System.out.println("Desea Ingresar otra opcion?:");
       resp = leer.next().charAt(0); 
      
     }
    } 
    
    public void ejercicio2(){
        JOptionPane.showMessageDialog(null, "Usted está entrando al ejercicio: Gusanito Hambriento");
        worm.tablero();
    } 
    
    
    
 public static void agregarlibro(){
        char resp = 's';
        while(resp=='s'||resp=='S'){
        System.out.println("Ingrese un Libro");
        String nbook = leer.next();
        
        System.out.println("Ingrese un autor");
        String nauthor = leer.next();
        library.título.add(new Libreria());
        library.autor.add(new Libreria());
        
        System.out.println("Desea ingresar otro libro?:");
        resp = leer.next().charAt(0);
        } 
    }  
    public static void eliminarlibro(){
        char resp = 's';
        do {
            System.out.println("Ingrese el indice del libro que quiere eliminar");
            int indice = leer.nextInt();
            int i = indice -1;
           Libreria title = library.título.remove(i);
           System.out.println("Desea remover otro libro?");
           resp = leer.next().charAt(0);
        } while (resp=='s'||resp=='S');
        
    } 
    public static void enlistarlibros(){
        char resp = 's';
        do {
            System.out.println("Esta es tu lista de libros:\n");
            System.out.println(library.título.toString());
            System.out.println("Desea revisar su lista otra vez?:");
            resp = leer.next().charAt(0);
        } while (resp=='s'||resp=='S');
        
    } 
    public static void buscarlibro(){
        char resp = 's';
        do {
            System.out.println("Ingrese el nombre del libro que quiere buscar:");
            String nlibro = leer.next();
            
            if(library.título.contains(nlibro)){
                System.out.println("El libro se encuentra en el inventario");
            } else {
                System.out.println("Lo siento, el libro no está en el inventario");
            }
            System.out.println("Desea buscar por otro libro?");
            resp = leer.next().charAt(0);
        } while (resp=='s'||resp=='S');
        
    }
    
    
}
