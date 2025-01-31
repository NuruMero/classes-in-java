package prueba;

import aritmetica.Aritmetica;

public class PruebaAritmetica {

    public static void main(String[] args) {
        System.out.println("*** Ejemplo Aritmetica ***");
        var aritmetica1 = new Aritmetica(5,7);
        aritmetica1.sumar();
        aritmetica1.restar();
        System.out.println("Dir. Mem. obj1: " +aritmetica1);

        var aritmetica2 = new Aritmetica();
        aritmetica2.setOperando1(12);
        aritmetica2.setOperando2(16);
        aritmetica2.sumar();
        aritmetica2.restar();
        System.out.println("Dir. Mem. obj2: " +aritmetica2);
    }
}
