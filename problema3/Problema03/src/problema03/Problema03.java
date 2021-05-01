
package problema03;
/**
 *
 * @author USUARIO
 */
public class Problema03 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        String cedula = "1150539516";
        String marca = ">>Camaro<<";
        int fabricacion = 1967;
        double vehiculoUno = 105.0000;
        Automotor auto1 = new Automotor(cedula, marca, fabricacion, vehiculoUno);
        auto1.establecerValorMatricula();
        System.out.printf("%s\n", auto1);
        
        String cedula2 = "1894356445";
        String marca2 = ">>Mercedez<<";
        int fab2 = 1960;
        double vehiculo2 = 850.0000;
        Automotor auto2 = new Automotor(cedula2, marca2, fab2, vehiculo2);
        auto2.establecerValorMatricula();
        System.out.printf("%s\n", auto2);
        
        String cedula3 = "1105202293";
        String marca3 = ">>Lamborghini<<";
        int fab3 = 1999;
        double vehiculo3 = 260.0000;
        Automotor auto3 = new Automotor(cedula3, marca3, fab3, vehiculo3);
        auto2.establecerValorMatricula();
        System.out.printf("%s\n", auto3);
    }
    
}