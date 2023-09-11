/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorador;

/**
 *
 * @author Rosalía Pérez Acuña 233505
 */
public class Decaf extends Bebida {

    public Decaf() {
        descripcion = "Descafeinado"; //Nombre del café
    }

    @Override
    public double getCosto() {
        return 36;
    }
}

/**
 * House Blend $38.00
 * Dark Roast $45.00
 * Expresso $36.00
 * Decaf $30.00
 */
