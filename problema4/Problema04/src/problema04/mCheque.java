package problema04;
/**
 *
 * @author USUARIO
 */
public class mCheque {
    private String nomCliente;
    private String nomBanco;
    private double valorCheque;
    private double comisionDelBanco;

    public mCheque(String cliente, String banco, double vCheque) {
        nomCliente = cliente;
        nomBanco = banco;
        valorCheque = vCheque;
    }

    public void establecerNombreCliente(String client) {
        nomCliente = client;
    }
    
    public void establecerNombreBanco(String banco) {
        nomBanco = banco;
    }
    
    public void establecerValorCheque(double cheque) {
        valorCheque = cheque;
    }
    
    public void establecerComisionDelBanco() {
        comisionDelBanco = valorCheque * 0.003;
    }
    
    public String obtenerNombreDelCliente() {
        return nomCliente;
    }
    
    public String obtenerNombreDelBanco() {
        return nomBanco;
    }
    
    public double obtenerValorDelCheque() {
        return valorCheque;
    }
    
    public double obtenerComisionBanco() {
        return comisionDelBanco;
    }
    
    @Override
    public String toString() {
        String cadena = String.format(">>> Cheque con los siguentes datos <<\n"
                + "Nombre del Cliente: %s\n"
                + "Nomnbre del Banco: %s\n"
                + "Valor del Cheque: %.2f\n"
                + "Comisión del Banco: %.2f\n",
                nomCliente,
                nomBanco,
                valorCheque,
                comisionDelBanco);
        return cadena;
    }

  }

