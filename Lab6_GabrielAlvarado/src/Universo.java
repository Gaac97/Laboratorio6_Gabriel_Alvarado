
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

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
     private File archivo =null;

    public Universo() {
    }

    public Universo(String nombre,String path) {
        this.nombre = nombre;
        archivo = new File(path);
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

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
   
    //Mutador extra
    public void setListSeres(SeresVivos l) {
        ListSeres.add(l);
    }
     
       public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw= null;
        try {
            fw = new FileWriter(archivo,false);
            bw= new BufferedWriter(fw);
            for (SeresVivos t :ListSeres) {
                bw.write(t.getAños()+ "|");
                bw.write(t.getNombrePlaneta()+"|");
                bw.write(t.getKi()+"|");
                bw.write(t.getNombreRaza()+"|");
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
        ListSeres = new ArrayList();
        try {
            
            sc = new Scanner(archivo);
            sc.useDelimiter("\\|");
            while (sc.hasNext()) {                
                ListSeres.add(new SeresVivos(
                        sc.next(),sc.nextInt(),sc.nextInt(),sc.next()));
            }    
            } catch (Exception e) {
            
        }
         sc.close();
        }
       
    }
    
    public void leer(){
       File fichero=null;
        FileReader fr = null;
        BufferedReader br = null;
        String Cadena="";
        try {
            JFileChooser jfc = new JFileChooser();
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de Texto", "txt");
            FileNameExtensionFilter filtro2= new FileNameExtensionFilter("Imagenes", "jpg","png","bmp");
            jfc.setFileFilter(filtro);
            jfc.addChoosableFileFilter(filtro2);
            int seleccion = jfc.showOpenDialog(null);
            if (seleccion==JFileChooser.APPROVE_OPTION) {
                fichero=jfc.getSelectedFile();
                archivo= new File(jfc.getSelectedFile().getPath());
                fr=new FileReader(fichero);
                br = new BufferedReader(fr);
                String linea;
                Cadena+="";
                while ((linea=br.readLine())!=null) {                    
                    Cadena+=linea;
                    Cadena+="\n";
                }
            }
        } catch (Exception e) {
    }
    }
    @Override
    public String toString() {
        return "Universos{" + "nombre=" + nombre + ", ListSeres=" + ListSeres + '}';
    }
    
    
}
