public class Persona {
    String nombre;
    String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Nombre: "+this.nombre +", Apellido: "+this.apellido;
    }

    /*
    void mostrarPersona() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }
     */

    public static void main(String[] args) {
        System.out.println("*** Creación de Clase y Objetos Persona ***");
        var objeto1 = new Persona("Adán", "Guerrero");
        //objeto1.nombre = "Adán";
        //objeto1.apellido = "Guerrero";
        //objeto1.mostrarPersona();

        // Segundo objeto
        var objeto2 = new Persona("Nuru", "Mero");
        //objeto2.nombre = "Nuru";
        //objeto2.apellido = "Mero";
        //objeto2.mostrarPersona();
    }
}
