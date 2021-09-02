
/*Leia quatro valores inteiros A, B, C e D. A seguir, calcule 
e mostre a diferença do produto de A e B pelo produto de C 
e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        int a, b;
        int c, d;
        int x;
        Scanner leia = new Scanner(System.in);

        a = leia.nextInt();
        b = leia.nextInt();
        c = leia.nextInt();
        d = leia.nextInt();
        x = (a * b) - (c * d);

        System.out.printf("DIFERENCA = %d\n", x);

    }

}
