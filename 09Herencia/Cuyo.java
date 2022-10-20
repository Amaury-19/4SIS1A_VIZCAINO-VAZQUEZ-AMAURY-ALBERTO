
import java.util.Scanner;

public class Cuyo extends Animal {
    Scanner entrada = new Scanner(System.in);
    // aqui
    String enfermo;

    public Cuyo() {

    }

    public Cuyo(String nombre, String raza, String tipo_alimento, int edad, String enfermo) {
        // debo de poder acceder a la clase super
        super(nombre, raza, tipo_alimento, edad);
        this.enfermo = enfermo;
    }

    // recibir
    public String getenfermo() {
        System.out.println("¿Tu cuyo esta muy enfermo?");
        enfermo = entrada.nextLine();
        return enfermo;
    }

    // enviar
    public void setenfermo(String enfermo) {
        this.enfermo = enfermo;
    }

    // el metodo propio del perro
    public void mostrarCuyo() {
        System.out.println("El nombre del cuyo es: " + getNombre() + "\n" + "Su raza es: " + getRaza() + "\n"
                + "Se alimenta de: " +
                getTipo_alimento() + "\n" + "Tiene la edad de: " + getEdad() + "\n" + "la enfermedad es : " + enfermo);
    }

}