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