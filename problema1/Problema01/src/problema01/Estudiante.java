package problema01;

/**
 *
 * @author USUARIO
 */
public class Estudiante {

    private String nombreDeEstudiante;
    private double calificacionMat1;
    private final double calificacionMat2;
    private double calificacionMat3;
    private double promedioCalificaciones;

    public Estudiante(String n, double nota1, double nota2, double nota3) {
        nombreDeEstudiante = n;
        calificacionMat1 = nota1;
        calificacionMat2 = nota2;
        calificacionMat3 = nota3;
    }

    public void establecerNombreEstudiante(String n) {
        nombreDeEstudiante = n;

    }

    public void establecerCalificacionMat2(double n) {
        calificacionMat1 = n;

    }

    public void establecerCalificacionMat3(double n) {
        calificacionMat3 = n;
    }

    public void establecerPromedioCalificaciones() {
                promedioCalificaciones = (calificacionMat1
                + calificacionMat2
                + calificacionMat3) / 3;
    }
    public String obtenerNombreDeEstudiante() {
        return nombreDeEstudiante;
    }
    public double obtenerCalificacionMat1() {
        return calificacionMat1;
    }
    public double obtenerCalificacionMat2() {
        return calificacionMat2;
    }
    public double obtenerCalificacionMat3() {
        return calificacionMat3;
    }
    public double obtenerPromedioDeCalificaciones() {
        return promedioCalificaciones;
    }
    @Override
    public String toString() {
        String cadena;
        cadena = String.format("Nombre del estudiante: %s.f\n"
                + "Calificacion de la materia 1 es: %.2f\n"
                + "Calificacion de la materia 2 es: %.2f\n"
                + "Calificacion de la materia 3 es: %.2f\n"
                + "El promedio es: %.2f",
                nombreDeEstudiante,
                calificacionMat1,
                calificacionMat2,
                calificacionMat3,
                promedioCalificaciones);
        return cadena;
    }
}
