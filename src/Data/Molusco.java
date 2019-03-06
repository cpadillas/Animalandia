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
public abstract class Molusco extends Invertebrado{
    int tentaculos;
    int brazos;
    boolean pulmones;

    public Molusco(int tentaculos, int brazos, boolean pulmones, String filo, boolean coraza, boolean repSexual, String nombre, String sexo, String[] ubicacion, boolean extinto, boolean esqueleto) {
        super(filo, coraza, repSexual, nombre, sexo, ubicacion, extinto, esqueleto);
        this.tentaculos = tentaculos;
        this.brazos = brazos;
        this.pulmones = pulmones;
    }
    
    
}
