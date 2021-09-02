
/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma 
mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os 
valores lidos são múltiplos entre si.*/
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        int a, b;

        Scanner leia = new Scanner(System.in);
        a = leia.nextInt();
        b = leia.nextInt();

        if ((a % b == 0) || (b % a == 0))
            System.out.printf("Sao Multiplos\n");
        else
            System.out.printf("Nao sao Multiplos\n");
    }

}