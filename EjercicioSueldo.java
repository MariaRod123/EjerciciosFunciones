import java.util.Scanner;
public class EjercicioSueldo {

/*función que hace el cáculo del sueldo con aumento*/
    public static Float Salario(float sueldo, float total){

        if(sueldo < 1000){
            float aumento=0.15f;
            total = (sueldo * aumento) + sueldo ;
            System.out.println("Liquido a cobrar: " + total);
        }else if(sueldo >= 1000){
            float aumento=0.12f;
            total = (sueldo * aumento) + sueldo ;
            System.out.println("Liquido a cobrar: " + total);
        }return total;
    }

    public static void main(String[] args) {
        /*Programa que calcula el sueldo de un trabajador aplicando aumento del 15% si es inferior a $1000;
        * si es mayor o igual a $1000 el aumento es del 12%
        */
        float total=0;
        System.out.println("Ingrese sueldo");
        Scanner sue= new Scanner(System.in);
        float sueldo = sue.nextFloat();

        //llama a la funcion que calcula el sueldo
        Salario(sueldo, total);

    }

}




