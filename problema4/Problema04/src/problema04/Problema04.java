
package problema04;

/**
 *
 * @author USUARIO
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cliente1 = "Graciela Pereira";
        String banco1 = "Banco del Austro";
        double valorCheque1 = 12000;
        mCheque chequeUno = new mCheque(cliente1, banco1, valorCheque1);
        chequeUno.establecerComisionDelBanco();
        System.out.printf("%s\n", chequeUno);
        
        String cliente2 = "Dario Xavier";
        String banco2 = "Banco Pichincha";
        double valorCheque2 = 3500;
        mCheque cheque2 = new mCheque(cliente2, banco2, valorCheque2);
        cheque2.establecerComisionDelBanco();
        System.out.printf("%s\n", cheque2);
        
        
        String cliente3 = "Michael Eduardo";
        String banco3 = "Banco de Guayaquil";
        double valorCheque3 = 70000;
        mCheque cheque3 = new mCheque(cliente3, banco3, valorCheque3);
        cheque3.establecerComisionDelBanco();
        System.out.printf("%s\n", cheque3);
    }
    
}