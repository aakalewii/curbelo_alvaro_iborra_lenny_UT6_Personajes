import java.util.ArrayList;
import com.model.Personaje;
import com.model.guerrero;
import com.model.mago;
import com.model.arquero;
import com.model.hechicero;
import com.model.asesino;

public class juego {
    public static void mostrarAcciones(ArrayList<Personaje> personajes) {
            for (Personaje personaje : personajes) {
                if (personaje instanceof guerrero) {
                    ((guerrero) personaje).defender();
                } else if (personaje instanceof mago) {
                    ((mago) personaje).lanzarHechizo();
                } else if (personaje instanceof arquero) {
                    ((arquero) personaje).moverse();
                } else if (personaje instanceof hechicero) {
                    ((hechicero) personaje).defender();
                } else if (personaje instanceof asesino) {
                    ((asesino) personaje).sigilo();
                }
            }
        }
    }
