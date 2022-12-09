import java.util.Scanner;

public class Paso11 {

    public static void main(String[] args) {

        int n,num=0,empleado;
        float sueldo, mayor_sueldo=0;
        System.out.print("Ingrese cantidad de empleados: ");
        Scanner entrada=new Scanner(System.in);
        n=entrada.nextInt();

        for(int i=1;i<=n;++i)
        {
            System.out.print("Ingrese número de empleado: ");
            empleado=entrada.nextInt();

            System.out.print("Ingrese sueldo del empleado: ");
            sueldo=entrada.nextInt();


            if(sueldo > mayor_sueldo)
            {
                mayor_sueldo = sueldo;
                num = empleado;

            }
        }
        System.out.println("Empledo con mayor sueldo : \n numero: " + num + "\nsueldo: " + mayor_sueldo);
    }

    }






















