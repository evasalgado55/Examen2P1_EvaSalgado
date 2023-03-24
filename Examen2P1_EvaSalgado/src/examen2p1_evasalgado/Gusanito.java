
package examen2p1_evasalgado;

import java.util.*;


public class Gusanito {
    
 Scanner leer = new Scanner(System.in);   
 Random rand = new Random(2);     
 
 ArrayList instrucciones = new ArrayList();
    
 public int[][] llenar(int fila, int columna){
     char x = 'S', y = 'Ó';
        int[][] temp = new int[fila][columna]; 
        for(int i=0;i<fila;i++){
            for(int j=0;j<columna;j++){
                temp[i][j]=rand.nextInt(2); 
            }
        } return temp;
  } 
 public String imprimir(int[][] matriz){
        String temp = " ";
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                  temp += "["+matriz[i][j]+"]";
            } 
            System.out.println();
           temp+="\n";  
           
        System.out.println();
        } 
    return temp;
 }
 public void tablero(){
     char resp = 's';
     while(resp=='s'||resp=='S'){
     System.out.println("Ingrese N: ");
     int n = leer.nextInt();
     System.out.println("Ingrese M: ");
     int m = leer.nextInt();
     
     int[][] num = new int[n][m];
     num = llenar(n,m);
     
     System.out.println(imprimir(num));
     
     System.out.println("Ingrese una Instrucción: ");
     String instruccion = leer.next();
     instrucciones.add(instruccion);
     
     mover(instruccion,num);
    }  
 }
 public void mover(String instruccion, int[][]matriz){
     int num = 0;
     int num2 = instruccion.length()-2;
     int temp[] = new int[matriz.length];
     for(int g=0;g<=instruccion.length();g++){
         char car = instruccion.charAt(g);
         num = car; 
        for(int i=0;i<matriz.length;i++){
         for (int j=0;j<matriz.length;j++){
           if(num<58&&num>47&&num==85&&num==80){
             temp[j] = matriz[i][j]-num2;  
           }  
           if(num<58&&num>47&&num==68&&num==78){
               temp[j]=matriz[i][j]+num2;
           } 
           if(num<58&&num>47&&num==76&&num==84){
               temp[i] = matriz[i][j]-num2;
           } 
           if(num<58&&num>47&&num==85&&num==80){
               temp[i] = matriz[i][j]+num2;
           }
        }
       } 
     }
     
     
   }
}
