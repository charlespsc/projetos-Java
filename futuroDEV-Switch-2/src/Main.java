import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um valor entre 1 e 4:");
        int valor = entrada.nextInt();
        switch (valor) {
            case 1:
                System.out.println("Produto sem Lactose");
                break;
            case 2:
                System.out.println("Produto sem Glúten");
                break;
            case 3:
                System.out.println("Produto sem Farinha");
                break;
            case 4:
                System.out.println("Produto Vencido");
                break;
            default:
                System.out.println("Opção Inválida!");
        }
    }
}