import java.util.Scanner;
public class PotenciaEnesima2 {
    // programa que calcula la potencia enesima de un número entero cualquiera y exponente positivo

    public static Integer Potencia(int base, int exponente) {

        int contador=1, potencia=1; 

        while(contador <= exponente){
            potencia = potencia * base;
            contador++;

        }return potencia;
    }

    public static void main(String[] args) {

        int base, exponente;

        System.out.println("Ingrese base:");
        Scanner input= new Scanner(System.in);
        base=input.nextInt();
        System.out.println("Ingrese exponente:");
        exponente=input.nextInt();

        System.out.println(Potencia(base,exponente));

    }
}
