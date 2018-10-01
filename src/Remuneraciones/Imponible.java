/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Remuneraciones;

/**
 *
 * @author Qualqum experience
 */
public class Imponible{


    
    public String rut,nombre;
    public int dt,sb,cf; // dias trabajados , sueldo base , carga familiar 
    public double he;    //horas extra
    

        public void setRut(String rut) {
        this.rut = rut;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    public void setSb(int sb) {
        this.sb = sb;
    }

    public void setCf(int cf) {
        this.cf = cf;
    }

    public void setHe(double he) {
        this.he = he;
    }
}
