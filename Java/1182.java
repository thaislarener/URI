
/*Neste problema você deve ler um número, indicando uma linha da matriz na 
qual uma operação deve ser realizada, um caractere maiúsculo, indicando a 
operação que será realizada, e todos os elementos de uma matriz M[12][12].
Em seguida, calcule e mostre a soma ou a média dos elementos que estão na 
área verde da matriz, conforme for o caso. A imagem abaixo ilustra o caso 
da entrada do valor 2 para a linha da matriz, demonstrando os elementos que
deverão ser considerados na operação.A primeira linha de entrada contem um 
número L (0 ≤ L ≤ 11) indicando a linha que será considerada para operação.
A segunda linha de entrada contém um único caractere Maiúsculo T ('S' ou 'M'),
indicando a operação (Soma ou Média) que deverá ser realizada com os elementos
da matriz. Seguem os 144 valores de ponto flutuante que compõem a matriz, sendo
que a mesma é preenchida linha por linha, da linha 0 até a linha 11, sempre da
 esquerda para a direita.*/
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        float m[][] = new float[12][12];
        float soma = 0, media = 0;
        int coluna;
        String tipo, som = "S", med = "M";

        Scanner leia = new Scanner(System.in);
        coluna = leia.nextInt();
        tipo = leia.next();

        for (int i = 0; i < 12; i++)
            for (int j = 0; j < 12; j++)
                m[i][j] = leia.nextFloat();

        if (tipo.equals(som)) {
            for (int i = 0; i < 12; i++)
                soma += m[i][coluna];
            System.out.printf("%.1f\n", soma);
        }

        else if (tipo.equals(med)) {
            for (int i = 0; i < 12; i++)
                media += m[i][coluna];
            media = media / 12;
            System.out.printf("%.1f\n", media);
        }
    }
}