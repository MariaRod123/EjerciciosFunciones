public class SerieNumerica {

    public static void main(String[] args) {
        int valor_inicial=0;

        for (int i = 0; i <= 719; i++) {

            if (i % 2 == 0) {
                valor_inicial =  valor_inicial + 2;   // si la posición es par le sumo 2 para obtener el siguiente valor

            } else {
                valor_inicial = valor_inicial + 3; //si la posición es impar le sumo 3

            }System.out.println(valor_inicial);

        }
    }
}





