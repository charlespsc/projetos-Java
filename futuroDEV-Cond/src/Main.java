import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua idade:");

        int idade = entrada.nextInt();

        if (idade >= 18) {
            System.out.println("Pode Dirigir");
        } else {
            System.out.println("Não pode Dirigir");
        }
    }
}