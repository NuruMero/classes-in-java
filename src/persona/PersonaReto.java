package persona;

public class PersonaReto {
    private static int contadorPersonas = 0;
    private int idPersona;
    private String nombre;
    private String apellido;

    public PersonaReto(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        // Incrementamos el atributo static
        this.idPersona = ++PersonaReto.contadorPersonas;
    }

    public static int getContadorPersonas() {
        return PersonaReto.contadorPersonas;
    }

    public int getIdPersona() {
        return idPersona;
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

    @Override
    public String toString() {
        return "Id: " +this.idPersona
                + ", Nombre: "+this.nombre
                + ", Apellido: "+this.apellido
                + ", Dir. Mem. "+super.toString();
    }
}
