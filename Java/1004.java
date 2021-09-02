
/*Leia dois valores inteiros. A seguir, calcule o produto entre 
estes dois valores e atribua esta operação à variável PROD. 
A seguir mostre a variável PROD com mensagem correspondente.*/
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        int a, b, x;
        Scanner leia = new Scanner(System.in);

        a = leia.nextInt();
        b = leia.nextInt();
        x = a * b;

        System.out.printf("PROD = %d\n", x);

    }

}
