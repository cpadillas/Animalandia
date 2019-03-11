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
public class Voladora extends Ave{
    String alimentacion;
    double velocidad;
    boolean migratoria;

    public Voladora(String alimentacion, double velocidad, boolean migratoria, boolean plumaje, String color, boolean quilla, 
            boolean domestico, String filo, int huesos, String nombre, String sexo, String[] ubicacion, boolean extinto, boolean esqueleto) {
        super(plumaje, color, quilla, domestico, filo, huesos, nombre, sexo, ubicacion, extinto, esqueleto);
        this.alimentacion = alimentacion;
        this.velocidad = velocidad;
        this.migratoria = migratoria;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public boolean isMigratoria() {
        return migratoria;
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

    public String getUbicacion() {
        for(String ubication : this.ubicacion){
            System.out.print(ubication+ "-");
        }
        return "";
    }

    public boolean isExtinto() {
        return extinto;
    }

    public boolean isEsqueleto() {
        return esqueleto;
    }
}
