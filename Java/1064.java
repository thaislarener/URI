
/*Leia 6 valores. Em seguida, mostre quantos destes valores digitados 
foram positivos. Na próxima linha, deve-se mostrar a média de todos os 
valores positivos digitados, com um dígito após o ponto decimal.*/
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        float media = 0, v[];
        int pos = 0;

        Scanner leia = new Scanner(System.in);

        v = new float[6];
        for (int i = 0; i < 6; i++) {
            v[i] = leia.nextFloat();
            if (v[i] > 0) {
                pos++;
                media = media + v[i];
            }
        }
        media = media / pos;
        System.out.printf("%d valores positivos\n", pos);
        System.out.printf("%.1f", media);

    }

}