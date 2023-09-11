package starbuzz;

import decorador.*;

/**
 *
 * @author  Rosalía Pérez Acuña 233505
 */
public class Starbuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Prueba 1
        System.out.println("PRECIOS NORMALES");
        System.out.println("------------------------------------");
        Bebida cafe1= new HouseBlend();
        Bebida cafe2= new DarkRoast();
        Bebida cafe3= new Expresso();
        Bebida cafe4= new Decaf();
        System.out.println(cafe1.getDescripcion() + "  ------  " + "$" + cafe1.getCosto());
        System.out.println(cafe2.getDescripcion() + "  ------  " + "$" + cafe2.getCosto());
        System.out.println(cafe3.getDescripcion() + "  ------  " + "$" + cafe3.getCosto());
        System.out.println(cafe4.getDescripcion() + "  ------  " + "$" + cafe4.getCosto());
        
        
        System.out.println();
        System.out.println();
        System.out.println("PRECIOS CON UN CONDIMENTO");
        System.out.println("------------------------------------");
        Bebida cafe5= new HouseBlend();
        cafe5=new Chocolate(cafe5);
       System.out.println(cafe5.getDescripcion() + "  ------  " + "$" + cafe5.getCosto());
       Bebida cafe6= new Decaf();
        cafe6=new Soya(cafe6);
       System.out.println(cafe6.getDescripcion() + "  ------  " + "$" + cafe6.getCosto());
       Bebida cafe7= new DarkRoast();
        cafe7=new CremaBatida(cafe7);
       System.out.println(cafe7.getDescripcion() + "  ------  " + "$" + cafe7.getCosto());
       
       
       System.out.println();
        System.out.println();
        System.out.println("PRECIOS CON DOS CONDIMENTO");
        System.out.println("------------------------------------");
        Bebida cafe8= new HouseBlend();
        cafe8=new Chocolate(cafe8);
        cafe8=new Leche(cafe8);
       System.out.println(cafe8.getDescripcion() + "  ------  " + "$" + cafe8.getCosto());
       Bebida cafe9= new Decaf();
        cafe9=new Soya(cafe9);
         cafe9=new CremaBatida(cafe9);
       System.out.println(cafe9.getDescripcion() + "  ------  " + "$" + cafe9.getCosto());
       
       
        System.out.println();
        System.out.println();
        System.out.println("PRECIOS CON CUATRO CONDIMENTO");
        System.out.println("------------------------------------");
        Bebida cafe10= new Expresso();
        cafe10=new Chocolate(cafe10);
        cafe10=new Leche(cafe10);
        cafe10=new Soya(cafe10);
        cafe10=new CremaBatida(cafe10);
       System.out.println(cafe10.getDescripcion() + "  ------  " + "$" + cafe10.getCosto());

    }
    
}
