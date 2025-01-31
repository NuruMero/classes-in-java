package aritmetica;

public class Aritmetica {
    private int operando1;
    private int operando2;

    // Constructor vacío
    public Aritmetica() {
        System.out.println("Ejecutando constructor vacío");
    };

    // Constructor con argumentos
    public Aritmetica(int op1, int op2) {
        System.out.println("Ejecutando constructor complejo");
        this.operando1 = op1;
        this.operando2 = op2;
    }

    public int getOperando1() {
        return operando1;
    }

    public int getOperando2() {
        return operando2;
    }

    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }

    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }

    // Métodos funcionales

    public void sumar() {
        var resultado = this.operando1 + this.operando2;
        System.out.println("Resultado suma: " +resultado);
    }

    public void restar() {
        var resultado = this.operando1 - this.operando2;
        System.out.println("Resultado resta: " +resultado);
    }
}
