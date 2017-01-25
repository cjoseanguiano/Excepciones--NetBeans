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
public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            Edad edad = new Edad();
            edad.setEdad(-10);
            if (edad != null) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
