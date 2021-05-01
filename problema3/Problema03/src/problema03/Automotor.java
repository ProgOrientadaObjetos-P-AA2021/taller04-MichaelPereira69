/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema03;

/**
 *
 * @author USUARIO
 */
public class Automotor {

    private String ced;
    private String marcaDelVehiculo;
    private int anoDeFabricacion;
    private double valorDeVehiculo;
    private double valorDeLaMatricula;

    public Automotor(String cedula, String marca, int anoFa,
            double vehiculo) {
        ced = cedula;
        marcaDelVehiculo = marca;
        anoDeFabricacion = anoFa;
        valorDeVehiculo = vehiculo;
    }

    public void establecerCedulaDueno(String cedula) {
        ced = cedula;
    }

    public void establecerMarcaDelVehiculo(String marca) {
        marcaDelVehiculo = marca;
    }

    public void establecerAnoFabricacion(int anoFa) {
        anoDeFabricacion = anoFa;
    }

    public void establecerValorVehiculo(double vehiculo) {
        valorDeVehiculo = vehiculo;
    }

    public void establecerValorMatricula() {
        int numeroAnos = 2021 - anoDeFabricacion;
        valorDeLaMatricula = ((valorDeVehiculo * 0.002) / 200) * numeroAnos;
    }
    
    public String obtenerCedulaDueno() {
        return ced;
    }
    
    public String obtenerMarcaDelVehiculo() {
        return marcaDelVehiculo;
    }
    
    public int obtenerAnoDeFabricacion() {
        return anoDeFabricacion;
    }
    
    public double obtenerValorVehiculo() {
        return valorDeVehiculo;
    }
    
    public double obtenerValorMatricula() {
        return valorDeLaMatricula;
    }
    
    @Override
    public String toString() {
        String cadena = String.format(">>>Vehículo con los siguientes datos<<<"
                + ":\n"
                + "Cédula: %s\n"
                + "Marca: %s\n"
                + "Año de Elaboracion: %d\n"
                + "Precio del vehículo: %.2f\n"
                + "Matrícula: %.2f\n",
                ced,
                marcaDelVehiculo,
                anoDeFabricacion,
                valorDeVehiculo,
                valorDeLaMatricula);
        return cadena;
    }

}