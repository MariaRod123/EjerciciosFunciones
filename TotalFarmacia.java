import java.util.Scanner;
public class TotalFarmacia {

        /*función que hace el cáculo del total a pagar en la farmacia cuando se hace ciertos descuentos*/
        public static Float Pago_total(float subtotal, float total){

            if(subtotal>0 &&  subtotal <= 500){
                //en este caso no aplica descuento
                total = subtotal;
                System.out.println("Total a pagar: " + total);
            }else if(subtotal >= 501 && subtotal <= 1000 ){
                float descuento=0.05f;
                total = subtotal - (subtotal * descuento);
                System.out.println("Total a pagar: " + total);
            }else if( subtotal >= 1001 && subtotal <=7000){
                float descuento=0.11f;
                total = subtotal - (subtotal * descuento);
                System.out.println("Total a pagar: " + total);
            }else if( subtotal >= 7001 &&  subtotal <= 15000){
                float descuento=0.18f;
                total = subtotal - (subtotal * descuento);
                System.out.println("Total a pagar: " + total);
            }else{
                float descuento=0.25f;
                total = subtotal - (subtotal * descuento);
                System.out.println("Total a pagar: " + total);
            }
            return total;
        }

        public static void main(String[] args) {
            /*Programa que calcula el total a pagar en la farmacia si se aplican los siguientes descuentos:
            0-500 -->0% descuento
            501-1000 --> 5%
            1001-7000 --> 11%
            7001-15000 --> 18%
            15001 en adelante --> 25%
             */
            float subtotal=0;
            float total=0;
            System.out.println("Ingrese subtotal de la boleta");
            Scanner subtot= new Scanner(System.in);
            subtotal = subtot.nextFloat();

            //llama a la funcion que calcula el total a pagar 
            Pago_total(subtotal, total);

        }

    }

