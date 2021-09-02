
/*Leia um valor inteiro N. Este valor será a quantidade de valores 
inteiros X que serão lidos em seguida. Mostre quantos destes valores 
X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, 
mostrando essas informações.*/
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        int v[], n;
        int in = 0, out = 0;

        Scanner leia = new Scanner(System.in);

        n = leia.nextInt();
        v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = leia.nextInt();
            if (v[i] >= 10 && v[i] <= 20)
                in++;
            else
                out++;

        }
        System.out.printf("%d in\n", in);
        System.out.printf("%d out\n", out);

    }

}