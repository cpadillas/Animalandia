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
public class AguaDulce extends Pez{
    String habitat;
    double temperatura;
    String fecundacion;

    public AguaDulce(String habitat, double temperatura, String fecundacion, boolean escamas, 
            int barbas, String color, boolean domestico, String filo, int huesos, String nombre, 
            String sexo, String[] ubicacion, boolean extinto, boolean esqueleto) {
        super(escamas, barbas, color, domestico, filo, huesos, nombre, sexo, ubicacion, extinto, esqueleto);
        this.habitat = habitat;
        this.temperatura = temperatura;
        this.fecundacion = fecundacion;
    }

    public String getHabitat() {
        return habitat;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public String getFecundacion() {
        return fecundacion;
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
