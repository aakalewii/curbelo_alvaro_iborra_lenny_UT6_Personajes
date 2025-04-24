abstract class Personaje {
    protected String nombre;
    protected int nivel;
    protected int salud;

    public Personaje(String nombre, int nivel, int salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }

    abstract void atacar();

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", salud=" + salud +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Personaje personaje = (Personaje) obj;
        return nivel == personaje.nivel && salud == personaje.salud && nombre.equals(personaje.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, nivel, salud);
    }

}

class fisico extends Personaje {

    public fisico(String nombre, int nivel, int salud) {
        super(nombre, nivel, salud);
    }
    
    @Override
    void atacar() {
        System.out.println("¡Atacando con fuerza física!");
    }
}

class magico extends Personaje {

    public magico(String nombre, int nivel, int salud) {
        super(nombre, nivel, salud);
    }

    @Override
    void atacar() {
        System.out.println("¡Atacando con magia!");
    }
}

interface defensivo {
    void defender();
}

interface magia {
    void lanzarHechizo();
}

interface movimiento {
    void moverse();
}

interface sigilidad {
    void sigilo();
}

class guerrero extends fisico implements defensivo{

    private int fuerza;
    private int armadura;
    private int escudo;

    public guerrero(String nombre, int nivel, int salud, int fuerza, int armadura, int escudo) {
        super(nombre, nivel, salud);
        this.fuerza = fuerza;
        this.armadura = armadura;
        this.escudo = escudo;
    }

    void cargarAtaque() {
        System.out.println("¡Cargando ataque poderoso!");
    }

    @Override
    void defender() {
        System.out.println("¡El Guerrero se está defendiendo con escudo!");
    }
}

class mago extends magico implements hechizo{

    private int mana;
    private int sabiduria;

    public mago(String nombre, int nivel, int salud, int mana, int sabiduria) {
        super(nombre, nivel, salud);
        this.mana = mana;
        this.sabiduria = sabiduria;
    }

    @Override
    void lanzarHechizo() {
        System.out.println("¡El ago está lanzando un hechizo poderoso!");
    }

    void regenerarMana() {
        System.out.println("¡Regenerando mana!");
    }
}

class arquero extends fisico implements movimiento{

    private int agilidad;
    private int numflechas;

    public arquero(String nombre, int nivel, int salud, int agilidad, int numflechas) {
        super(nombre, nivel, salud);
        this.agilidad = agilidad;
        this.numflechas = numflechas;
    }

    void dispararFlecha() {
        System.out.println("¡Disparando una flecha!");
    }

    void restablecerFlechas() {
        System.out.println("¡Recargando flechas!");
    }

    @Override
    void moverse() {
        System.out.println("¡El arquero se está moviendo sigilosamente!");
    }
}

class hechicero extends magico implements defensivo{

    private int mana;
    private int concentracion;

    public hechicero(String nombre, int nivel, int salud, int mana, int concentracion) {
        super(nombre, nivel, salud);
        this.mana = mana;
        this.concentracion = concentracion;
    }

    void invocarEntidad() {
        System.out.println("¡Invocando una entidad mágica!");
    }

    @Override
    void defender() {
        System.out.println("¡El hechicero se está defendiendo con magia!");
    }
}

class asesino extends fisico implements sigilidad{

    private int sigilo;
    private int critico;

    public asesino(String nombre, int nivel, int salud, int sigilo, int critico) {
        super(nombre, nivel, salud);
        this.sigilo = sigilo;
        this.critico = critico;
    }

    void atacarPorLaEspalda() {
        System.out.println("¡Atacando por la espalda!");
    }

    void ocultar(){
        System.out.println("¡Ocultándose en las sombras!");
    }

    @Override
    void sigilo() {
        System.out.println("¡El asesino se mueve en silencio!");
    }
}