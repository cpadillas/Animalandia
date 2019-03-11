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
public class Acuatico extends Molusco{
    int ojos;
    double tamaño;
    String tipoAgua;

    public Acuatico(int ojos, double tamaño, String tipoAgua, int tentaculos, int brazos, boolean pulmones, String filo, boolean coraza, boolean repSexual, String nombre, String sexo, String[] ubicacion, boolean extinto, boolean esqueleto) {
        super(tentaculos, brazos, pulmones, filo, coraza, repSexual, nombre, sexo, ubicacion, extinto, esqueleto);
        this.ojos = ojos;
        this.tamaño = tamaño;
        this.tipoAgua = tipoAgua;
    }

    public int getOjos() {
        return ojos;
    }

    public double getTamaño() {
        return tamaño;
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public int getTentaculos() {
        return tentaculos;
    }

    public int getBrazos() {
        return brazos;
    }

    public boolean isPulmones() {
        return pulmones;
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
