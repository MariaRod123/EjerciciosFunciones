import java.util.Scanner;
public class Paso9 {

    public static void main(String[] args) {
        /* programa que muestra cual es el número mayor y menor de N números*/

        int num;
        int n;
        int mayor=0;
        int cont;
        int menor=0;

        System.out.println("Insertar cantidad máxima de números a comparar: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        for(cont = 0; cont < n; cont++ ){
            System.out.println("Inserte un número: ");
            num = input.nextInt();

            if(cont == 0){
                mayor = num;
                menor=num;
            }
            if(num > mayor)
            {
                mayor = num;
            }
            if(num < menor){
                menor=num;
            }

        }System.out.println("El MAYOR número ingresado es:  " + mayor + " El MENOR es : " + menor);
    }
}
