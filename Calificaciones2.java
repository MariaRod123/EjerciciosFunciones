import java.util.Scanner;

public class Calificaciones2 {

    public static void main(String[] args) {

        int [] promedio= new int[20];
        float total=0;

        for(int i=0;i<20;++i)
        {
            System.out.print("Ingrese calificación del alumno "+ i + ": ");
            Scanner input= new Scanner(System.in);
            promedio[i]=input.nextInt();
            total= total + promedio[i];
        }
        System.out.println("Total es: "+total);
        total= total/20;
        System.out.println("Promedio general es: "+total);

        for(int i=19; i>=0; i--) {
            System.out.println("Alumno " + i + " su promedio es: " + promedio[i]);
        }
    }
}










