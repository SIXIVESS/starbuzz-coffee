/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorador;

/**
 *Clase Condiment (Patrón Decorador) que se extiende de bebida
 * @author Rosalía Pérez Acuña 233505
 */
public abstract class Condimentos extends Bebida{
    //Constructor
    public Bebida bebida; 

    /**
     * Método que regresa el nombre de un condimento
     * @return Descripción del condimento
     */
    @Override
    public abstract String getDescripcion();
    
    
}
