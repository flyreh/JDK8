package Extra;
import java.util.ArrayList;

public class TestAleatoriedad2 {
    public static void main(String[] args) {
        Aleatoriedad.setLimite(60);
        /*for (int i = 0; i < 10; i++) {
            int numero = Aleatoriedad.retornarNumeroAleatorio();
            System.out.println("Número aleatorio: " + numero);
        }*/
        ArrayList<String> acciones = new ArrayList<>();
        acciones.add("Dormir");
        acciones.add("Hablar");
        acciones.add("Comer");
        Aleatoriedad.setLimite(acciones.size());
        for(int i=0; i<20; i++){
            int ind = Aleatoriedad.retornarNumeroAleatorio();
            System.out.println("Accion aleatoria: "+acciones.get(ind));
        }
    }
}
