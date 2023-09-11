package decorador;

/**
 * Clase Beverage
 * @author Rosalía Pérez Acuña 233505
 */
public abstract class Bebida {
    String descripcion;
    double costo;
    
    /**
     * Método para obtener información del café
     * @return descripción del café pedido
     */
    public String getDescripcion(){
        return descripcion;
    }
    
    /**
     * Conoce el costo dependiendo del tipo de café escogido por el usuario
     * @return Costo del café
     */
    public abstract double getCosto();
    
}
