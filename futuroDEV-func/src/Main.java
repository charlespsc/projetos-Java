//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Mostrando mensagem da função:");
        mostratMensagem();

        System.out.println("Função somaValores, passando parâmetros:");
        somaValores(5, 9);
    }

    public static void mostratMensagem() {
        System.out.println("Minha primeira função!");
    }

    public static void somaValores(int valor1, int valor2) {
        int soma = valor1 + valor2;
        System.out.println(soma);
    }
}