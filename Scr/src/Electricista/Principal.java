package Electricista;

import javax.swing.*;

public class Principal {
    public void ingresoNombres(){
        int cantidadAccionesPrincipales = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de tareas"));

        for (int i = 0; i < cantidadAccionesPrincipales; i++) {
            String nombreAccionPrincipal = JOptionPane.showInputDialog("Nombre de la Tarea N°: " + (i + 1));
            AccionPrincipal accion = new AccionPrincipal(nombreAccionPrincipal);
            int cantidadSubprocesos = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de subprocesos"));

            for (int j = 0; j < cantidadSubprocesos; j++) {
                String subproc = JOptionPane.showInputDialog("Subproceso N°: " + (j + 1));
                accion.agregarSubproceso(subproc);
            }
            Electricista.agregarAccionPrincipal(accion);
        }

    }

    public static void main(String[] args) {

        Principal inicio = new Principal();
        inicio.ingresoNombres();
        Program muestra = new Program();
        muestra.mostrarAccionesPrincipales();


    }

}
