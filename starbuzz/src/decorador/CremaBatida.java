/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorador;

/**
 *Clase WhippedCream
 * @author Rosalía Pérez Acuña 233505
 */
public class CremaBatida extends Condimentos{
        public CremaBatida(Bebida bebida){
        this.bebida=bebida;
    }
    
    /**
     * Método que agrega el chocolate a la descripción
     * @return Descripción de la bebida
     */
    @Override
    public String getDescripcion(){
        return bebida.getDescripcion() + " + Crema Batida";
    }
    
    /**
     * Método que aumenta el costo de la bebida
     * @return Bebida con el precio aumentado
     */
    @Override
    public double getCosto(){
        return bebida.getCosto() + 10;
    }
}
