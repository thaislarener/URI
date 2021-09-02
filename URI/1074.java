
/*Leia um valor inteiro N. Este valor será a quantidade de valores 
que serão lidos em seguida. Para cada valor lido, mostre uma mensagem 
em inglês dizendo se este valor lido é par (EVEN), ímpar (ODD), positivo 
(POSITIVE) ou negativo (NEGATIVE). No caso do valor ser igual a zero (0), 
embora a descrição correta seja (EVEN NULL), pois por definição zero é 
par, seu programa deverá imprimir apenas NULL.*/
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        int n, x;

        Scanner leia = new Scanner(System.in);

        n = leia.nextInt();
        for (int i = 0; i < n; i++) {
            x = leia.nextInt();
            if (x == 0)
                System.out.printf("NULL\n");
            else if (x > 0) {
                if (x % 2 == 0)
                    System.out.printf("EVEN POSITIVE\n");
                else
                    System.out.printf("ODD POSITIVE\n");
            } else if (x < 0) {
                if (x % 2 == 0)
                    System.out.printf("EVEN NEGATIVE\n");
                else
                    System.out.printf("ODD NEGATIVE\n");
            }
        }
    }

}