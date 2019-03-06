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
public abstract class Vertebrado extends Animal {
    boolean domestico;
    String filo;
    int huesos;

    public Vertebrado(boolean domestico, String filo, int huesos, String nombre, String sexo, String[] ubicacion, boolean extinto, boolean esqueleto) {
        super(nombre, sexo, ubicacion, extinto, esqueleto);
        this.domestico = domestico;
        this.filo = filo;
        this.huesos = huesos;
    }
    
    public Vertebrado(String nombre, String sexo, String[] ubicacion, boolean extinto, boolean esqueleto) {
        super(nombre, sexo, ubicacion, extinto, esqueleto);
    }
    
}
