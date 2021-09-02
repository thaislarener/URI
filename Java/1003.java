
/*Leia dois valores inteiros, no caso para variáveis A e B. 
A seguir, calcule a soma entre elas e atribua à variável SOMA. 
A seguir escrever o valor desta variável.*/
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        int a, b, x;
        Scanner leia = new Scanner(System.in);

        a = leia.nextInt();
        b = leia.nextInt();
        x = a + b;

        System.out.printf("SOMA = %d\n", x);

    }

}
