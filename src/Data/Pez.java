/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author Estudiante
 */
public abstract class Pez extends Vertebrado{
    boolean escamas;
    int barbas;
    String color;

    public Pez(boolean escamas, int barbas, String color, boolean domestico, String filo, int huesos, String nombre, String sexo, String[] ubicacion, boolean extinto, boolean esqueleto) {
        super(domestico, filo, huesos, nombre, sexo, ubicacion, extinto, esqueleto);
        this.escamas = escamas;
        this.barbas = barbas;
        this.color = color;
    }
    
    public Pez(boolean escamas, int barbas, String color, String nombre, String sexo, String[] ubicacion, boolean extinto, boolean esqueleto) {
        super(nombre, sexo, ubicacion, extinto, esqueleto);
        this.escamas = escamas;
        this.barbas = barbas;
        this.color = color;
    }
    
}
