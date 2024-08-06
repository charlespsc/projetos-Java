//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int numero;

        numero = 1;

        while (numero <= 5) {
            System.out.println("Valor: " + numero);
            //numero = numero + 1; (não usamos mais assim!)
            numero++;
        }

        for (int i = 0; i <= 5; i++) {
            System.out.println("Valor: " + i);
        }
    }
}