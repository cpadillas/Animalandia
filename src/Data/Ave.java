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
public abstract class Ave extends Vertebrado{
    boolean plumaje;
    String color;
    boolean quilla;

    public Ave(boolean plumaje, String color, boolean quilla, boolean domestico, String filo, int huesos, String nombre, String sexo, String[] ubicacion, boolean extinto, boolean esqueleto) {
        super(domestico, filo, huesos, nombre, sexo, ubicacion, extinto, esqueleto);
        this.plumaje = plumaje;
        this.color = color;
        this.quilla = quilla;
    }
    
    
}
