import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Main{
    static void main() {
        /*
       7 - Você tem uma lista de objetos do tipo Produto, onde cada produto
        possui os atributos nome (String), preco (double) e categoria (String).
         Filtre todos os produtos da categoria "Eletrônicos" com preço menor
         que R$ 1000, ordene-ospelo preço em ordem crescente
          e colete o resultado em uma nova lista.
         */
        List<Produto> produtos = Arrays.asList(
                new Produto("Mouse Gamer", 199.00, "Eletrónicos"),
                new Produto("Teclado Mecanico", 299.00, "Eletrónicos"),
                new Produto("Livro Entendo Algoritmos", 65.00, "Livros"),
                new Produto("Sofas", 2350.00, "Moveis"),
                new Produto("Monitor Gamer", 3299.00, "Eletrónicos"),
                new Produto("Pc Gamer", 7299.00, "Eletrónicos")
        );

        produtos.stream()
                .filter(p -> p.getCategoria().equalsIgnoreCase("Eletrónicos"))
                .filter(p -> p.getPreco() <= 1000)
                .sorted(Comparator.comparing(Produto::getPreco))
                .limit(2)
                .map(Produto::getNome)
                .forEach(System.out::println);
    }
}
