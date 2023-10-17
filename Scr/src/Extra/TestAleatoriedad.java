package Extra;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class TestAleatoriedad {
    public static void main(String[] args) throws InterruptedException {
        TiempoAleatorio.setRango(5);
        LocalDateTime aleatorio = TiempoAleatorio.retornarHoraAleatoria();
        //Date time formatter se usa para colocar el formato de la salida, en este caso
        //horas:minutos:segundos
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");
        //La manera de colocar el formato a una varible de tiempo es con .format()
        System.out.println("hora generada aleatoriamente (Hora actual más numero entre 0 y 24): "+aleatorio.format(formato));
        //Inicializamos un bucle infinito que se romperá cuando llegue la hora aleatoria generada;
        while(true){
            //creamos un objeto llamado ahora que almacenará el tiempo actual
            LocalDateTime ahora = LocalDateTime.now();
            System.out.println("Hora actual: "+ahora.format(formato));
            //Comprobamos si la hora actual es IGUAL o DESPUES de la hora generada anteriormente
            //Esto ya que el equals compara también los nanosegundos, por lo que es altamente
            //probable que las horas no sean iguales
            if(ahora.equals(aleatorio)||ahora.isAfter(aleatorio)){
                System.out.println("Hora llegada");
                break;
            }
            //Esta línea hace que el bucle se detenga 1 segundo
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
