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

class guerrero extends fisico{

    private int fuerza;
    private int armadura;
    private int escudo;

    public guerrero(String nombre, int nivel, int salud, int fuerza, int armadura, int escudo) {
        super(nombre, nivel, salud);
        this.fuerza = fuerza;
        this.armadura = armadura;
        this.escudo = escudo;
    }
}

class mago extends magico{

    private int mana;
    private int sabiduria;

    public mago(String nombre, int nivel, int salud, int mana, int sabiduria) {
        super(nombre, nivel, salud);
        this.mana = mana;
        this.sabiduria = sabiduria;
    }
}

class arquero extends fisico{

    private int agilidad;
    private int numflechas;

    public arquero(String nombre, int nivel, int salud, int agilidad, int numflechas) {
        super(nombre, nivel, salud);
        this.agilidad = agilidad;
        this.numflechas = numflechas;
    }
}

class hechicero extends magico{

    private int mana;
    private int concentracion;

    public hechicero(String nombre, int nivel, int salud, int mana, int concentracion) {
        super(nombre, nivel, salud);
        this.mana = mana;
        this.concentracion = concentracion;
    }
}

class asesino extends fisico{

    private int sigilo;
    private int critico;

    public asesino(String nombre, int nivel, int salud, int sigilo, int critico) {
        super(nombre, nivel, salud);
        this.sigilo = sigilo;
        this.critico = critico;
    }
}