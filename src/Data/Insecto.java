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
public class Insecto extends Artropodo{
    int ojos;
    boolean alas;
    boolean metamorfosis;

    public Insecto(int ojos, boolean alas, boolean metamorfosis, boolean antenas, int patas, boolean mandibulas, String filo, boolean coraza, boolean repSexual, String nombre, String sexo, String[] ubicacion, boolean extinto, boolean esqueleto) {
        super(antenas, patas, mandibulas, filo, coraza, repSexual, nombre, sexo, ubicacion, extinto, esqueleto);
        this.ojos = ojos;
        this.alas = alas;
        this.metamorfosis = metamorfosis;
    }

    public int getOjos() {
        return ojos;
    }

    public boolean isAlas() {
        return alas;
    }

    public boolean isMetamorfosis() {
        return metamorfosis;
    }

    public boolean isAntenas() {
        return antenas;
    }

    public int getPatas() {
        return patas;
    }

    public boolean isMandibulas() {
        return mandibulas;
    }

    public String getFilo() {
        return filo;
    }

    public boolean isCoraza() {
        return coraza;
    }

    public boolean isRepSexual() {
        return repSexual;
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
