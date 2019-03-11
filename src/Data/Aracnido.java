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
public class Aracnido extends Artropodo{
    boolean venenoso;
    boolean tenazas;
    boolean cola;

    public Aracnido(boolean venenoso, boolean tenazas, boolean cola, boolean antenas, int patas, boolean mandibulas, String filo, boolean coraza, boolean repSexual, String nombre, String sexo, String[] ubicacion, boolean extinto, boolean esqueleto) {
        super(antenas, patas, mandibulas, filo, coraza, repSexual, nombre, sexo, ubicacion, extinto, esqueleto);
        this.venenoso = venenoso;
        this.tenazas = tenazas;
        this.cola = cola;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public boolean isTenazas() {
        return tenazas;
    }

    public boolean isCola() {
        return cola;
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
