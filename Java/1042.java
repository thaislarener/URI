
/*Leia 3 valores inteiros e ordene-os em ordem crescente. 
No final, mostre os valores em ordem crescente, uma linha 
em branco e em seguida, os valores na sequência como foram lidos.*/
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        int a, b, c, aux;
        int a2, b2, c2;

        Scanner leia = new Scanner(System.in);
        a = leia.nextInt();
        b = leia.nextInt();
        c = leia.nextInt();

        a2 = a;
        b2 = b;
        c2 = c;

        if (a > b) {
            aux = a;
            a = b;
            b = aux;
        }

        if (b > c) {
            aux = b;
            b = c;
            c = aux;
        }

        if (a > b) {
            aux = a;
            a = b;
            b = aux;
        }

        System.out.printf("%d\n%d\n%d\n\n", a, b, c);
        System.out.printf("%d\n%d\n%d\n", a2, b2, c2);

    }

}