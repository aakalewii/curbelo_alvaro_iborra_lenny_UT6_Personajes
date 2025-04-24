import java.util.ArrayList;
import com.model.Personaje;
import com.model.guerrero;
import com.model.mago;
import com.model.arquero;
import com.model.hechicero;
import com.model.asesino;


public class main {
    public static void main(String[] args) {
        ArrayList<Personaje> personajes = new ArrayList<>();
        personajes.add(new guerrero("Guts", 10, 100, 50, 30, 20));
        personajes.add(new mago("Morgana", 12, 80, 40, 20));
        personajes.add(new arquero("Dibu", 8, 90, 30, 25));
        personajes.add(new hechicero("Jimmy", 10, 80, 20, 15));
        personajes.add(new asesino("Alcapone", 9, 80, 25, 10));

        juego.mostrarAcciones(personajes);
    }
}
