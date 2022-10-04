/**Vamos a crear los 14 programas dentro de un menu de seleccion de la tarea, comprendido por:
 * 1.- Bono o descuento por edad
 * 2.- Convertir numeros decimales a binarios
 * 3.- convertir temperaturas
 * 4.- Numero de positivos y negativos
 * 5.- Tienda
 * 6.- Area y Perimetro
 * 7.- Tabla
 * 8.- Factorial
 * 9.- Dibujitos
 * 10.- Figura hueca
 * 11.- Patrones
 * 12.- Diamante
 * 13.- Calculadora
 * 14.- Salir
 */

import java.util.Base64;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
import javax.security.auth.x500.X500Principal;
import javax.smartcardio.CardException;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

class EstructuraDatos {

    public static void main(String[] args){
        //objetos
        Scanner entrada = new Scanner(System.in);

        //aqui van a ir las variables
        int opcion, numbinario, edad, numero, figuras, opcion3, base, altura, area, perimetro, volumen, ladotrian, radio, factorial = 1, i, j, total, cantidadprod ;
        char letra, letra1;
        String binario = "";
        String Nombreproducto
        float temperatura, conversion, precio;

        do{
            System.out.println("Bienvenido al programa de las tareas que son para el lunes a las 7 am wiii (n_n)/");
            System.out.println("Por favor elija la opcion deseada: ");
            System.out.println("1.- Descuento por edad ");
            System.out.println("2.- Convertir numero decimal a binario ");
            System.out.println("3.- Conversiones de temperatura ");
            System.out.println("4.- Numeros Positivos y Negativos ");
            System.out.println("5.- Tienda ");
            System.out.println("6.- Area y Perimetro ");
            System.out.println("7.- Tabla ");
            System.out.println("8.- Factorial ");
            System.out.println("9.- Dibujos de codigo ");
            System.out.println("10.- Figura Hueca ");
            System.out.println("11.- Patrones de Codigo ");
            System.out.println("12.- Diamante ");
            System.out.println("13.- Calculadora ");
            System.out.println("14.- Salir ");

            //obtener la respuesta del usuario
            opcion = entrada.nextInt();

            //menu
            switch(opcion){
                case 1:
                    //Descuentos por edad
                    System.out.println("<Ingrese su edad");
                    edad = entrada.nextInt();
                    
                    int descuento = 0;
                    int costo = 1000;
                    
                    if(edad>65){
                        descuento = (int) (costo * 0.1);
                    }else if(edad > 21 && edad <65) {       
                       descuento = 0;
                    } else {
                        if(edad < 21){
                        descuento = (int) (costo * 0.45);
                        }
                    }

                    System.out.println("<El monto a pagar es de $" + (costo - descuento));
                    break;

                    
                case 2:
                    //convertir numero a binario
                    System.out.println("Ingrese un numero positivo entero que desee convertir a binario");
                    numbinario = entrada.nextInt();

                    //tenemos que saber si es positivo
                    if(numbinario > 0){
                        //realizar el algotimo con el mod 2 
                        while(numbinario > 0){
                            if(numbinario%2 == 0){
                                binario ="0" + binario;
                            }else{
                                binario ="1" + binario;
                            }
                            numbinario = (int)numbinario/2;
                        }
                    }else if(numbinario == 0){
                        binario = "0";
                    }else{
                        binario = "No se pudo convertir el numero, ingrese solo positivos";
                    }
                    System.out.println("El numero convertido a binario es: " + binario);
                    break;


                case 3:
                //Conversos de temperaturas
                System.out.println("<Ingrese temperatura en grados Fahrenheit");
                temperatura = entrada.nextInt();
                int opcion1;

                
                Scanner T = new Scanner(System.in); 

                do{
                    System.out.println("Elija la temperatura a la que desea convertir: ");
                    System.out.println("1.- Grados Celsius ");
                    System.out.println("2.- Grados Kelvin ");
                    System.out.println("3.- Grados Rankine ");

                    opcion1 = entrada.nextInt();

                }while(opcion1 > 3 );
                switch(opcion1){

                    case 1:
                        //Grados Celsius
                    System.out.println("<Ingrese la temperatura grados Fahrenheit a convertir en grados Celsius ");
                    opcion1 = entrada.nextInt();

                    System.out.println("La temperatura en grados Celsius es " + (conversion = (int) (((temperatura - 32))/1.8)));
                    
                
            
                    break;

                    case 2  :
                        //Grados Kelvin
                    System.out.println("<Ingrese la temperatura grados Fahrenheit a convertir en grados Kelvin");
                    opcion1 = entrada.nextInt();

                    System.out.println("La temperatura en grados Kelvin es " + (conversion = (int) (((temperatura + 459.67))/1.8)));

                    break;

                    case 3    :
                        //Grados Rankine
                    System.out.println("<Ingrese la temperatura grados Fahrenheit a convertir en grados Kelvin");
                    opcion1 = entrada.nextInt();

                    System.out.println("La temperatura en grados Kelvin es " + (conversion = (int) ((temperatura - 32 ) + 491.67)));

                    break;
                }
                
                
                
                case 4:
                    //Contador de numeros positivos y negativos
                    //System.out.println("Introduce un numero");
                    //numero = sc.nextInt();
                    
                    //if (numero != 0) {
                        //if (numero > 0) {
                            //System.out.print("Positivo");
                       // } else {
                         //   System.out.print("Negativo");
                        //}
                        
                    
                    //System.out.print("Desea introducir más números? (S/N): ");                                  
                    // respuesta = (char) System.in.read();

                    //while (respuesta != 'N' && respuesta != 'n');
                
                    //}


                    break;    


                case 5:

                System.out.println("Bienvenido a la tienda Kwaii");
                System.out.println("Ingrese cuantos elementos va a comprar");
                total = entrada.nextInt();

                for(int i = 1; i <=total; i++){
                    System.out.println("Ingresa el nombre del producto");
                    Nombreproducto = entrada.next()
                    System.out.println("Ingresa el precio del producto");
                    System.out.println("Ingresa la cantidad");



                }








                    break;



                case 6:
                    //AREAS, PERIMETROS Y VOLUMEN
                    Scanner F = new Scanner(System.in);
                  
                    do{
                        System.out.println("Seleccione la figura que desea calcular: ");
                        System.out.println("1.- Rectangulo / Area y Perimetro ");
                        System.out.println("2.- Triangulo / Area y Perimetro ");
                        System.out.println("3.- Esfera / Volumen ");
                        System.out.println("4.- Cilindro / Volumen ");
                    
                        opcion3 = entrada.nextInt();


                   }while(opcion3 > 4);

                   switch(opcion3){
                    case 1:
                    //Rectangulo Area y Perimetro
                    System.out.println("Ingrese el valor de la base");
                    base = entrada.nextInt();
                    System.out.println("Ingrese el valor de la altura");
                    altura = entrada.nextInt();
                    System.out.println("EL area del rectangulo es: " + (perimetro = base * altura)); 
                    System.out.println("EL perimetro del rectangulo es: " + (perimetro = 2 * base * 2 * altura)); 
                    break;

                    case 2:
                    //Triangulo / Area y Perimetro
                    System.out.println("Ingrese el valor de la base");
                    base = entrada.nextInt();
                    System.out.println("Ingrese el valor de la altura");
                    altura = entrada.nextInt();
                    System.out.println("Ingrese el valor del lado del triangulo");
                    ladotrian = entrada.nextInt();
                    System.out.println("El area del triangulo es: " + ((base * altura)/2));
                    System.out.println("El perimetro del triangulo es :" + (base + ladotrian + ladotrian));
                    break;


                    case 3:
                    //Volumen esfera
                    System.out.println("Ingrese el valor de radio");
                    radio = entrada.nextInt();
                    System.out.println("El volumen de la esfera es:" + ((4/3) * Math.PI * radio*radio*radio));
                    break;


                    case 4:
                    //Volumen cilindro
                    System.out.println("Ingresa el valor del radio");
                    radio = entrada.nextInt();
                    System.out.println("Ingreasa el valor de la altura");
                    altura = entrada. nextInt();
                    System.out.println("El valor del volumen del cilindro es" + (Math.PI * radio * radio * altura));
                    break;

                   }

                    


                    break;
                case 7:
                    for(int n = 1; n<=10; n++){
                        System.out.println(n + " " +(n*10) + " " + (n*100) + " " +(n*1000) );
                    }
                    break;

                case 8:
                //Factorial numeros positivos

                System.out.println("Ingrese el numero al que se desea calcular su factorial:");
                    numero = entrada.nextInt();
                    for(i = 1; i<=numero; i++){
                        factorial = factorial * i;
                    }

                    System.out.println("El factorial del numero " + numero + " es: " + factorial);

                break;

                
                case 9:
                //Cuadrado asteriscos

                System.out.println("Ingrese el numero para formar el cuadrado: ");
                numero =entrada.nextInt();

                for(i = 1; i<=numero; i++){
                    for(j = 1; j<=numero; j++){

                        System.out.print(" * ");
                    }
                    System.out.println();

                }

                
                break;

                case 10:
                break;

                case 11:
                break;

                case 12:
                break;

                case 13:
                break;
            }

            System.out.println("Deseas repetir el programa, escribe s para si");
            letra = entrada.next().charAt(0);



        }while(letra == 's' || letra == 'S' );

    }
    
}   