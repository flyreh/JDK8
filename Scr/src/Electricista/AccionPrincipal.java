package Electricista;

import java.util.ArrayList;

public class AccionPrincipal {

    private String nombre;
    private ArrayList<String> subprocesos = new ArrayList<>();

    public AccionPrincipal(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getSubprocesos() {
        return subprocesos;
    }

    public void agregarSubproceso(String subproceso) {
        subprocesos.add(subproceso);
    }
}
