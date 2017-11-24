
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriel Alvarado
 */
public class Universo {
     private String nombre;
    private ArrayList<SeresVivos> ListSeres = new ArrayList();

    public Universo() {
    }

    public Universo(String nombre) {
        this.nombre = nombre;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<SeresVivos> getListSeres() {
        return ListSeres;
    }

    public void setListSeres(ArrayList<SeresVivos> ListSeres) {
        this.ListSeres = ListSeres;
    }

    @Override
    public String toString() {
        return "Universos{" + "nombre=" + nombre + ", ListSeres=" + ListSeres + '}';
    }
    
    
}
