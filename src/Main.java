import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Main{
    static void main() {
       /* 5 - Dada a lista de sublistas de números inteiros abaixo,
        extraia todos os números primos em uma única lista e os ordene em ordem crescente.
                */
                List<List<Integer>> listaDeNumeros = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(5, 6, 7, 8),
                Arrays.asList(9, 10, 11, 12)
        );

       List<Integer>  listaGlobal =  listaDeNumeros.stream()
                .flatMap(l -> l.stream())
                .collect(Collectors.toList());

        listaGlobal.forEach(System.out::println);

        System.out.println("Após Agrupar as listas, em uma apenas");
        System.out.println("Para exibir numeros pares");

        listaGlobal.stream()
                .filter(l ->  l % 2 == 0)
                .forEach(System.out::println);

    }
}
