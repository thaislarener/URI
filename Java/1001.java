
/*Leia 2 valores inteiros e armazene-os nas variáveis A e B.
Efetue a soma de A e B atribuindo o seu resultado na variável X.
Imprima X conforme exemplo apresentado abaixo. Não apresente 
mensagem alguma além daquilo que está sendo especificado e não 
esqueça de imprimir o fim de linha após o resultado, caso contrário, 
você receberá "Presentation Error".*/
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        int a, b, x;
        Scanner leia = new Scanner(System.in);

        a = leia.nextInt();
        b = leia.nextInt();
        x = a + b;

        System.out.printf("X = %d\n", x);

    }

}