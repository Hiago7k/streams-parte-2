import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Main{
    static void main() {
        /*
        6 - Dado um objeto Pessoa com os campos nome e idade,
        filtre as pessoas com mais de 18 anos, extraia os nomes e
        imprima-os em ordem alfabética. A classe Pessoa está definida abaixo.
         */

        List<Pessoa> pessoas  = Arrays.asList(
            new Pessoa("Hiago", 21),
            new Pessoa("Ricardo", 20),
            new Pessoa("Gabriel", 18),
            new Pessoa("Jose", 10),
            new Pessoa("Fabio", 15),
            new Pessoa("Fernando", 16),
            new Pessoa("Tadeu", 17),
            new Pessoa("Jean", 26),
            new Pessoa("Pedro", 63)
        );

        pessoas.stream()
                .filter(p -> p.getIdade() > 18)
                .map(Pessoa::getNome)
                .sorted()
                .forEach(System.out::println);
    }
}
