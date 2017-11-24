
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

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
      private ArrayList <Universo> ListUniverso = new ArrayList();
    private File archivo =null;

    public Universo() {
    }
    

    public Universo(String path,String nombre) {
        
        archivo = new File(path);
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


    public ArrayList<Universo> getListUniverso() {
        return ListUniverso;
    }

    public void setListUniverso(ArrayList<Universo> ListUniverso) {
        this.ListUniverso = ListUniverso;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    //Mutador extra
     public void setListUniverso(Universo u) {
       ListUniverso.add(u);
    }
     
       public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw= null;
        try {
            fw = new FileWriter(archivo,false);
            bw= new BufferedWriter(bw);
            for (Universo t : ListUniverso) {
                bw.write(t.getNombre()+ "|");
                bw.write(t.getListSeres()+"|");
            }
           
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }
    public void CargarArchivo()
    {
        if (archivo.exists()) {
        Scanner sc =null;
        ListUniverso = new ArrayList();
        try {
            
            sc = new Scanner(archivo);
            sc.useDelimiter("|");
            while (sc.hasNext()) {                
                ListUniverso.add(new Universo(
                        sc.next()));
            }    
            } catch (Exception e) {
            
        }
         sc.close();
        }
       
    }
    @Override
    public String toString() {
        return "Universos{" + "nombre=" + nombre + ", ListSeres=" + ListSeres + '}';
    }
    
    
}
