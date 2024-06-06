package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ExemploPredicate {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Rodrigo", "Ramon", "Bete", "Jessyka");

        Predicate<String> palavrasPersonalizadas = palavra -> palavra.length() > 5;

        palavras.stream().filter(p -> p.length() > 5).forEach(System.out::println);
    }
}
