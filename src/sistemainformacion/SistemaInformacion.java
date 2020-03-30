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
public class SistemaInformacion {

    /**
     * @param args the command line arguments
     */
  
        //Constructor de la clase
public SistemaInformacion() {
// TODO Auto-generated constructor stub
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        /**
         * *****************************
         */
        /**
         * *****************************
         */
        /**
         * *****************************
         */
// TODO Auto-generated method stub
        int opcion = 0;
        Persona sistemaInformacion = new Persona();
        try {
//Usamos la herencia de la superclase para acceder a los
//métodos de lectura de datos
            do {

                opcion = sistemaInformacion.leerDatoTipoEntero("Ingrese la opción 1 para procesar los datos del empleado,  3 para salir: ");
                if (opcion == 1) {
                    JOptionPane.showMessageDialog(null, "Procesando datos del empleado");
                    Empleado manejadorEmpleado = new Empleado();
//Leemos los datos
                    manejadorEmpleado = manejadorEmpleado.ingresarDatosEmpleado();
//Mostramos el reporte de datos
                    manejadorEmpleado.imprimirReporteEstadoEmpleado();
                } else if (opcion == 3) {
                    JOptionPane.showMessageDialog(null, "Saliendo del Sistema");
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Opción inválida");
                }
            } while (opcion <= 1 || opcion >= 3);//fin del do-while
        }//Fin del try
        catch (Exception errorMain) {
            JOptionPane.showMessageDialog(null, "Error en la digitación: ");
            errorMain.printStackTrace();
        }
        /**
         * *****************************
         */
    }
    
    
    
}
    /**
     * *****************************
     */
    /**
     * *****************************
     */

