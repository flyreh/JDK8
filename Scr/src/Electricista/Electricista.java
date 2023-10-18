package Electricista;

import java.lang.reflect.Array;
import java.util.ArrayList;
import Extra.*;

//Electricista extends Trabajador (???)
public class Electricista {

    private static ArrayList<AccionPrincipal> accionesPrincipales = new ArrayList<>();

    public static void agregarAccionPrincipal(AccionPrincipal accionPrincipal) {
        accionesPrincipales.add(accionPrincipal);
    }

    public static ArrayList<AccionPrincipal> getAccionesPrincipales() {
        return accionesPrincipales;
    }

}
