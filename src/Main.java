import java.util.Arrays;
import java.util.List;

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


        listaDeNumeros.forEach(System.out::println);
    }
}
