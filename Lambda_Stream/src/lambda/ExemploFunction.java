package lambda;

import java.util.Arrays;
import java.util.List;

public class ExemploFunction {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> numerosDobro = numeros.stream().map(n -> n*2).toList();

        numerosDobro.forEach(System.out::println);
    }
}
