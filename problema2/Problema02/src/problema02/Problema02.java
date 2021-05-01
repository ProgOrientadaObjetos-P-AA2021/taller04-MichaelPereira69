package problema02;

/**
 *
 * @author USUARIO
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nom = "Michael";
        String ape = "Pereira";
        double sueldoBasi = 300;
        String cedu = "1150539516";
        Profe profe1 = new Profe(nom, ape, sueldoBasi, cedu);
        profe1.establecerSueldoTotal();
        System.out.printf("%s\n", profe1);

        String nombre = "Dario";
        String apellido = "Xavier";
        double sueldoBasico = 600;
        String ced = "1105202293";
        Profe profe2 = new Profe(nombre, apellido, sueldoBasico, ced);
        profe2.establecerSueldoTotal();
        System.out.printf("%s\n", profe2);

        String nombr = "Graciela";
        String apell = "Mireya";
        double sueldoBas = 450;
        String cedul = "15489623575";
        Profe profe3 = new Profe(nombr, apell, sueldoBas, cedul);
        profe3.establecerSueldoTotal();
        System.out.printf("%s\n", profe3);

    }

}
