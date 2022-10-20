import java.util.Scanner;

public class Pez extends Animal {
    Scanner entrada = new Scanner(System.in);
    // aqui
    String alimento;

    public Pez() {

    }

    public Pez(String nombre, String raza, String tipo_alimento, int edad, String alimento) {
        // debo de poder acceder a la clase super
        super(nombre, raza, tipo_alimento, edad);
        this.alimento = alimento;
    }

    // recibir
    public String getalimento() {
        System.out.println("¿Que alimento le das a tu pez?");
        alimento = entrada.next();
        return alimento;
    }

    // enviar
    public void setalimento(String alimento) {
        this.alimento = alimento;
    }

    // el metodo propio del perro
    public void mostrarPez() {
        System.out.println(
                "El nombre del pez es: " + getNombre() + "\n" + "Su raza es: " + getRaza() + "\n" + "Se alimenta de: " +
                        getTipo_alimento() + "\n" + "Tiene la edad de: " + getEdad() + "\n"
                        + "alimento que le das a tu pez es : " + alimento);
    }
}