/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package ni.edu.uni.programacion.programacion2021;
import java.util.Date;
/**
 *
 * @author María Celeste Herrera
 */
public class TipoCambio {
private Date fecha;

private double tipocambio;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTipocambio() {
        return tipocambio;
    }

    public void setTipocambio(double tipocambio) {
        this.tipocambio = tipocambio;
    }

    public TipoCambio() {
    }

    public TipoCambio(Date fecha, double tipocambio) {
        this.fecha = fecha;
        this.tipocambio = tipocambio;
    }
 
}
