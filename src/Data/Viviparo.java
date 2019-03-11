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
public class Viviparo extends Mamifero{
    double tiempoGestacion;
    int numeroCrias;
    boolean trepador;

    public Viviparo(double tiempoGestacion, int numeroCrias, boolean trepador, boolean pelaje, boolean cuernos, 
            int glandulasMamarias, boolean domestico, String filo, int huesos, String nombre, 
            String sexo, String[] ubicacion, boolean extinto, boolean esqueleto) {
        super(pelaje, cuernos, glandulasMamarias, domestico, filo, huesos, nombre, sexo, ubicacion, extinto, esqueleto);
        this.tiempoGestacion = tiempoGestacion;
        this.numeroCrias = numeroCrias;
        this.trepador = trepador;
    }
    

    public double getTiempoGestacion() {
        return tiempoGestacion;
    }

    public int getNumeroCrias() {
        return numeroCrias;
    }

    public boolean isTrepador() {
        return trepador;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public boolean isCuernos() {
        return cuernos;
    }

    public int getGlandulasMamarias() {
        return glandulasMamarias;
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
