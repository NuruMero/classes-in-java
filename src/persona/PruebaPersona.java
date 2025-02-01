package persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("*** Creación de Clase y Objetos Persona ***");
        var objeto1 = new PersonaReto("Adán", "Guerrero");
        objeto1.mostrarPersona();

        // Segundo objeto
        var objeto2 = new PersonaReto("Nuru", "Mero");
        objeto2.mostrarPersona();
    }
}
