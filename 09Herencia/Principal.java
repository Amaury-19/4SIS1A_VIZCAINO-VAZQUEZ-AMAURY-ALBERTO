import java.util.Scanner;

public class Principal {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int op;
        
        //hago la instancia del animal perro
        perro dog = new perro();
        Gato cat = new Gato();
        Hamster raton = new Hamster();
        Conejo badbunny = new Conejo();
        Cuyo hamtaro = new Cuyo();
        Uron perezoso = new Uron();
        Pez nemo = new Pez();

        /*Quiero que se cree un menu mediante el cual el usuario pueda ingresar los datos de los animales:
         * 
         * 1.- Perro
         * 2.- Gato
         * 3.- Hamster
         * 4.- Conejo
         * 5.- Cuyo
         * 6.- Uron
         * 7.- Otro
         * 
         * Debera de poder ingresar cada uno de los datos y asi mismo deberan de entregar el diagrama de clases hecho en star uml aplicando la herencia correspondiente y el programa
        */
        System.out.println("CLINICA VETERINARIO *ANIMALITOS* ");
        System.out.println("")
        System.out.println("Elige la opcion correspondiente ");
        System.out.println(" 1 perro ");
        System.out.println(" 2 gato ");
        System.out.println(" 3 Hamster");
        System.out.println(" 4 Conejo ");
        System.out.println(" 5 Cuyo ");
        System.out.println(" 6 Uron ");
        System.out.println(" 7 Sorpresa ");
       
        op = entrada.nextInt();

        switch(op){
            case 1:
            dog.mostrarPerro();
            break;

            case 2:
            cat.mostrarGato();
            break;

            case 3:
            raton.mostrarHamster();
            break;

            case 4:
            badbunny.mostrarConejo();
            break;

            case 5:
            hamtaro.mostrarCuyo();
            break;

            case 6:
            perezoso.mostrarUron();
            break;

            case 7:
            nemo.mostrarPez();
            break;
        }
    }    
}