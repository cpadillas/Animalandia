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
public class AguaSalada extends Pez{
    boolean depredador;
    String reproduccion;
    boolean comestible;

    public AguaSalada(boolean depredador, String reproduccion, boolean comestible, boolean escamas,
            int barbas, String color, boolean domestico, String filo, int huesos,
            String nombre, String sexo, String[] ubicacion, boolean extinto, boolean esqueleto) {
        super(escamas, barbas, color, domestico, filo, huesos, nombre, sexo, ubicacion, extinto, esqueleto);
        this.depredador = depredador;
        this.reproduccion = reproduccion;
        this.comestible = comestible;
    }
    
    public AguaSalada(boolean escamas, int barbas, String color, boolean domestico, String filo, int huesos,
            String nombre, String sexo, String[] ubicacion, boolean extinto, boolean esqueleto) {
        super(escamas, barbas, color, domestico, filo, huesos, nombre, sexo, ubicacion, extinto, esqueleto);
    }

    public boolean isDepredador() {
        return depredador;
    }

    public String getReproduccion() {
        return reproduccion;
    }

    public boolean isComestible() {
        return comestible;
    }

    public boolean isEscamas() {
        return escamas;
    }

    public int getBarbas() {
        return barbas;
    }

    public String getColor() {
        return color;
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
