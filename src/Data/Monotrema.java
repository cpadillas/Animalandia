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
public class Monotrema extends Mamifero{
    boolean espinas;
    double tamañoCola;
    boolean venenoso;

    public Monotrema(boolean espinas, double tamañoCola, boolean venenoso, boolean pelaje, boolean cuernos, 
            int glandulasMamarias, boolean domestico, String filo, int huesos, String nombre, String sexo, 
            String[] ubicacion, boolean extinto, boolean esqueleto) {
        super(pelaje, cuernos, glandulasMamarias, domestico, filo, huesos, nombre, sexo, ubicacion, extinto, esqueleto);
        this.espinas = espinas;
        this.tamañoCola = tamañoCola;
        this.venenoso = venenoso;
    }

    public boolean isEspinas() {
        return espinas;
    }

    public double getTamañoCola() {
        return tamañoCola;
    }

    public boolean isVenenoso() {
        return venenoso;
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
