import java.util.Scanner;
public class TablasPaso5 {

        public static Integer Tablas (int numero, int resultado){
            for(int i=1; i <=10; i++){
                resultado = numero * i;
                System.out.println( numero + " x "+ i + " = " + resultado );

            }return resultado;

        }

        public static void main(String[] args) {
        /* ejercicio paso#5
        Programa que calcula muestra  10 tablas de multiplicar*/

            int numero, resultado=0;
        try{
            for (int i = 1; i <=10 ; i++) {
                System.out.println("Ingrese un número");
                Scanner input= new Scanner(System.in);
                numero=input.nextInt();

                System.out.println("Tabla del " + numero);
                Tablas(numero, resultado);
            }

        }catch(Exception e){
            System.out.println("El valor ingresado no es correcto");

        }
        }

    }








