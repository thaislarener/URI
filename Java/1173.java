//Leia um valor e faça um programa que coloque o valor lido na
// primeira posição de um vetor N[10]. Em cada posição subsequente,
// coloque o dobro do valor da posição anterior. Por exemplo, se o 
//valor lido for 1, os valores do vetor devem ser 1,2,4,8 e assim 
//sucessivamente. Mostre o vetor em seguida.
import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        int n;
        int v[];
        v = new int[10];

        Scanner leia = new Scanner(System.in);
        n = leia.nextInt();

        for(int i = 0; i < 10; i++){
            v[i] = n;
            n = 2*n;
            System.out.printf("N[%d] = %d\n", i, v[i]);
        }   
    }
 
}