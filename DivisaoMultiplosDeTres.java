public class DivisaoMultiplosDeTres {
    public static void main(String[] args) {
        double resultadoDouble;
        int resultadoInt;
        // verifica os multiplos de 3
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                // se for divisivel por 3 vai dividir por 2
                 resultadoInt = i / 2;
                 resultadoDouble = i / 2.0;
                // Exibe os resultados
                System.out.println("Número: " + i + " | int: " + resultadoInt + " |  double: " + resultadoDouble);
            }
        }
    }
}
