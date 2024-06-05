import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome e sexo separados por , e - ex:nome-sexo,nome-sexo: ");
        String resposta = input.nextLine();

        List<String> pessoas = Arrays.asList(resposta.split(","));

        List<String> mulheres = pessoas.stream()
                .filter(pessoa -> pessoa.split("-")[1].equals("f"))
                .collect(Collectors.toList());

        mulheres.forEach(System.out::println);








    }
}
