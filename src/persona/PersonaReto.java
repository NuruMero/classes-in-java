package persona;

public class PersonaReto {
    private String nombre;
    private String apellido;

    public PersonaReto(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    void mostrarPersona() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
    }
}
