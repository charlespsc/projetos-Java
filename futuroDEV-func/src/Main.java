//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int soma = somaValores(5, 9);
        System.out.println(soma);
    }

    public static int somaValores(int valor1, int valor2) {
        int soma = valor1 + valor2;
        return soma;
    }
}