
/*Leia um valor inteiro N. Apresente todos os números entre 
1 e 10000 que divididos por N dão resto igual a 2.*/
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        int n;

        Scanner leia = new Scanner(System.in);
        n = leia.nextInt();

        for (int i = 1; i <= 10000; i++) {
            if (i % n == 2)
                System.out.printf("%d\n", i);
        }
    }

}