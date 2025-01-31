public class Persona {
    String nombre;
    String apellido;

    void mostrarPersona() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }

    public static void main(String[] args) {
        System.out.println("*** Creación de Clase y Objetos Persona ***");
        var objeto1 = new Persona();
        objeto1.nombre = "Adán";
        objeto1.apellido = "Guerrero";
        objeto1.mostrarPersona();

        // Segundo objeto
        var objeto2 = new Persona();
        objeto2.nombre = "Nuru";
        objeto2.apellido = "Mero";
        objeto2.mostrarPersona();
    }
}
