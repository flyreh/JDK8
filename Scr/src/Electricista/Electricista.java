package Electricista;

import java.lang.reflect.Array;
import java.util.ArrayList;
import Extra.*;

//Electricista extends Trabajador (???)
public class Electricista {

    public static ArrayList<ArrayList<String>> AccionesPrincipales = new ArrayList<>();
    public static ArrayList<ArrayList<String>> UsoAccionesPrincipales = new ArrayList();


    public void agregarAccionPrincipal(ArrayList accionPrincipal){
        AccionesPrincipales.add(accionPrincipal);
        UsoAccionesPrincipales = AccionesPrincipales;
    }
    public void CrearAcciones(String subaccion1, String subaccion2, String subaccion3, String subaccion4){
        ArrayList<String> Subprocesos = new ArrayList<>();
        Subprocesos.add(subaccion1);
        Subprocesos.add(subaccion2);
        Subprocesos.add(subaccion3);
        Subprocesos.add(subaccion4);
        agregarAccionPrincipal(Subprocesos);
    }

}
