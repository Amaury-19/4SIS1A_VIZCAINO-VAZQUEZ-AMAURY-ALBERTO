/*
 * 
 *VAMOS A VER COMO PODER HACER INSTANCIAS PARA LA ENTRADA Y SALIDA DE INFORMACION DE UN PROGRAMA EN JAVA
 * 
 * 
 *
 */

class EntradaTexto{
    //metodo principal

    public static void main(String[] args) {
        //estructura basica
        //declaracion de variables
        String nombre;
        //mensaje para el usuario
        System.out.println("Por favor introduce tu nombre");
        //Ln es salto de linea

        nombre = System.console().readLine();

        //tenemos que concatenar los elementos

        System.out.println("Hola" + nombre + "Bienvenido a la tronadera");
    
    }

}