package lambda;

import java.util.List;
import java.util.stream.Stream;

public class ExemploSupplier {
    public static void main(String[] args) {
        List <String> listaSaudacao = Stream.generate(() -> "Olá Mundo").limit(5).toList();

        listaSaudacao.forEach(System.out::println);
    }
}
