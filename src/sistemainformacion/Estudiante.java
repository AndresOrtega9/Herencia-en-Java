/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemainformacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Andres Ortega
 */
public class Estudiante extends Persona {

    private long carnet;
    private double promedioNotas;
    private int numeroMaterias;
    private double definitiva;

    public Estudiante(String nombre, String apellido, int edad, int peso, long carnet, double promedioNotas, int numeroMaterias, double definitiva) {
        super(nombre, apellido, edad, peso);
        this.carnet = carnet;
        this.promedioNotas = promedioNotas;
        this.numeroMaterias = numeroMaterias;
        this.definitiva = definitiva;
    }

    private Estudiante() {
      
    }

    public long getCarnet() {
        return carnet;
    }

    public void setCarnet(long carnet) {
        this.carnet = carnet;
    }

    public double getPromedioNotas() {
        return promedioNotas;
    }

    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }

    public double getDefinitiva() {
        return promedioNotas;
    }

    public void setDefinitiva(double definitiva) {
        this.definitiva = definitiva;
    }

    public int getNumeroMaterias() {
        return numeroMaterias;
    }

    public void setNumeroMaterias(int numeroMaterias) {
        this.numeroMaterias = numeroMaterias;
    }

    public double calcularPromedio(int numeroMaterias, double nota) {
        double promedio = 0;
        promedio = nota / numeroMaterias;
        return promedio;
    }

    public double leerNotas(double numNota) {
        double nota = 0;
        int i = 0;

        while (i < numNota) {
            nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su nota"));
            setPromedioNotas(nota);
            nota = nota + getPromedioNotas();
            i++;
        }
        return nota;

    }

    public Estudiante datosEstudiante() {
        Estudiante call = new Estudiante();
        String nombre = leerDatoTipoCadena("Ingrese el nombre:");
        String apellido = leerDatoTipoCadena("Ingrese el apellido:");
        int edad = leerDatoTipoEntero("Ingrese la edad:");
        double peso = leerDatoTipoReal("Ingrese el peso:");

        int numeroMaterias = leerDatoTipoEntero("Ingrese cantidad de materias:");
        double suma = leerNotas(numeroMaterias);

        double definitiva = calcularPromedio(numeroMaterias, suma);
        call.setNombre(nombre);
        call.setApellido(apellido);
        call.setEdad(edad);
        call.setPeso(peso);
        call.setDefinitiva(definitiva);
        call.setNumeroMaterias(numeroMaterias);
        return call;
    }

    public void imprimirReporteEstudianteNotasEstudiante() {

        imprimirDatosPersona();
        JOptionPane.showConfirmDialog(null, "Cantidad de materias: " + numeroMaterias + " Promedio: " + definitiva);

    }
}
