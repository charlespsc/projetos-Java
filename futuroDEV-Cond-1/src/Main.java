import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua idade:");

        int idade = entrada.nextInt();

        if (idade < 16) {
            System.out.println("Não pode Votar!");
        } else if (idade >= 18 && idade <= 70) {
            System.out.println("Obrigatório Votar!");
        } else {
            System.out.println("Voto Facultativo!");
        }
    }
}