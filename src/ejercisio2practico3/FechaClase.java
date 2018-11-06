/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercisio2practico3;

/**
 *
 * @author Administrador
 */
public class FechaClase {
    private int dia;
    private int mes;
    private int año;
    private int horas;
    private int minutos;

 public FechaClase(int i, int i0, int i1, int i2, int i3) {
dia=i;
mes=i0;
año=i1;
horas=i2;
mes=i3;
        
        
    }

    /**
     * @return the dia
     */
    public int getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * @return the mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * @return the año
     */
    public int getAño() {
        return año;
    }

    /**
     * @param año the año to set
     */
    public void setAño(int año) {
        this.año = año;
    }

    /**
     * @return the horas
     */
    public int getHoras() {
        return horas;
    }

    /**
     * @param horas the horas to set
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }

    /**
     * @return the minutos
     */
    public int getMinutos() {
        return minutos;
    }

    /**
     * @param minutos the minutos to set
     */
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    
}
