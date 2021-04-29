
package problema01;
/**
 *
 * @author USUARIO
 */
public class Problema01 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/**
 *
 * @author USUARIO
 */
    String name = "Maicol Pereira";
    double calificacion1 = 8.65;
    double calificacion2 = 9.2;
    double calificacion3 = 7.09;
    Estudiante est1 = new Estudiante(name, 
            calificacion1, 
            calificacion2,
            calificacion3);
    est1.establecerPromedioCalificaciones();

    est1.obtenerNombreDeEstudiante ();

    est1.obtenerCalificacionMat1 ();

    est1.obtenerCalificacionMat2 ();

    est1.obtenerCalificacionMat3 ();

    est1.establecerPromedioCalificaciones ();

    System.out.printf (
    "%s\n", est1);

        String nombre = "Dairo Pereira";
    double nota1 = 6.03;
    double nota2 = 10;
    double nota3 = 8.01;
    Estudiante est2 = new Estudiante(nombre, nota1, nota2, nota3);

    est2.establecerPromedioCalificaciones ();

    est2.obtenerNombreDeEstudiante ();

    est2.obtenerCalificacionMat1 ();

    est2.obtenerCalificacionMat2 ();

    est2.obtenerCalificacionMat3 ();

    est2.establecerPromedioCalificaciones ();

    System.out.printf (

"%s\n", est2);
}
}

