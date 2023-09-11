/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorador;

/**
 *Clase Soy
 * @author Rosalía Pérez Acuña 233505
 */
public  class Soya extends Condimentos{
        public Soya(Bebida bebida){
        this.bebida=bebida;
    }
    
    /**
     * Método que agrega el chocolate a la descripción
     * @return Descripción de la bebida
     */
    @Override
    public String getDescripcion(){
        return bebida.getDescripcion() + " + Soya";
    }
    
    /**
     * Método que aumenta el costo de la bebida
     * @return Bebida con el precio aumentado
     */
    @Override
    public double getCosto(){
        return bebida.getCosto() + 8;
    }
}
