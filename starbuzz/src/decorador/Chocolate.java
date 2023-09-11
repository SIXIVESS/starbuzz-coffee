package decorador;

/**
 *Clase Chocolate que se extiende de condimentos
 * @author Rosalía Pérez Acuña 233505
 */
public class Chocolate extends Condimentos{
    
    /**
     * Constructorde la clase Chocolate
     * @param bebida Bebida escogida
     */
    public Chocolate(Bebida bebida){
        this.bebida=bebida;
    }
    
    /**
     * Método que agrega el chocolate a la descripción
     * @return Descripción de la bebida
     */
    @Override
    public String getDescripcion(){
        return bebida.getDescripcion() + " + Chocolate";
    }
    
    /**
     * Método que aumenta el costo de la bebida
     * @return Bebida con el precio aumentado
     */
    @Override
    public double getCosto(){
        return bebida.getCosto() + 6;
    }
    
}
