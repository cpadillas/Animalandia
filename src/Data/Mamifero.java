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
public abstract class Mamifero extends Vertebrado{
    boolean pelaje;
    boolean cuernos;
    int glandulasMamarias;

    public Mamifero(boolean pelaje, boolean cuernos, int glandulasMamarias, boolean domestico, String filo, int huesos, String nombre, String sexo, String[] ubicacion, boolean extinto, boolean esqueleto) {
        super(domestico, filo, huesos, nombre, sexo, ubicacion, extinto, esqueleto);
        this.pelaje = pelaje;
        this.cuernos = cuernos;
        this.glandulasMamarias = glandulasMamarias;
    }
    
    
}
