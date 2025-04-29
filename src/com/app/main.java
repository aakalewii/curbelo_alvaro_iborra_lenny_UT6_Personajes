import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Personaje> personajes = new ArrayList<>();
        personajes.add(new Guerrero("Guts", 10, 100, 50, 30, 20));
        personajes.add(new Mago("Morgana", 12, 80, 40, 20));
        personajes.add(new Arquero("Dibu", 8, 90, 30, 25));
        personajes.add(new Hechicero("Jimmy", 10, 80, 20, 15));
        personajes.add(new Asesino("Alcapone", 9, 80, 25, 10));

        juego.mostrarAcciones(personajes);
    }
}