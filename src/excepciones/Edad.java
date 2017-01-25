/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author carlosjoseanguiano
 */
public class Edad {

    private int edad;

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        if (edad <= 0) {
            throw new RuntimeException("Ingresa una edad valida");
        }
        this.edad = edad;
    }
}
