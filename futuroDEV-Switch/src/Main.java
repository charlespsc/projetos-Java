import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um valor entre 1 e 3:");
        int valor = entrada.nextInt();
        switch (valor) {
            case 1:
                System.out.println("Escolha nº 1");
                break;
            case 2:
                System.out.println("Escolha nº 2");
                break;
            case 3:
                System.out.println("Escolha nº 3");
                break;
            default:
                System.out.println("Opção Inválida!");
        }
    }
}