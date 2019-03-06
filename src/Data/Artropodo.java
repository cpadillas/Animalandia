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
public abstract class Artropodo extends Invertebrado {
    boolean antenas;
    int patas;
    boolean mandibulas;

    public Artropodo(boolean antenas, int patas, boolean mandibulas, String filo, boolean coraza, boolean repSexual, String nombre, String sexo, String[] ubicacion, boolean extinto, boolean esqueleto) {
        super(filo, coraza, repSexual, nombre, sexo, ubicacion, extinto, esqueleto);
        this.antenas = antenas;
        this.patas = patas;
        this.mandibulas = mandibulas;
    }
    
    
}
