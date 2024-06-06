package lambda;

import java.util.Arrays;
import java.util.List;

public class ExemploBinaryOperator {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        //int resultado = numeros.stream().reduce(0, Integer::sum);
        int resultado = numeros.stream().reduce(0, (n1, n2) -> n1+n2);

        System.out.println(resultado);

    }
}
