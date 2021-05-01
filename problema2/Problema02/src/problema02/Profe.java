/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema02;

/**
 *
 * @author USUARIO
 */
public class Profe {    
    private String nombre;
    private String apellido;
    private String cedula;
    private double sueldoBasico;
    private double sueldoTotal;

    
    public Profe(String nom, String ape,String cedu, double sueldBasico ) {
        nombre = nom;
        apellido = ape;
        sueldoBasico = sueldBasico;
        cedula = cedu;
    }

    Profe(String nom, String ape, double sueldoBasi, String cedu) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    public void establecerNombre(String nom) {
        nombre = nom;
    }
    
    public void establecerApellido(String ape) {
        apellido = ape;
    }
    
    public void establecerSueldoBasico(double sueldBasico) {
        sueldoBasico = sueldBasico;
    }
    
    public void establecerSueldoTotal() {
        sueldoTotal = sueldoBasico + ((sueldoBasico * 20) / 200);
    }
    
    public void establecerCedula(String cedu) {
        cedula = cedu;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public String obtenerApellido() {
        return apellido;
    }
    
    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }
    
    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }
    
    public String obtenerCedula() {
        return nombre;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Datos del profesor:\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Sueldo básico: %.2f\n"
                + "Sueldo total: %.2f\n"
                + "Cédula: %s\n",
                nombre,
                apellido,
                sueldoBasico,
                sueldoTotal,
                cedula);
        return cadena;
    }
}
