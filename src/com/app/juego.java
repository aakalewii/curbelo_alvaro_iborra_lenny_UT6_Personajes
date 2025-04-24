import java.util.ArrayList;
import com.model.Personaje;
import com.model.guerrero;
import com.model.mago;
import com.model.arquero;
import com.model.hechicero;
import com.model.asesino;

public class juego {
    public static void main(String[] args) {
        ArrayList<Personaje> personajes = new ArrayList<>();

        // Agregar personajes a la lista
        personajes.add(new guerrero("Guts", 10, 100, 50, 30, 20));
        personajes.add(new mago("Morgana", 12, 80, 100, 70));
        personajes.add(new arquero("Dibu", 8, 90, 60, 30));
        personajes.add(new hechicero("Jimmy", 15, 70, 120, 80));
        personajes.add(new asesino("Alcapone", 9, 85, 40, 50));

        // Mostrar los personajes
        for (Personaje personaje : personajes) {
            System.out.println(personaje);
        }

        void mostrarAcciones(){
            for (Personaje personaje : personajes) {
                if (personaje instanceof guerrero) {
                    ((guerrero) personaje).defender();
                } else if (personaje instanceof mago) {
                    ((mago) personaje).lanzarHechizo();
                } else if (personaje instanceof arquero) {
                    ((arquero) personaje).moverse();
                } else if (personaje instanceof hechicero) {
                    ((hechicero) personaje).sigilo();
                } else if (personaje instanceof asesino) {
                    ((asesino) personaje).atacar();
                }
            }
        }
    }
}