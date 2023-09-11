/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorador;

/**
 *
 * @author Rosalía Pérez Acuña 233505
 */
public class HouseBlend extends Bebida {

    public HouseBlend() {
        descripcion = "House Blend"; //Nombre del café
    }

    @Override
    public double getCosto() {
        return 38;
    }
}
