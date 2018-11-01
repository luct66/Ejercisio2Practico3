/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author Administrador
 */
public class Componentes {
    private int aire;
    private int cristales;
    private int alarma;

    public Componentes(int aire, int cristales, int alarma) {
        this.aire = aire;
        this.cristales = cristales;
        this.alarma = alarma;
    }

    public int getAire() {
        return aire;
    }

    public void setAire(int aire) {
        this.aire = aire;
    }

    public int getCristales() {
        return cristales;
    }

    public void setCristales(int cristales) {
        this.cristales = cristales;
    }

    public int getAlarma() {
        return alarma;
    }

    public void setAlarma(int alarma) {
        this.alarma = alarma;
    }
    
    
    
}
