import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y, media;

        System.out.println("Digite o primeiro número: ");
        x = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        y = sc.nextDouble();

        media = (x + y) /2.0;

        System.out.println("Média = " + media);
        sc.close();
    }
}
