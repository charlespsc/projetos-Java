import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade;
        float peso;
        char sexo;

        System.out.print("Digite a sua idade: ");
        idade = entrada.nextInt();

        System.out.print("Digite o seu peso: ");
        peso = entrada.nextFloat();

        System.out.print("Digite o seu sexo (M - Masculino, F - Feminino, O - Outros): ");
        sexo = entrada.next().charAt(0);

        System.out.print("Olá, sua idade é " + idade + " anos, seu peso é " + peso + " Kg e seu sexo é " + sexo + ".");
    }
}