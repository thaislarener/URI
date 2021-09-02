
/*Leia um valor inteiro N. Apresente o quadrado de cada um dos 
valores pares, de 1 até N, inclusive N, se for o caso.*/
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        int n, x = 2;

        Scanner leia = new Scanner(System.in);

        n = leia.nextInt();

        while (x <= n) {
            System.out.printf("%d^2 = %d\n", x, x * x);
            x += 2;
        }

    }

}