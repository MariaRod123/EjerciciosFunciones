import java.util.Scanner;

public class Calificaciones {

    public static void main(String[] args) {
        int matricula, calificacion;
        float promedio = 0;

        System.out.print("Ingrese matrícula del alumno: ");
        Scanner input = new Scanner(System.in);
        matricula = input.nextInt();


        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese calificación " + i + ": ");
            calificacion = input.nextInt();
            promedio += calificacion;
        }
        promedio = promedio / 5;

        if (promedio >= 6) {
            System.out.println("\nMatrícula = " + matricula + "\nPromedio = " + promedio + "\nAprobado");
        } else {
            System.out.println("\nMatrícula = " + matricula + "\nPromedio = " + promedio + "\nNo Aprobado");
        }
    }
}



























