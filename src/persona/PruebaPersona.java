package persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("*** Creación de Clase y Objetos Persona ***");
        System.out.println("Variable estática: " +PersonaReto.getContadorPersonas());
        var objeto1 = new PersonaReto("Adán", "Guerrero");
        //objeto1.mostrarPersona();
        System.out.println(objeto1); //Automáticamente se llama al metodo toString
        System.out.println("Variable estática: " +PersonaReto.getContadorPersonas());

        var objeto2 = new PersonaReto("Nuru", "Mero");
        System.out.println(objeto2);
        System.out.println("Variable estática: " +PersonaReto.getContadorPersonas());
        // Valor estático se puede acceder también desde contexto dinámico. MALA PRÁCTICA
        // Teniendo el getter no se puede realizar
        //System.out.println("Variable estática: " +objeto2.contadorPersonas);
    }
}
