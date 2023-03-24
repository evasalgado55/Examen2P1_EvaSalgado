
package examen2p1_evasalgado;

import java.util.*;


public class Libreria {
    Scanner leer = new Scanner(System.in);
    
    ArrayList<Libreria> título = new ArrayList<>();
    ArrayList<Libreria> autor = new  ArrayList<>();
    
    private String autores;
    private String titulos;
    
    
    public Libreria() {
        this.autores = autores;
        this.titulos = titulos;
    }

     

    public ArrayList<Libreria> getTítulo() {
        return título;
    }

    public void setTítulo(ArrayList<Libreria> título) {
        this.título = título;
    }

    public ArrayList<Libreria> getAutor() {
        return autor;
    }

    public void setAutor(ArrayList<Libreria> autor) {
        this.autor = autor;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getTitulos() {
        return titulos;
    }

    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    @Override
    public String toString() {
        return "Libreria{" + "leer=" + leer + ", t\u00edtulo=" + título + ", autor=" + autor + ", autores=" + autores + ", titulos=" + titulos + '}';
    }

    
    
    
}
