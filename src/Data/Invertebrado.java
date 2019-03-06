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
public abstract class Invertebrado extends Animal {
    String filo;
    boolean coraza;
    boolean repSexual;

    public Invertebrado(String filo, boolean coraza, boolean repSexual, String nombre, String sexo, String[] ubicacion, boolean extinto, boolean esqueleto) {
        super(nombre, sexo, ubicacion, extinto, esqueleto);
        this.filo = filo;
        this.coraza = coraza;
        this.repSexual = repSexual;
    }
    
    
}
