package Electricista;
import Extra.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;
import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Program{

    //Metodos para agregar elementos a las acciones principales y subacciones
    //Metodos para Mostrar las acciones principales (en orden) y sus repectivas subacciones (con tiemepo aleatorio).

    public void mostrarAccionesPrincipales() {
        for (AccionPrincipal accionPrincipal : Electricista.getAccionesPrincipales()) {
            System.out.println("Realizando: " + accionPrincipal.getNombre() + "...");
            mostrarSubaccionesConAleatoriedad(accionPrincipal.getSubprocesos());
        }
    }

    public void mostrarSubaccionesConAleatoriedad(ArrayList Subacciones) {
        int superior = Subacciones.size();
        for (int i = 0; i < superior; i++) {

            TiempoAleatorio.setRango(5);
            LocalDateTime aleatorio = TiempoAleatorio.retornarHoraAleatoria();

            DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");

            while (true) {
                Aleatoriedad.setLimite(Subacciones.size());
                LocalDateTime ahora = LocalDateTime.now();
                int indiceAleatorio = Aleatoriedad.retornarNumeroAleatorio();

                if (ahora.equals(aleatorio) || ahora.isAfter(aleatorio)) {
                    System.out.println("Subproceso: "+Subacciones.get(indiceAleatorio)+" Terminado");
                    Subacciones.remove(indiceAleatorio);
                    break;
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
