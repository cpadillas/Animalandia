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
public abstract class Animal {
    String nombre;
    String sexo;
    String ubicacion[];
    boolean extinto;
    boolean esqueleto;

    public Animal(String nombre, String sexo, String[] ubicacion, boolean extinto, boolean esqueleto) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.ubicacion = ubicacion;
        this.extinto = extinto;
        this.esqueleto = esqueleto;
    }

    public String getNombre() {
        return nombre;
    }
    
    @Override
    public String toString() {
            return "Nombre: "+this.getNombre();
	}
    
}

