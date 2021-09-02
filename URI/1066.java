
/*Leia 5 valores Inteiros. A seguir mostre quantos valores digitados 
foram pares, quantos valores digitados foram ímpares, quantos valores 
digitados foram positivos e quantos valores digitados foram negativos.*/
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        int v[];
        int pos = 0, neg = 0;
        int imp = 0, par = 0;

        Scanner leia = new Scanner(System.in);

        v = new int[5];
        for (int i = 0; i < 5; i++) {
            v[i] = leia.nextInt();
            if (v[i] != 0) {
                if (v[i] > 0)
                    pos++;
                else
                    neg++;
            }
            if (v[i] % 2 == 0)
                par++;
            else
                imp++;
        }
        System.out.printf("%d valor(es) par(es)\n", par);
        System.out.printf("%d valor(es) impar(es)\n", imp);
        System.out.printf("%d valor(es) positivo(s)\n", pos);
        System.out.printf("%d valor(es) negativo(s)\n", neg);

    }

}