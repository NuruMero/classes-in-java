package animales;

public class Animal {
    protected void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }

    public void comer() {
        System.out.println("Como muchas veces al día");
    }

    protected void dormir() {
        System.out.println("Duermo muchas horas");
    }
}

class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro hace guau");
    }

    @Override
    protected void dormir() {
        System.out.println("Duermo 15 horas al día");
        System.out.println("Método clase padre:");
        super.dormir();
    }
}

class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El gato hace miau");
    }
}

class PruebaAnimal {
    public static void main(String[] args) {
        //System.out.println("*** Ejemplo de Herencia ***");
        //System.out.println("Clase Padre, soy un Animal");
        //var animal1 = new Animal();
        //animal1.comer();
        //animal1.dormir();
        // animal1.hacerSonido(); // este metodo no existe en la clase padre

        //System.out.println("\n Clase Hija, soy un Perro");
        //var perro1 = new Perro();
        //perro1.comer();
        //perro1.dormir();
        //perro1.hacerSonido();

        var animal = new Gato();
        imprimirSonido(animal);
    }

    // Metodo polimorfico
    static void imprimirSonido(Animal animal) {
        animal.hacerSonido();
    }
}