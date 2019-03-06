/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author crist
 */
public class NoVoladora extends Ave{
    boolean nadadora;
    double tamaño;
    String tipoPico;

    public NoVoladora(boolean nadadora, double tamaño, String tipoPico, boolean plumaje, String color, boolean quilla, boolean domestico, String filo, int huesos, String nombre, String sexo, String[] ubicacion, boolean extinto, boolean esqueleto) {
        super(plumaje, color, quilla, domestico, filo, huesos, nombre, sexo, ubicacion, extinto, esqueleto);
        this.nadadora = nadadora;
        this.tamaño = tamaño;
        this.tipoPico = tipoPico;
    }

    public boolean isNadadora() {
        return nadadora;
    }

    public double getTamaño() {
        return tamaño;
    }

    public String getTipoPico() {
        return tipoPico;
    }

    public boolean isPlumaje() {
        return plumaje;
    }

    public String getColor() {
        return color;
    }

    public boolean isQuilla() {
        return quilla;
    }

    public boolean isDomestico() {
        return domestico;
    }

    public String getFilo() {
        return filo;
    }

    public int getHuesos() {
        return huesos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public String[] getUbicacion() {
        return ubicacion;
    }

    public boolean isExtinto() {
        return extinto;
    }

    public boolean isEsqueleto() {
        return esqueleto;
    }
    
    
}
