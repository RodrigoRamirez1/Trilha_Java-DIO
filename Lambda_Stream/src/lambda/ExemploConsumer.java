package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExemploConsumer {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        Consumer<Integer> numerosPares = numero -> {
            if (numero % 2 == 0){
                System.out.println(numero);
            }
        };

        numeros.stream().forEach(numerosPares);

        //numeros.stream().filter(n -> n % 2 ==0).forEach(System.out::println);
    }
}
