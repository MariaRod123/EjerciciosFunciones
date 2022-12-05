import java.util.Scanner;
public class PotenciaEnesima {
    //programa que calcula la potencia enesima de un número entero cualquiera y exponente positivo

    public static Integer Potencia(int base, int exponente) {
        int potencia = 1;

            if (exponente == 0) {
                potencia=1;

            } else if (base == 0 && exponente >= 1) {
                potencia = 0;

            }
            else {
                for (int i = 1; i <= exponente; i++) {
                    potencia = potencia * base;
                }
            }
            return potencia;
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
