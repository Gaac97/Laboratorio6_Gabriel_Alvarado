/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriel Alvarado
 */
public class SeresVivos {
     private String nombreRaza;
    private int ki;
    private int años;
    private String nombrePlaneta;

    public SeresVivos() {
    }

    public SeresVivos(String nombreRaza, int ki, int años, String nombrePlaneta) {
        this.nombreRaza = nombreRaza;
        this.ki = ki;
        this.años = años;
        this.nombrePlaneta = nombrePlaneta;
    }

    
    public String getNombreRaza() {
        return nombreRaza;
    }

    public void setNombreRaza(String nombreRaza) {
        this.nombreRaza = nombreRaza;
    }

    public int getKi() {
        return ki;
    }

    public void setKi(int ki) {
        this.ki = ki;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public String getNombrePlaneta() {
        return nombrePlaneta;
    }

    public void setNombrePlaneta(String nombrePlaneta) {
        this.nombrePlaneta = nombrePlaneta;
    }

    @Override
    public String toString() {
        return "nombreRaza=" + nombreRaza + ", ki=" + ki + ", a\u00f1os=" + años + ", nombrePlaneta=" + nombrePlaneta + '}';
    }
}
