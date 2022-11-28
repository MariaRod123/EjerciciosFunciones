import java.util.Scanner;
public class Tablas_multiplicar {

    public static Integer Tablas (int numero, int resultado){
        for(int i=1; i <=10; i++){
            resultado = numero * i;
            System.out.println( numero + " x "+ i + " = " + resultado );

        }return resultado;

    }

    public static void main(String[] args) {
        /* ejercicio paso#6
        Programa que calcula muestra la tabla de multiplicar de cualquier número*/

        int numero, resultado=0;

                System.out.println("Ingrese un número");
                Scanner input= new Scanner(System.in);
                numero=input.nextInt();

                System.out.println("Tabla del " + numero);
                Tablas(numero, resultado);

            }
    }






